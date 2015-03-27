<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
	<%-- CSS 작업 --%>
	<title>JSP/Servlet Example</title>
	<style>
		body{
			background-image:url("IU.jpg");
			background-repeat:no-repeat; <%--반복안함--%>
			background-attachment: fixed;<%--배경고정--%>
			
	
		}
		input, select, label, textarea {
			border:green 1pt solid;
			color:red;
			font-size:50px;
			background: gray;
		}
	
	
	</style>
	<%-- 스크립트 --%>
	<script>
		function gofunc(){
			
			alert("Hello JavaScript!")
		}
	
	</script>
	
	
</head>

<body>
<!-- test.jsp -->
<h1>request test</h1>
<hr>

<form action="TestServlet" onsubmit="return gofunc()">
	<%-- submit을 누를때 스크립트에서 메소드 실행 --%>

	<label for="name1">이름 : </label><input type="text" id="name1" name="이름"><br>
	<label for="pw1">비밀번호 : </label><input type="password" id="pw1" name="pw"><br>
	<input type="radio" name="gender" id="man" value="남자"><label for="man">남자</label><br>
	<input type="radio" name="gender" id="woman" value="여자"><label for="woman">여자</label><br>
	
	 <!-- 라디오버튼과 같이 이름을 맞춰주는 것이 편함 -->
	 <%-- --%>
	<input type="checkbox" name="hobby" value="축구">축구
	<input type="checkbox" name="hobby" value="야구">야구
	<input type="checkbox" name="hobby" value="농구">농구
	
	
	<input type="color" name="mycolor"><br>
	E-mail<input type="email" name="myemail"><br>
	
	<select name="subject">
		<option value="java">Java</option>
		<option value="jsp">JSP</option>
		<option value="html">HTML</option>
	
	</select><br>
	
	<textarea rows="10" cols="30" name="textarea"></textarea><br>
	
	
	
	
	<input type="submit" value="서버로 제출">
	

</form>




</body>
</html>