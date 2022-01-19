<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书城首页</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="../common/head.jsp"%>
	<script type="text/javascript">
        $(function(){
            $("#sure").click(function(){
                var pageNum=$("#pn_input").val();
                location.href="${pageContext.request.contextPath}/"+pageNum;
            })
        })
	</script>

</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="../../static/img/logo.gif" >
			<span class="wel_word">网上书城</span>
			 <%@include file="../common/login_success_menu.jsp"%>
	</div>

	<div id="main">
		<div id="book">
			<div class="book_cond">
			</div>
			<div style="text-align: center">

			</div>
			<c:forEach var="book" items="${page.books}">
			<div class="b_list">
				<div class="img_div">
					<img class="book_img" alt="" src="/resources/static/img/default.jpg" />
				</div>
				<div class="book_info">
					<div class="book_name">
						<span class="sp1">书名:</span>
						<span class="sp2">${book.name}</span>
					</div>
					<div class="book_author">
						<span class="sp1">作者:</span>
						<span class="sp2">${book.author}</span>
					</div>
					<div class="book_price">
						<span class="sp1">价格:</span>
						<span class="sp2">￥${book.price}</span>
					</div>
					<div class="book_sales">
						<span class="sp1">销量:</span>
						<span class="sp2">${book.sales}</span>
					</div>
					<div class="book_amount">
						<span class="sp1">库存:</span>
						<span class="sp2">${book.stock}</span>
					</div>
					<div class="book_add">
						<a href="/cart/add/${book.id}"><button>加入购物车</button></a>
					</div>
				</div>
			</div>
			</c:forEach>
		</div>
		<div id="page_nav">
			<a href="/1">首页</a>
			<c:if test="${page.prePage!=0}">
				<a href="/${page.prePage}">上一页</a>
				<a href="/${page.prePage}">${page.prePage}</a>
			</c:if>
			【${page.pageNum}】
			<c:if test="${page.nextPage!=0}">
				<a href="/${page.nextPage}">${page.nextPage}</a>
				<a href="/${page.nextPage}">下一页</a>
			</c:if>
			<a href="/${page.pages}">末页</a>
			共${page.pages}页，${page.total}条记录 到第
			<input name="pn" id="pn_input"/>页
			<input id="sure" type="button" value="确定">
		</div>
	
	</div>

	<%--静态包含页脚内容--%>
	<%@include file="../common/footer.jsp"%>

</body>
</html>