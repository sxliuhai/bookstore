<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改图书</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/resources/pages/common/head.jsp"%>


	<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
	
	input {
		text-align: center;
	}
</style>
</head>
<body>
		<div id="header">
			<span class="wel_word">编辑图书</span>

			<%-- 静态包含 manager管理模块的菜单  --%>
			<%@include file="/resources/pages/common/manager_menu.jsp"%>


		</div>
		
		<div id="main">
			<form action="/book/bookupdate/${book.id}">
				<table>
					<tr>
						<td>名称</td>
						<td>价格</td>
						<td>作者</td>
						<td>销量</td>
						<td>库存</td>
						<td colspan="2">操作</td>
					</tr>		
					<tr>
						<td><input name="name" type="text" value="${book.name}"/></td>
						<td><input name="price" type="text" value="${book.sales}"/></td>
						<td><input name="author" type="text" value="${book.author}"/></td>
						<td><input name="sales" type="text" value="${book.sales}"/></td>
						<td><input name="stock" type="text" value="${book.stock}"/></td>
						<td><input type="submit" value="提交"/></td>
					</tr>	
				</table>
			</form>
			
	
		</div>


		<%--静态包含页脚内容--%>
		<%@include file="/resources/pages/common/footer.jsp"%>


</body>
</html>