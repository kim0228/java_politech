<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<link href="main.css"
	rel="stylesheet" />
</head>
<body>
	<a href="">데이터 입력하기</a>
	<table>
		<tr>
			<th>idx</th>
			<th>나이</th>
			<th>성별</th>
			${select_result}
		</tr>
	</table>
</body>
</html>