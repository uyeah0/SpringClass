<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome Spring!</h1>
	<img src="img/logo.svg"/>
	<a href="test1">test1_get</a>
	
	<form method="post" action="test2">
	<input type="text" name="txt">
	<button type="submit">전송하기</button>
</form>

<a href="test3">test3 get post</a><br/>
<a href="test4">test4 get</a><br/>

	<form method="post" action="test5">
	<input type="text" name="txt">
	<button type="submit">전송하기</button>
</body>
</html>