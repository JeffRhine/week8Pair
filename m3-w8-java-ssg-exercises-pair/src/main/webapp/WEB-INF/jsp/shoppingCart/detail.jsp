<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="subTitle" value="Weight Calculator" />
<%@ include file="../common/header.jsp" %>	

<section class="centeredPanel">

		<h2></h2>

		<c:url value="/img/${product.imageName}" var="img"/>
		<img class="products" src="${img}">
		<span class="price"><c:out value="${product.price}"/></span>
		<c:out value="${product.name}"/>
		<br><br>
		<c:out value="${product.description}"/>
		
		<c:url var="addToCartUrl" value="/shoppingCart/addToCart" />
	<form method="POST" action="${addToCartUrl}">
	<input type="hidden" name="productId" value="${product.id}"/>
		<label for="quantity">Quantity to purchase: </label> 
		<input type="number" name="quantity" id="quantity" min="1" />
	
		<input class="formSubmitButton" type="submit" value="Add to Cart" />
	</form>


</section>


<%@ include file="../common/footer.jsp" %>