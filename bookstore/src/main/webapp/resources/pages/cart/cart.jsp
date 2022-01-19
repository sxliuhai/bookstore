<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>购物车</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/resources/pages/common/head.jsp"%>


</head>
<body>
	
	<div id="header">
			<span class="wel_word">购物车</span>

		<%--静态包含，登录 成功之后的菜单 --%>
		<%@ include file="/resources/pages/common/login_success_menu.jsp"%>


	</div>
	
	<div id="main">
	
		<table>
			<tr>
				<td>商品名称</td>
				<td>数量</td>
				<td>单价</td>
				<td>金额</td>
				<td>操作</td>
			</tr>
			<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.name}</td>
				<td>${item.count}</td>
				<td>${item.price}</td>
				<td>${item.total_price}</td>
				<td><a href="/cart/itemDelete/${item.id}">删除</a></td>
			</tr>
			</c:forEach>
			
		</table>
		
		<div class="cart_info">
			<span class="cart_span"><a href="/cart/allDelete">清空购物车</a></span>
			<span class="cart_span"><a href="/cart/pay">去结账</a></span>
		</div>
	
	</div>


	<%--静态包含页脚内容--%>
	<%@include file="/resources/pages/common/footer.jsp"%>


</body>
</html>