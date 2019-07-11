<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="select_data" method="get">
<tr>
     <th>avgPrice</th>
     <th>emi</th>
     <th>deviceCount</th>
     <th>productAge</th>
     <th>custType</th>
     <th>custId</th>
</tr>
   		${select_result}
      </table>
 </form>
</body>
</html>