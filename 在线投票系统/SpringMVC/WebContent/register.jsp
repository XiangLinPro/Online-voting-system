<%@page import="login.User"%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
if(request.getAttribute("user")==null){
login.User user=new login.User();
request.setAttribute("user",user);}
%>

</head>
<body>
<form:form action="reg" method="POST" modelAttribute="user">
<!--<a href="changeLocale?locale=zh_CH">中文</a>
<a href="changeLocale?locale=en_US">English</a>
--><table border="0">
<tr>
<td>用&nbsp;户&nbsp;名：</td>
<td><form:input path="username" />*
<form:errors path="username"></form:errors>
</td>
</tr>
<tr>
	<td>密&nbsp;&nbsp;&nbsp;码：</td>
	<td><form:password path="password" />*
	<form:errors path="password"></form:errors>
	</td>
</tr>
<tr>
	<td>确认密码：</td>
	<td><form:password path="password2" />*
	<form:errors path="samePassword"></form:errors>
	</td>
</tr>
<tr>
	<td>性&nbsp;&nbsp;&nbsp;别：</td>
	<%Map<String, String> genders = new HashMap<String, String>();
		genders.put("1", "男");
		genders.put("0", "女");
		request.setAttribute("genders", genders);	%>
	<td><form:radiobuttons path="sex" items="${genders}"
		delimiter="&nbsp;" /></td>
</tr>
<tr>
	<%Map<String, String> works = new HashMap<String, String>();
	works.put("0", "学生");
	works.put("1", "老师");
	works.put("2", "工人");
	request.setAttribute("works", works);
	%>
	<td>职&nbsp;&nbsp;&nbsp;业：</td>
	<td><form:select path="work" items="${works}" />
</tr>
<tr>
	<td>个人爱好：</td>
	<%Map<String, String> favourites = new HashMap<String, String>();
	favourites.put("0", "影视娱乐");
	favourites.put("1", "电脑网络");
	favourites.put("2", "棋牌娱乐");
	request.setAttribute("favourites", favourites);
	%>
	<td><form:checkboxes path="favorite" items="${favourites}"/></td>
</tr>
<tr>
<td>个人说明：</td>
<td><form:textarea path="note" rows="3" cols="30"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="提交" name="s1"/>
&nbsp;&nbsp;&nbsp; <input type="reset" value="重置" name="s2">
</td>
</tr>


</table>
</form:form>

</body>
</html>