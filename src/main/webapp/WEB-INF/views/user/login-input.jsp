<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>用户登录</title>
<link href="resources/semantic/css/semantic.min.css" rel="stylesheet" type="text/css">
<link href="resources/css/index.css" rel="stylesheet" type="text/css">
<link href="resources/scrollup/css/themes/image.css" rel="stylesheet" type="text/css">

<script type="text/javascript" src="resources/js/lib/jquery-2.0.2.min.js" charset="utf-8"></script>
<script type="text/javascript" src="resources/javascript/javascript/semantic.min.js" charset="utf-8"></script>
<script src="resources/scrollup/js/jquery.scrollUp.min.js" charset="utf-8"></script>
</head>
<body>
	<div class="ui grid">
		<div class="three column row">
			<div class="column"></div>
			<div class="column">
				<form id="form-login" action="user/login.do" method="post">
					<div class="ui warning form segment" style="margin-top: 150px;">
						<c:if test="${! empty error}">
							<div class="ui warning message">
								<div class="header">输入错误检测!</div>
								<ul class="list">
									<li>${error }</li>
								</ul>
							</div>
						</c:if>
						<div class="field">
							<label>用户名</label> <input name="username" value="admin" placeholder="用户名" type="text">
						</div>
						<div class="field">
							<label>密码</label> <input name="password" value="admin" type="password">
						</div>
						<div class="ui blue submit button">提交</div>
					</div>
				</form>
			</div>
			<div class="column"></div>
		</div>
	</div>

	<script type="text/javascript">
		jQuery(function($) {

			$('.ui.button.submit').click(function() {
				$('#form-login').submit();
			});
		});
	</script>
</body>
</html>