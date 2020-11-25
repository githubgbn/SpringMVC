<%--
  Created by IntelliJ IDEA.
  User: gbn
  Date: 2020/11/25
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<body>

<a href="/anno/testRequestParam?uname=heiehi">常用注解</a>

<br><br>

<a href="/anno/testPathVariable/10">测试 PathVariable 注解</a>

<br><br>

<a href="/anno/testRequestHeader">测试 RequestHeader 注解</a>

<br><br>

<form action="/anno/testRequestBody" method="post">
    姓名：<input type="text" name="username"/><br/>
    年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/><br/>
</form>

</body>
</html>
