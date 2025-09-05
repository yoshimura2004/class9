<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="memberdto.MemberDTO" %>
<% 

    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
    <% 
        Cookie[] cookies = request.getCookies();
        boolean showPopup = true;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("hideNotice".equals(cookie.getName()) && "true".equals(cookie.getValue())) {
                    showPopup = false;
                    break;
                }
            }
        }
        if (showPopup) {
    %>
        <script>
            window.open('notice_popup.jsp', 'popup', 'width=400,height=300');
        </script>
    <% } %>

    <h2>메인 페이지</h2>
    <% 
        MemberDTO member = (MemberDTO) session.getAttribute("member");
        if (member == null) {
    %>
        <p>비회원: 로그인하세요!</p>
        <a href="${pageContext.request.contextPath}/login.jsp">로그인</a>
    <% } else if ("USER".equals(member.getRole())) { %>
        <p>일반회원: <%= member.getEname() %>님 환영합니다!</p>
        <a href="${pageContext.request.contextPath}/logout.jsp">로그아웃</a>
    <% } else if ("ADMIN".equals(member.getRole())) { %>
        <p>관리자: <%= member.getEname() %>님 환영합니다!</p>
        <a href="${pageContext.request.contextPath}/memberList">회원 목록 보기</a>
        <a href="${pageContext.request.contextPath}/logout.jsp">로그아웃</a>
    <% } %>
</body>
</html>
