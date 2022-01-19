<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加图书</title>

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
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">编辑图书</span>

			<%-- 静态包含 manager管理模块的菜单  --%>
			<%@include file="/resources/pages/common/manager_menu.jsp"%>


		</div>
		
		<div id="main">
			<form action="/book/bookadd">
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
						<td><input name="name" type="text" value="时间简史"/></td>
						<td><input name="price" type="text" value="30.00"/></td>
						<td><input name="author" type="text" value="霍金"/></td>
						<td><input name="sales" type="text" value="200"/></td>
						<td><input name="stock" type="text" value="300"/></td>
						<td><input type="submit" value="提交"/></td>
					</tr>	
				</table>
			</form>
			
	
		</div>


		<%--静态包含页脚内容--%>
		<%@include file="/resources/pages/common/footer.jsp"%>


</body>
</html>