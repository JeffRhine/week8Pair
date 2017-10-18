package com.techelevator.ssg.controller;

import java.util.List;

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
}	
//	@RequestMapping(path={"/detail"}, method=RequestMethod.POST) 
//	public String addToCart(HttpSession session, @RequestParam Long id, @RequestParam int quantity) {
////		for(Product p : productDao.getAllProducts()) {
////			if(p.getId().equals(id)) {
////				modelHolder.put("product", p);
////			}
//		
//			sc.put(productDao.getId(), )
//			session.setAttribute("id", id);
//		}
//		return "shoppingCart/detail";
//}
