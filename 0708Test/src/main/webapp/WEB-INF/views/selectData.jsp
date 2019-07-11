<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>어디로 갈까?</title>
<link href="/selectData.css"
	rel="stylesheet" />
</head>
<body>
	<a href="">목록으로</a>
	<form action="" method="get">
		직업 :
		<select name="job_group">
	      <option value="1"selected>대학생</option>
	      <option value="2">직장인</option>
	      <option value="3">무직</option>
	      <option value="4">군인</option>
	      <option value="999">기타</option>
	    </select><br/>
    	당일/숙박여행 여부 :
	    <select name="q1">
	      <option value="1"selected>당일여행</option>
	      <option value="2">숙박여행</option>
	    </select><br/>
    	주요 이동(교통수단) :
	    <select name="q4">
	      <option value="1"selected>자가용</option>
	      <option value="2">철도</option>
	      <option value="3">항공기</option>
	      <option value="4">선박/해상교통</option>
	      <option value="5">지하철</option>
	      <option value="6">(정기)고속/시외버스</option>
	      <option value="7">(부정기)전세/관광버스</option>
	      <option value="8">차량대여/렌트</option>
	      <option value="9">자전거</option>
	      <option value="20">기타</option>
	    </select><br />
	   	 하루 지출 등급 :
	    <select name="q7_grade">
	      <option value="1" selected>3만원 이하</option>
	      <option value="2">6만원 이하</option>
	      <option value="3">10만원 이하</option>
	      <option value="4">20만원 이하</option>
	      <option value="5">20만원 초과</option>
	    </select><br />
		<input type="submit" value="입력 완료" />
	</form>
</body>

</html>
