<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="subTitle" value="Weight Calculator" />
<%@ include file="common/header.jsp" %>	

<section class="centeredPanel">
<h2>Weight Calculator</h2>
<c:url var="formAction" value="/weightCalculatorResult" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="weight">Earth Weight:</label> 
		<input type="text" name="weight" id="weight" />
	</div>
	<div class="formInputGroup">
		<label for="planet">Choose Planet:</label> 
		<select name="planet"	id="planet">
			<option value="mercury">Mercury</option>
			<option value="venus">Venus</option>
			
			<option value="mars">Mars</option>
			<option value="jupiter">Jupiter</option>
			<option value="saturn">Saturn</option>
			<option value="uranus">Uranus</option>
			<option value="neptune">Neptune</option>
			<option value="pluto">Pluto</option>
		</select>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Calculate Weight" />
</form>
</section>
<%@ include file="common/footer.jsp" %>