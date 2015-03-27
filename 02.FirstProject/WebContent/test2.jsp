<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>GET</h1><%--크게 --%>
<form method="get" action="HelloServlet">
	이름 : <input type="text" name="name"><br>
	<%--입력타입과 이 타입을 구별해줄 이름 --%>
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="password" name="pwd"><br>
	<input type="submit" value="GET 방식으로 전송">
	<%--이방식으로 하면 주소창에 이름,아이디,비밀번호가 그대로 노출이된다. --%>
</form>
<a href="HelloServlet">링크로 GET 방식사용</a>
<hr><%--수평선 --%>

<h1>POST</h1>
<form method="post" action="HelloServlet"> <%-- HelloServlet의 URL Mapping과 일치--%>
	이름 : <input type="text" name="name"><br>
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="password" name="pwd"><br>
	<input type="submit" value="POST 방식으로 전송">
</form>

<hr><%--수평선 --%>
<h1>JSP</h1>
<form method="get" action="test3.jsp">
	이름 : <input type="text" name="name"><br>
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="password" name="pwd"><br>
	<input type="submit" value="JSP 방식으로 전송">
</form>


</body>
</html>