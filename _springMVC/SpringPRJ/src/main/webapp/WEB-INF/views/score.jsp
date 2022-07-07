<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="score_print" method="post">
	이름 : <input type="text" name="name" /> <br> <br>
	국어 : <input type="number" name="korean" /> <br> <br>
	영어 : <input type="number" name="english" /> <br> <br>
	수학 : <input type="number" name="math" /> <br> <br>
	<button type ="submit">입력완료</button>
</form>
</body>
</html>