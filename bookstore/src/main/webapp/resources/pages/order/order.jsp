<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我的订单</title>

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
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">我的订单</span>

		<%--静态包含，登录 成功之后的菜单 --%>
		<%@ include file="/resources/pages/common/login_success_menu.jsp"%>


	</div>
	
	<div id="main">
		
		<table>
			<tr>
				<td>订单号</td>
				<td>日期</td>
				<td>状态</td>
				<td>详情</td>
			</tr>
			<c:forEach var="order" items="${orders}">
			<tr>
				<td>${order.id}</td>
				<td>${order.date}</td>
				<td>${order.status}</td>
				<td><a href="/order/listCart/${order.id}">查看详情</a></td>
			</tr>
			</c:forEach>

		</table>
		
	
	</div>


	<%--静态包含页脚内容--%>
	<%@ include file="/resources/pages/common/footer.jsp"%>


</body>
</html>