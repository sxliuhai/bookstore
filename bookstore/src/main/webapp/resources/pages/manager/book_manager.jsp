<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/resources/pages/common/head.jsp"%>
	<script type="text/javascript">
		$(function(){
		    $("#sure").click(function(){
		        var pageNum=$("#pn_input").val();
		        location.href="${pageContext.request.contextPath}/book/booklist/"+pageNum;
			})
		})
	</script>
</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">图书管理系统</span>

		<%-- 静态包含 manager管理模块的菜单  --%>
		<%@include file="/resources/pages/common/manager_menu.jsp"%>


	</div>
	
	<div id="main">
		<table>
			<tr>
				<td>名称</td>
				<td>价格</td>
				<td>作者</td>
				<td>销量</td>
				<td>库存</td>
				<td colspan="2">操作</td>
			</tr>
			<c:forEach var="book" items="${page.books}">
				<tr>
					<td>${book.name}</td>
					<td>${book.price}</td>
					<td>${book.author}</td>
					<td>${book.sales}</td>
					<td>${book.stock}</td>
					<td><a href="/book/bookget/${book.id}">修改</a></td>
					<td><a href="/book/bookdelete/${book.id}">删除</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="/resources/pages/manager/book_add.jsp">添加图书</a></td>
			</tr>
		</table>
		<div id="page_nav">
			<a href="book/booklist/1">首页</a>
			<c:if test="${page.prePage!=0}">
				<a href="book/booklist/${page.prePage}">上一页</a>
				<a href="book/booklist/${page.prePage}">${page.prePage}</a>
			</c:if>
			【${page.pageNum}】
			<c:if test="${page.nextPage!=0}">
				<a href="book/booklist/${page.nextPage}">${page.nextPage}</a>
				<a href="book/booklist/${page.nextPage}">下一页</a>
			</c:if>
			<a href="book/booklist/${page.pages}">末页</a>
			共${page.pages}页，${page.total}条记录 到第
			<input name="pn" id="pn_input"/>页
			<input id="sure" type="button" value="确定">
		</div>
	</div>


	<%--静态包含页脚内容--%>
	<%@include file="/resources/pages/common/footer.jsp"%>


</body>
</html>