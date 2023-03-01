<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>    
</head>  
<body>  
<form:form action="greeting2" modelAttribute="user">  
Username: <form:input path="name"/> <br><br>  
Password(*): <form:password path="pass"/>    
<form:errors path="pass" /><br><br>  
<input type="submit" value="submit">  
</form:form>  
</body>  
</html>