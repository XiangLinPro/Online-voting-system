<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<script type="text/javascript" src="scripts/jquery-3.2.0.js"></script>
	<script type="text/javascript">
	function login(form){
		$.post(form.action,{username:form.username.value,password:form.password.value},function(data){
			alert(data);
		});
	}
	</script>
	<body>
		<form method="post" action= "/SpringMVC/lsl/login" name="logininfo">
			<h1>用户登录</h1>
			用户名：<input type=text name='username' value="001"> <br>
			密码：<input type=password name='password' value="system"> <br>
			<input type="button" name="cmdOK" value="提  交" onclick="login(this.form);"> &nbsp; 
			<input type="reset" name="cmdCancel" value="重  置">
		</form>
	</body>
</html>
