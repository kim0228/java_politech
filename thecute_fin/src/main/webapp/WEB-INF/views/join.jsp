<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/join.css" />
<title>회원가입</title>
</head>
<body>
	<div class="wrap">
	  <div class="join_content">
	    <div class="logo_sec">
	      <h3>회원가입</h3>
	    </div>
	    <form class="join_sec" action="do_join" method="POST">
	      <label>아이디</label>
	      <input type="text" placeholder="아이디" required="required" name="id"/>
	      <label>비밀번호</label>
	      <input type="password" placeholder="비밀번호" required="required" name="password"/>
	      <label>생년월일</label>
	      <input type="number" placeholder="990101" required="required" name="birthday"/>
	      <label>이름</label>
	      <input type="text" placeholder="이름" required="required" name="name"/>
	      <input type="submit" class="join_btn" value="가입" />
	    </form>
	  </div>
	</div>
</body>
</html>