<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
<h2> Post a Comment</h2>
<c:url var="formAction" value="/forumNewPost" />
<form method="POST" action="${formAction}">
	<div class="formInputGroup">
		<label for="username">User Name:</label> 
		<input type="text" name="username" id="userName" />
	</div>
	<div class="formInputGroup">
		<label for="subject">Subject:</label> 
		<input type="text" name="subject" id="subject" />
	</div>
	<div class="formInputGroup">
		<label for="message">Message:</label> 
		<input type="text" name="message" id="message" />
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />

</form>
</section>
<%@include file="common/footer.jsp" %>