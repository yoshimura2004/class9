<!-- html 주석 -->
<%--jsp 주석 가장 강력한 주석이다. --%>

<!-- 디렉티브 테그 -->
<%--"

<%@ 로 시작하는 태그 
	1. page
	2. include
--%>
<%@ 
	page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
	import = "java.util.List"
	import = "java.util.Map"
%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script>
	window.onload = function (){
		console.log('header';)
	}
</script>	
</head>
<body>
	<%@ include file = "header.jsp" %>
	
	<h1>jsp.jsp</h1>
	
<!-- 스크립틀릿 Scriptlet -->
<%
	//여기는 java 땅입니다
	System.out.println("test");
	out.println("<strong>Im Strong</strong>");
%>

<table border = 3>

<%		for(int i =0; i<5; i++){ %>
		<tr>
			<td>g</td>
			<td>a</td>
			<td>m</td>
			<td>e</td>
		</tr>

<%          }					   %>
</table>

<%
	int a = 26;
	String name = request.getParameter("name");
%>
나이: <% out.print(a); %> <br>
name: <% out.print(name); %> <br>

<!--표현식 -->
<%= a %><br>
<%= name %><br>

<!-- 선언문 -->
<%!
	String title  = "F1";
	String getTitle(){
		return this.title;
		
	}
%>
<%
	for(int i = 2; i <= 9; i++){
		for(int j = 1; j <= 9; j++){
			out.print(i + " x " + j + " = " + (i*j) + "<br>");
		}
		out.print("<br>"); 
	}
%>



</body>
</html>