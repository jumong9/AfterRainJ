<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1>
<tr>
	<td>No</td>
	<td>Board</td>
	<td>Title</td>
	<td>Writer</td>
	<td>Count</td>
	<td>Use</td>
</tr>
<c:forEach var="board" items="${mboardList}" varStatus="loop">
<tr>
	<td>${board.num}</td>
	<td>${board.code}</td>
	<td>${board.title}</td>
	<td>${board.genUsrId}</td>
	<td>${board.readCnt}</td>
	<td>${board.useFlag}</td>
</tr>
</c:forEach>
</table>
</body>
</html>