<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="subTitle" value="Travel Calculator" />
<%@ include file="common/header.jsp" %>	

<section class="centeredPanel">
<h2>Drive Time</h2>
<c:url var="planetImageUrl" value="/img/${calculator.planet }.jpg"/>
<img src="${planetImageUrl}" />
	<h2>Traveling by <c:out value="${calculator.transport}"/> you will reach <span class="title-case"><c:out value="${calculator.planet}"/></span> in 
	  <c:out value="${calculator.travelYears}"/> years.  You will be  <c:out value="${calculator.travelAge}"/> years old.</h2>

</section>

<%@ include file="common/footer.jsp" %>	