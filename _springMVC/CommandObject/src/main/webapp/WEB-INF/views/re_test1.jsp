<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>test1 출력</h1>
	<%-- <h2>data1 : ${dataBean.data1 }</h2>
	<h2>data2 : ${requestScope.dataBean.data2 }</h2> --%>
	
	<%-- <h2>data1 : ${data.data1 }</h2>
	<h2>data2 : ${requestScope.data.data2 }</h2> --%>
	
	<h2>data1 : ${dto.data1 }</h2>
	<h2>data2 : ${dto.data2 }</h2>
</body>
</html>