<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>제품 등록/수정</title>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<link rel="stylesheet" href="${ctx}/css/style.css">
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<!-- 전역 레이아웃 사용 -->
<style>
.form-card {
	max-width: 900px;
	width: 100%;
	margin: 20px auto;
	background-color: #fff;
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	box-sizing: border-box;
}

.form-card h1 {
	text-align: center;
	margin-bottom: 25px;
	font-size: 2rem;
	font-weight: 700;
}

.form-group {
	display: flex;
	flex-direction: column;
	margin-bottom: 18px;
}

.form-group label {
	margin-bottom: 8px;
	font-weight: 600;
	color: #555;
}

.form-group input[type="text"], .form-group textarea {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 6px;
	font-size: 1rem;
	box-sizing: border-box;
	background: #fff;
}

.form-group input[readonly] {
	background: #e9ecef;
	cursor: not-allowed;
}

.button-group {
	display: flex;
	justify-content: center;
	gap: 12px;
	margin-top: 26px;
}

.btn {
	padding: 12px 28px;
	border: none;
	border-radius: 8px;
	font-size: 1rem;
	font-weight: 700;
	cursor: pointer;
	transition: transform .06s ease, opacity .2s ease;
}

.btn:active {
	transform: translateY(1px);
}

.btn-success {
	background: #2ecc71;
	color: #fff;
}

.btn-success:hover {
	opacity: .9;
}

.btn-secondary {
	background: #6c757d;
	color: #fff;
}

.btn-secondary:hover {
	opacity: .9;
}

.btn-danger {
	background: #dc3545;
	color: #fff;
}

.btn-danger:hover {
	opacity: .9;
}
</style>
</head>
<body>

	<!-- 전역 고정 헤더 -->
	<jsp:include page="header.jsp" />

	<!-- 전역 레이아웃 래퍼: sidebar(고정) + content-area(스크롤) -->
	<div class="main-container">
		<jsp:include page="sidebar.jsp" />

		<div class="content-area">
			<div class="form-card">



				<!-- 제목 -->
				<h1>
					<c:choose>
						<c:when test="${not empty standard}">제품 수정</c:when>
						<c:otherwise>제품 등록</c:otherwise>
					</c:choose>
				</h1>

				<!-- 오류 안내 (선택) -->
				<c:if test="${param.err == 'required'}">
					<div
						style="margin-bottom: 12px; padding: 10px; border-radius: 6px; background: #fff3cd; color: #856404;">
						필수값(코드/이름)을 입력해 주세요.</div>
				</c:if>
				<c:if test="${param.err == 'insert'}">
					<div
						style="margin-bottom: 12px; padding: 10px; border-radius: 6px; background: #f8d7da; color: #842029;">
						등록 중 오류가 발생했습니다. (중복 코드 여부를 확인해 주세요)</div>
				</c:if>

				<!-- 등록/수정 공용 폼 -->
				<form action="${pageContext.request.contextPath}/standard/insert"
					method="post" class="form-card">
					<h1 style="text-align: center; margin-bottom: 24px;">제품 등록</h1>

					<!-- 제품코드: 서버에서 자동 생성. 사용자는 수정 불가 -->
					<div class="form-group">
						<label>제품 코드</label> <input type="text" id="productCodePreview"
							readonly placeholder="저장 시 자동 생성 (예: RA0001, SE0001, FI0001)">
					</div>

					<div class="form-group">
						<label>제품 이름</label> <input type="text" name="productName"
							required>
					</div>

					<div class="form-group">
						<label>제품 유형</label> <select name="productType" id="productType"
							required>
							<option value="" disabled selected>선택하세요</option>
							<option value="RAW">RAW (원자재)</option>
							<option value="SEMI">SEMI (반제품)</option>
							<option value="FINISH">FINISH (완제품)</option>
						</select>
					</div>

					<div class="form-group">
						<label>제품 갯수</label> <input type="text" name="quantity" value="0">
					</div>

					<div class="form-group">
						<label>제품 단위</label> <select name="unit" id="unit" required>
							<option value="" disabled selected>선택하세요</option>
							<option value="L">L</option>
							<option value="kg">kg</option>
							<option value="개">개</option>
						</select>
					</div>

					<div class="button-group">
						<button type="submit" class="btn btn-success">저장</button>
						<a href="${pageContext.request.contextPath}/standardList"
							class="btn btn-secondary">취소</a>
					</div>
				</form>
			</div>
		</div>
		
		<script>
  // 유형 선택 시 미리보기(실제 생성은 서버에서!)
  const typeSel = document.getElementById('productType');
  const preview = document.getElementById('productCodePreview');

  function prefixOf(type){
    if (!type) return '';
    type = type.toUpperCase();
    if (type === 'RAW') return 'RA';
    if (type === 'SEMI') return 'SE';
    if (type === 'FINISH') return 'FI';
    return 'RA';
  }
  typeSel?.addEventListener('change', e => {
    const p = prefixOf(e.target.value);
    preview.value = p ? (p + '#### (저장 시 실제 번호 부여)') : '';
  });
</script>
</body>
</html>
