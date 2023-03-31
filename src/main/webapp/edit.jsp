<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String email=request.getParameter("email");%>
User dao=new Userao();
User user=dao.find(email);
%>
<form action="update" method="post">
Name:<input type ="text" name="name" value="<%=User.getName()%>"><br>
Mobile:<input type ="text" name="mobile" value="<%=User.getMoile()%>"><br>
Email:<input type ="text" name="email" value="<%=User.getEmal()%>"><br>
Password:<input type ="password" name="password" value="<%=User.getPassword%>"><br>
<button>update</button><button type="reset">cancel</button>
</body>
</html>