<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="mvccontroller">
		Enter name : <input type="text" name="nm" />
		<br/>
		Enter email : <input type="text" name="email" />
		<br/>
		Select cities : 
		<select name="city" multiple>
			<option value="pune">Pune</option>
			<option value="mumbai">Mumbai</option>
			<option value="nagpur">Nagpur</option>
			<option value="chennai">Chennai</option>
			<option value="bangalore">Bangalore</option>
		</select>
		<br/>
		<input type="submit" value="Submit data" />
		
	</form>

</body>
</html>