<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>用户注册</h1>
	
	<form action="registerServlet" method="post">
	
				用户名称：
				<input name="username"><br> 
				用户密码：
				<input type="password" name="userpwd"><br> 
				重复密码：
				<input type="password" name="reuserpwd"><br> 
				手机号码：
				<input name="phone"><br> 
				电子邮箱：
				<input name="email"> <br> 
				<input type="submit" value="注册" onclick="check()"> 
		
	</form>

	<script type="text/javascript">
	
		function check(){
			var username = document.getElementsByName("username")[0].value;
			var password = document.getElementsByName("userpwd")[0].value;
			var repassword = document.getElementsByName("reuserpwd")[0].value;

			if(password != repassword){
				alert("密码不一致");
				return false;
			}else if(username == ""){
				alert("用户名不能为空");
				return false;
			}else {
				return true;
			}
		}
	
	</script>
</body>
</html>