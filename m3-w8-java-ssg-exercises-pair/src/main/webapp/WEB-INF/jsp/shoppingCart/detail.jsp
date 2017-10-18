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
		
		<c:url var="formAction" value="/???" />
	<form method="POST" action="${formAction}">
		<div class="formInputGroup">
		<label for="quantity">Quantity to purchase: </label> 
		<input type="number" name="quantity" id="quantity" />
		</div>
		<input type="hidden" name="id" value="${product.id}"/>
		<input class="formSubmitButton" type="submit" value="Add to Cart" />
	</form>


</section>


<%@ include file="../common/footer.jsp" %>