<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head>
	<title><tiles:insertAttribute name="title" defaultValue="Greenhouse" /></title>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <meta name="description" content="A place for application developers to connect and stay on top of everything happening in the Spring community." />
    <meta name="keywords" content="Greenhouse, Spring, SpringSource, develop, web, social, mobile, cloud, conference, speakers, talk, presentation, industry, tech" />
</head>
<body>
  	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="content-container">
		<div id="content">
			<tiles:insertAttribute name="content" />
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>
