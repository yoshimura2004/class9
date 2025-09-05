<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie cookie : cookies) {
		if ("hideNotice".equals(cookie.getName()) && "true".equals(cookie.getValue())) {
	Cookie newCookie = new Cookie("hideNotice", "true");
	newCookie.setMaxAge(60);
	response.addCookie(newCookie);
	break;
		}
	}
}

session.invalidate();
response.sendRedirect(request.getContextPath() + "/index.jsp");
%>