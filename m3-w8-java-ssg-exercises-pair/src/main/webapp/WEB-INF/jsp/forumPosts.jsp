<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
<h2> Forum</h2>

<div class="post-container">
<c:forEach items="${allPosts }" var="post">
	<div class="post">
		<h4>User: </h4><c:out value="${post.username }"/>
		<h4>Subject: </h4><c:out value="${post.subject }"/> at <c:out value="${post.datePosted}"/>
		<h4>Message: </h4><c:out value="${post.message }"/>
	</div>
</c:forEach>
</div>

<c:url var="makePost" value="forumInput"/>
<a href="${makePost}">Post</a>
</section>
<%@include file="common/footer.jsp" %>