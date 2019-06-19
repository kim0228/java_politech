<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>
  <meta charset="utf-8" />
<link href="${pageContext.request.contextPath}/resources/done.css" rel="stylesheet" />
  <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/done.js"></script>
</head>

<body>
  <div id="wrap">
    <div class="top_button_section">
      <a href="" class="top_button">목록으로</a>
    </div>
    <p>
      ${message}.
    </p>
  </div>
</body>

</html>