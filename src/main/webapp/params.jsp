<%--
  Created by IntelliJ IDEA.
  User: gbn
  Date: 2020/11/24
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--请求绑定参数--%>
<%--<a href="param/testParam?username=heihei">请求参数绑定</a>--%>

<form action="/param/saveAccount" method="post">
    昵称：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    姓名：<input type="text" name="user.name"/><br/>
    年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交"/><br/>
</form>

</body>
</html>
