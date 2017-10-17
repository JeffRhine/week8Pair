<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@include file="common/header.jsp" %>

<section class="centeredPanel">
<h2> Forum</h2>
<ul>
<c:forEach items="${allPosts }" var="post">
	<li><c:out value="${post.username }"/></li>
	<li><c:out value="${post.subject }"/></li>
	<li><c:out value="${post.message }"/></li>
</c:forEach>
</ul>
<c:url var="makePost" value="forumInput"/>
<a href="${makePost}">Post</a>
</section>
<%@include file="common/footer.jsp" %>