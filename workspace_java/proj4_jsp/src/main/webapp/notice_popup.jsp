<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>공지사항</title>
    <script>
        function setCookieAndClose() {
            document.forms[0].submit();
            window.close(); // 팝업창 닫기
        }
    </script>
</head>
<body>
    <h3>공지사항</h3>
    <p>이것은 중요한 공지입니다!</p>
    <form action="${pageContext.request.contextPath}/cookie" method="post">
        <input type="checkbox" onclick="setCookieAndClose()"> 1분 동안 보지 않기
    </form>
</body>
</html>