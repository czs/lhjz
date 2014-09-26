<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="resources/img/canzs_128.png">
<title>主页</title>
<link href="resources/semantic/css/semantic.min.css" rel="stylesheet" type="text/css">
<link href="resources/css/index.css" rel="stylesheet" type="text/css">
<link href="resources/scrollup/css/themes/image.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="resources/js/lib/jquery-2.0.2.min.js" charset="utf-8"></script>
<script type="text/javascript" src="resources/javascript/javascript/semantic.min.js" charset="utf-8"></script>
<script src="resources/scrollup/js/jquery.scrollUp.min.js" charset="utf-8"></script>
</head>
<body>
	<a href="user/loginInput.do">用户登录</a>
	<a href="landing/index.html">门户主页</a>
	<script type="text/javascript">
		(function() {
			window.location = 'landing/index.html';
		})();
	</script>
</body>
</html>