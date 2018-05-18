<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<body>
	<h2>Mybatis Example!</h2>
	<form>

		<input type="text" name="id" id="id" value="${user.id}"/> <br> <input type="text"
			name="username" value="${user.userName}" />
	</form>
</body>
</html>
