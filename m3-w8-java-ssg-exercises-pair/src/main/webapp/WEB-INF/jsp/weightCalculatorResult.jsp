<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="subTitle" value="Weight Calculator" />
<%@ include file="common/header.jsp" %>	

<section class="centeredPanel">
<h2>Your Calculated Alien Weight</h2>
<c:url var="planetImageUrl" value="/img/${calculator.planet }.jpg"/>
<img src="${planetImageUrl}" />
	<h2>If you are <c:out value="${calculator.weight}"/> lbs on planet Earth,
	 then you are <c:out value="${calculator.alienWeight}"/> <span class="title-case"><c:out value="${calculator.planet}"/></span> lbs.</h2>

</section>

<%@ include file="common/footer.jsp" %>	