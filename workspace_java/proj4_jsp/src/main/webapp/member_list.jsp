<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>회원 목록</title>
</head>
<body>
    <h2>회원 목록</h2>
    <table border="1">
        <tr>
            <th>직원 번호</th>
            <th>이름</th>
            <th>역할</th>
        </tr>
        <c:forEach var ="member" items="${memberList}">
            <tr>
                <td>${member.empno}</td>
                <td>${member.ename}</td>
                <td>${member.role}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="index.jsp">홈으로</a>
</body>
</html>