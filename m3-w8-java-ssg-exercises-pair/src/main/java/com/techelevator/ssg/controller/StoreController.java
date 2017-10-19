package com.techelevator.ssg.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;
import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ShoppingCart;

@Controller
@RequestMapping("/shoppingCart")
@SessionAttributes("cart")


public class StoreController {
	
	@Autowired
	ProductDao productDao;
	
	
	@RequestMapping(path={"/index"}, method=RequestMethod.GET) 
	public String displayIndex(ModelMap modelHolder) {
		List<Product> productsList = productDao.getAllProducts();
		modelHolder.put("allProducts", productsList);
		return "shoppingCart/index";
	}
	
	@RequestMapping(path={"/detail"}, method=RequestMethod.GET) 
	public String displayDetail(@RequestParam Long id, ModelMap modelHolder) {
		for(Product p : productDao.getAllProducts()) {
			if(p.getId().equals(id)) {
				modelHolder.put("product", p);
			}
		}
		return "shoppingCart/detail";
	}
	
	@RequestMapping(path={"/addToCart"}, method=RequestMethod.POST) 
	public String addProductToCart(HttpSession session, @RequestParam Long productId, @RequestParam Integer quantity) {
		if(session.getAttribute("shoppingCart") == null){
			session.setAttribute("shoppingCart", new ShoppingCart());
		}
		ShoppingCart sc = (ShoppingCart) session.getAttribute("shoppingCart");
		sc.addProduct(productId, quantity);
		
		return "redirect:/shoppingCart/view";
	}	
	@RequestMapping(path={"/view"}, method=RequestMethod.GET)
	public String showShoppingCart(HttpSession session, ModelMap modelHolder){
		Map<Product,Integer> productList = new HashMap<>();
		ShoppingCart sc= (ShoppingCart) session.getAttribute("shoppingCart");
		if(sc != null){
			Map<Long,Integer> shoppingCartProducts = sc.getAllProducts();
			for(Long productId : shoppingCartProducts.keySet()){
				Product currentProduct = productDao.getProductById(productId);
				productList.put(currentProduct, shoppingCartProducts.get(productId));
			}
		}
		modelHolder.put("productList", productList);
		return "shoppingCart/view";
	}
}
