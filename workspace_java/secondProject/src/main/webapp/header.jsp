<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<header class="main-header">
  <a class="logo" href="${ctx}/">
    <img src="${ctx}/img/logo.png" alt="SoAPI Logo">
  </a>
  <div class="user-info">
    안녕하세요, Admin님
    <a href="${ctx}/logout">로그아웃</a>
  </div>
</header>
