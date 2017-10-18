<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="subTitle" value="Weight Calculator" />
<%@ include file="../common/header.jsp" %>	

<section class="centeredPanel">
	<h2>Buy Some Space Junk</h2>

	<c:forEach items="${allProducts}" var="product">
		<c:url value="/shoppingCart/detail?id=${product.id}" var="detail"/>
		<c:url value="/img/${product.imageName}" var="img"/>
		
		<a href="${detail}"><img class="products" src="${img}"></a>
		<span class="price"><c:out value="${product.price}"/></span>
		<c:out value="${product.name}"/>
		<br>
		
	</c:forEach>

</section>


<%@ include file="../common/footer.jsp" %>