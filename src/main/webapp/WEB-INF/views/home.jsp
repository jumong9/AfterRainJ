<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%@ page session="false" %>

<sql:query var="rs" dataSource="jdbc/afterrainDS">
select code, num, title, contents, gen_usr_id, use_flag  from mboard
</sql:query>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2>Query Results</h2>
<c:forEach var="row" items="${rs.rows}">
    Code ${row.code} &nbsp;
    num ${row.num} &nbsp;
    title ${row.title} &nbsp;
    contents ${row.contents} &nbsp;
    Gen_usr_no ${row.gen_usr_id} &nbsp;
    Use_flag ${row.use_flag} &nbsp;  
    <br/> 
</c:forEach>

</body>
</html>
