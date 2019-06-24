<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">

<head>
<title>rune</title>
<meta charset="utf-8" />
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/update.css" />
</head>

<body>
  <div class="wrap">
    <div class="update_content">
      <div class="logo_sec">
        <h3>데이터 수정</h3>
      </div>
      <form class="update_sec" action="update_data" method="get">
      <input type="hidden" name="idx" value="${idx}" />
        <label>이름</label><input type="text" placeholder="이름입력" name="name" value="${name}" />
        <label>중간고사점수</label><input type="number" placeholder="중간고사점수" name="midScore" value="${midScore}"/>
        <label>기말고사점수</label><input type="number" placeholder="기말고사점수" name="finalScore" value="${finalScore}"/>
        <input type="submit" class="update_btn" value="수정 완료" />
      </form>
    </div>
  </div>
</body>

</html>