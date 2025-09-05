<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="emp.dto.EmpDTO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="list">
검색(ename) : <input type="text" name="keyword" value="${empDTO.keyword}">
<input type="submit" value="검색">
</form>
<table border=1>
	<tr>
		<th>empno</th>
		<th>ename</th>
		<th>sal</th>
	</tr>
	<c:forEach var="dto" items="${map.list }">
		<tr>
			<td>${dto.empno }</td>
			<td>${dto.ename }</td>
			<td>${dto.sal }</td>
		</tr>	
	</c:forEach>
</table>

<%
	int total = (int) ( (Map)request.getAttribute("map") ).get("total");
	int pagePerRows = ( (EmpDTO)request.getAttribute("empDTO") ).getPagePerRows();
	int totalPage = (int)Math.ceil((double)total / pagePerRows);
	
	int section = 5; // 한번에 보여줄 페이지들의 수
	int pageNum = ( (EmpDTO)request.getAttribute("empDTO") ).getPage();
	int section_end = (int)Math.ceil((double)pageNum / section) * section;
	int section_start = section_end - (section - 1);
	if(section_end > totalPage){
		section_end = totalPage;
	}
%>
<div>
	<c:if test="<%=section_start == 1 %>">
		이전
	</c:if>
	<c:if test="<%=section_start != 1 %>">
		<a href="list?page=<%=section_start-1 %>&size=${empDTO.pagePerRows}&keyword=${empDTO.keyword}">이전</a>
	</c:if>
	
	<c:forEach var="i" begin="<%=section_start %>" end="<%=section_end %>">
		<a href="list?page=${i }&size=${empDTO.pagePerRows}&keyword=${empDTO.keyword}">
			<c:if test="${empDTO.page eq i }">
				<strong>${i }</strong>
			</c:if>
			<c:if test="${ not (empDTO.page eq i) }">
				${i }
			</c:if>
		</a>&nbsp;
	</c:forEach>
	
	<c:if test="<%=section_end == totalPage %>">
		다음
	</c:if>
	<c:if test="<%=section_end != totalPage %>">
		<a href="list?page=<%=section_end+1 %>&size=${empDTO.pagePerRows}&keyword=${empDTO.keyword}">다음</a>
	</c:if>
</div>

</body>
</html>



