<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>로그인</h2>
    <% 
        String error = request.getParameter("error");
        if ("invalid".equals(error)) { 
    %>
        <p style="color:red;">아이디 또는 비밀번호가 잘못되었습니다.</p>
    <% } else if ("accessDenied".equals(error)) { %>
        <p style="color:red;">관리자만 접근 가능한 페이지입니다.</p>
    <% } %>
    <form action="${pageContext.request.contextPath}/login" method="post">
        <label>ID (ename):</label>
        <input type="text" name="ename" required><br>
        <label>PW (empno):</label>
        <input type="password" name="empno" required><br>
        <input type="submit" value="로그인">
    </form>
</body>
</html>