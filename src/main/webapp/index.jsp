<%--
  Created by IntelliJ IDEA.
  User: 周锐
  Date: 2019/11/29
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>indexPage</title>
</head>
<body>
<a href="hello">点击999</a>
<form action="/hello" method="post">
    用户名:<input type="text" name="username"/><br/>
    昵称： <input type="text" name="password" /><br/>
<%--    生日： <input type="text" name="date">--%>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
