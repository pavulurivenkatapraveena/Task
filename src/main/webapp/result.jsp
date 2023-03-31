<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginpage" method="post">
Email:<input type="text" name="Email"><br>
Password:<input type="password" name="password"><br>
<button>login</button><button type="reset">cancel</button>
</form>
<table>
<tr>
<th>userName</th>
<th>userEmail</th>
<th>userMobile</th>
<th>userPasswor</th>
<th>delet</th>
</tr>
<%
for(User user:list){%>
{
<td><%=user.getName()%></td>
<td><%=user.getEmail()%></td>
<td><%=user.getMobile()%></td>
<td><%=user.getPassword()%></td>
<td><a href="delet?email=<%=user.getEmail()%>"><button>delet</td></button></a>
<td><a href="edit.jsp?mail=<%=user.getEmail()%>"><button>edit</button></a>
</tr>
<%} %>
</table>
</body>
</html>