<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="reset.css" />
  <link rel="stylesheet" href="fontawesome-free-5.10.1-web/css/all.min.css" />
  <link rel="stylesheet" href="admin.css" />
  <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script src="admin.js"></script>
</head>
<body>
  <header class="top_nav">
    <a href="index.html"><i class="fas fa-user-friends"></i> 회원관리</a>
    <a href=""><i class="fas fa-clipboard-list"></i> 게시판관리</a>
    <a href="gallery.html"><i class="fab fa-dochub"></i> 갤러리관리</a>
  </header>
  <div class="content">
    <h3>기본정보</h3>
    <div class="row">
      <label>이름</label><input type="text" />
    </div>
    <div class="row">
      <label>주소</label><input type="text" />
    </div>
    <div class="row">
      <label>성별</label><input type="text" />
    </div>
    <div class="submit_section">
      <button>입력 완료</button>
    </div>
  </div>
</body>
</html>
