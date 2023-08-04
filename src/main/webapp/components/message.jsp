<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String message = (String) session.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(message!=null){
		%>
		<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<%=message%>
				<button type="button" class="btn-close" data-bs-dismiss="alert"
					aria-label="Close"></button>
		</div>
		
	<%}

%>
	

</body>
</html>