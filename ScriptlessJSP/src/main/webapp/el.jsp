<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Request parameter : ${param.nm} 
	<br/>
	Request header : ${header.host}
	<br/>
	Request header : ${header["user-agent"] }
	<br/>
	Cookie info : ${cookie.emailcookie.value }
	<br/>
	Context parameter : ${initParam.adminemail}
	<br/>
	Location bean : ${requestScope.locations["0"] }
	        <br/>   ${requestScope.locations["1"] }
	        <br/>   ${requestScope.locations["2"] }
	        <br/>
	EL exp : ${"welcome to EL"} <br/>
	EL exp : ${400*8}     <br/>
	<ul>
		<c:forEach var="city" items="${locations}">
			<li> ${city} </li>
		</c:forEach>
	</ul>
	<%-- 
	<c:if test="">
		
	</c:if>
	
	<c:choose>
		<c:when>
		</c:when>
		<c:otherwise>
		</c:otherwise>
	</c:choose>
	
	<c:set var="" value="" scope=""/>
	
	<c:redirect url=""></c:redirect>
	
	<c:import var="" url="" ></c:import>
	<c:out />
	
	
	<sql:setDataSource var="con" driver="" url=""
	 user="" password=""/>
	 
	 <sql:query var="rs" dataSource="con">
	 	
	 </sql:query>
	 
	 <sql:update dataSource="" var="n">
	 	<sql:param></sql:param>
	 </sql:update>
	 
	 
	 --%>

</body>
</html>