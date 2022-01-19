<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/5
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <c:if test="${not empty sessionScope.user}">
        <span>欢迎<span class="um_span">${sessionScope.user.username}</span>光临尚硅谷书城</span>
        <a href="/cart/list">购物车</a>
        <a href="/order/listOrder">订单管理</a>
        <a href="/resources/pages/manager/manager.jsp">后台管理</a>
        <a href="/user/logout">注销</a>&nbsp;&nbsp;
    </c:if>
    <c:if test="${empty sessionScope.user}">
        <a href="/resources/pages/user/login.jsp">登录</a> |
        <a href="/resources/pages/user/regist.jsp">注册</a> &nbsp;&nbsp;
        <a href="/cart/list">购物车</a>
        <a href="/resources/pages/manager/manager.jsp">后台管理</a>
    </c:if>
</div>