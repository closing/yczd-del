<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<body>
	<h2>JSP Example!</h2>
	<form action="<%=request.getContextPath() %>/greeting" method="POST">


		<input type="text" name="name" id="name" /> <br>
		<c:out value="${greeting}"/>
			<br> <input
			type="submit" name="submit" value="Say Hello" />
	</form>
</body>
</html>
