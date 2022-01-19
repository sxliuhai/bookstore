<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>结算页面</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/resources/pages/common/head.jsp"%>


	<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
</style>
</head>
<body>
	
	<div id="header">
			<span class="wel_word">结算</span>

		<%--静态包含，登录 成功之后的菜单 --%>
		<%@ include file="/resources/pages/common/login_success_menu.jsp"%>


	</div>
	
	<div id="main">
		
		<h1>你的订单已结算,订单号为${order_id}</h1>
		
	
	</div>


	<%--静态包含页脚内容--%>
	<%@include file="/resources/pages/common/footer.jsp"%>


</body>
</html>