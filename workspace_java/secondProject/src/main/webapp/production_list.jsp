<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리</title>
<link rel="stylesheet" href="css/style.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<style>
/* 페이지 전용 스타일 */
.container {
	max-width: 1000px;
	margin: 20px auto;
	padding: 30px;
	background: #fff;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, .1);
	overflow-x: auto;
}

h1 {
	text-align: center;
}

.controls {
	display: flex;
	justify-content: space-between;
	align-items: center;
	margin-bottom: 20px;
}

.search-form {
	display: flex;
	gap: 10px;
}

.search-input {
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	font-size: 1em;
}

.btn {
	padding: 10px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 1em;
}

.btn-primary {
	background: #007bff;
	color: #fff;
}

.btn-success {
	background: #28a745;
	color: #fff;
}

table {
	width: 100%;
	min-width: 900px;
	border-collapse: collapse;
	margin-bottom: 30px;
}

th, td {
	border: 1px solid #e9ecef;
	padding: 12px;
	text-align: center;
	vertical-align: middle;
	white-space: nowrap;
	min-width: 100px;
}

th {
	background: #e9ecef;
	font-weight: bold;
	color: #495057;
}

tr:nth-child(even) {
	background: #f8f9fa;
}

.action-links a {
	text-decoration: none;
	color: #007bff;
	margin-right: 10px;
}

.action-links a:hover {
	text-decoration: underline;
}

.chart-container {
	max-width: 600px;
	margin: 20px auto;
}

.no-data {
	text-align: center;
	color: #6c757d;
	padding: 20px;
}
</style>
</head>

<body>
	<jsp:include page="header.jsp" />
	<div class="main-container">
		<jsp:include page="sidebar.jsp" />
		<div class="content-area">
			<div class="container">

				<h1>생산관리</h1>

				<!-- 검색 & 등록 -->
				<div class="controls">
					<form class="search-form"
						action="${pageContext.request.contextPath}/productionList"
						method="get">
						<input type="text" class="search-input" name="q"
							placeholder="생산번호 또는 제품코드 검색 (두 글자 이상)" value="${q}">
						<button type="submit" class="btn btn-primary">검색</button>
					</form>
					<a href="production_form.jsp" class="btn btn-success">생산 등록</a>
				</div>

				<!-- 테이블 -->
				<div class="table-responsive">
					<table>
						<thead>
							<tr>
								<th>생산번호</th>
								<th>제품코드</th>
								<th>생산 시작일</th>
								<th>생산 종료일</th>
								<th>생산 목표량</th>
								<th>생산 완료량</th>
								<th>담당자</th>
								<th>생성일</th>
								<th>수정일</th>
								<th>관리</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${empty productionList}">
									<tr>
										<td colspan="10" class="no-data">등록된 생산 정보가 없습니다.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach var="p" items="${productionList}">
										<tr>
											<td>${p.productionNo}</td>
											<td>${p.standardCode}</td>
											<td><fmt:formatDate value="${p.prStart}"
													pattern="yyyy-MM-dd" /></td>
											<td><fmt:formatDate value="${p.prEnd}"
													pattern="yyyy-MM-dd" /></td>
											<td>${p.prTarget}</td>
											<td>${p.prCompleted}</td>
											<!-- 담당자: 현재는 employeeNo를 그대로 표기. 조인으로 이름 필요시 컨트롤러에서 같이 내려주세요 -->
											<td>${p.employeeNo}</td>
											<td><fmt:formatDate value="${p.createDate}"
													pattern="yyyy-MM-dd" /></td>
											<td><fmt:formatDate value="${p.updateDate}"
													pattern="yyyy-MM-dd" /></td>
											<td class="action-links"><a
												href="production_form.jsp?no=${p.productionNo}">수정</a> <a
												href="${pageContext.request.contextPath}/production/delete?no=${p.productionNo}"
												onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a></td>
										</tr>
									</c:forEach>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>

				<!-- 차트 -->
				<div class="chart-container">
					<canvas id="productionChart"></canvas>
				</div>

			</div>
		</div>
	</div>

	<!-- Chart.js: 서버 데이터로 라벨/데이터 구성 -->
	<script>
    // JSP 데이터를 JS 배열로 직렬화
    const labels = [
      <c:forEach var="p" items="${productionList}" varStatus="s">
        "${fn:escapeXml(p.productionNo)}"<c:if test="${!s.last}">,</c:if>
      </c:forEach>
    ];
    const targets = [
      <c:forEach var="p" items="${productionList}" varStatus="s">
        ${p.prTarget}<c:if test="${!s.last}">,</c:if>
      </c:forEach>
    ];
    const completes = [
      <c:forEach var="p" items="${productionList}" varStatus="s">
        ${p.prCompleted}<c:if test="${!s.last}">,</c:if>
      </c:forEach>
    ];

    const ctx = document.getElementById('productionChart').getContext('2d');
    new Chart(ctx, {
      type: 'bar',
      data: {
        labels,
        datasets: [
          {
            label: '생산 목표량',
            data: targets,
            backgroundColor: 'rgba(54, 162, 235, 0.5)',
            borderColor:   'rgba(54, 162, 235, 1)',
            borderWidth: 1
          },
          {
            label: '생산 완료량',
            data: completes,
            backgroundColor: 'rgba(75, 192, 192, 0.5)',
            borderColor:   'rgba(75, 192, 192, 1)',
            borderWidth: 1
          }
        ]
      },
      options: {
        scales: {
          y: { beginAtZero: true, title: { display: true, text: '수량' } },
          x: { title: { display: true, text: '생산번호' } }
        },
        plugins: {
          legend: { position: 'top' },
          title:  { display: true, text: '생산 목표량 vs 완료량' }
        }
      }
    });
  </script>
	<%-- fn 함수 사용 시 아래 태그라이브러리 추가 --%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
</body>
</html>
