<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>메인</title>
</head>
<body>
	<p>
		<c:if test="${registerRequest.email ne null}">
			<spring:message code="login.done">
				<spring:argument value="${registerRequest.email}" />
			</spring:message>
		</c:if>
	</p>
	<p>
		<a href="<c:url value="/login"/>"> [<spring:message code="login.btn" />]
		</a>
	</p>
	<p>
		<a href="<c:url value="/register/step1"/>"> [<spring:message code="member.register" />]
		</a>
	</p>
</body>
</html>