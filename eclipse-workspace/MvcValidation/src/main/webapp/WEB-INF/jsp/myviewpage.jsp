<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>  
<head>
<style>
.error {
	color: red
}
</style>    
</head>  
<body>  
	<form:form action="greeting2" modelAttribute="user">  
User Name: <form:input path="username" />
		<br>
		<br>  
Password(*): <form:password path="password" />
		<form:errors path="password" cssClass="error" />
		<br>
		<br>  
User Id: <form:input path="userid" />
		<form:errors path="userid" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>