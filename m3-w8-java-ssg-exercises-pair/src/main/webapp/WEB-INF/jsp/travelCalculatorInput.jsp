<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="subTitle" value="Travel Calculator" />
<%@ include file="common/header.jsp" %>	

<section class="centeredPanel">
<h2> Drive Time</h2>
<c:url var="formAction" value="/travelCalculatorResult" />
<form method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label for="age">Your age:</label> 
		<input type="text" name="age" id="age" />
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
		<div class="formInputGroup">
		<label for="transport">Mode of Transport:</label> 
		<select name="transport"	id="transport">
			<option value="walking">Walking</option>
			<option value="car">Car</option>
			
			<option value="bullet train">Bullet Train</option>
			<option value="boeing 747">Boeing 747</option>
			<option value="concorde">Concorde</option>
			
		</select>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Calculate Travel" />
</form>
</section>
<%@ include file="common/footer.jsp" %>