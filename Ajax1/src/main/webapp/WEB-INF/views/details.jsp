<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/reset.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fontawesome-free-5.10.1-web/css/all.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin.css?random=98" />
  <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script>var idx = ${idx_string};</script>
  <script src="${pageContext.request.contextPath}/resources/details.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/smarteditor/js/service/HuskyEZCreator.js" charset="utf-8"></script>

</head>
<body>
  <header class="top_nav">
    <a href="/ajax1"><i class="fas fa-user-friends"></i> 회원관리</a>
    <a href="/ajax1/posts"><i class="fas fa-clipboard-list"></i> 게시판관리</a>
    <a href="gallery.html"><i class="fab fa-dochub"></i> 갤러리관리</a>
  </header>
  <div class="content">
    <div class="details_section">
      <h3 class="title"></h3>
      <textarea id="de" name="de"></textarea>
    </div>
    <div class="button_center_section">
      <a class="submit_button">수정하기</a>
    </div>
  </div>

</body>
</html>
