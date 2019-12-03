<%--
  Created by IntelliJ IDEA.
  User: 周锐
  Date: 2019/11/29
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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

<%-- 测试注解@ModelAttribute  --%>
<form action="/modelAttribute" method="post">
    用户名:<input type="text" name="username"/><br/>
    密码： <input type="text" name="password" /><br/>
    <%--    生日： <input type="text" name="date">--%>
    <input type="submit" value="提交"/>
</form>

<%-- 测试注解@ModelAttribute 被注解方法没有返回参数  --%>
<form action="/modelAttribute1" method="post">
    用户名:<input type="text" name="username"/><br/>
    密码： <input type="text" name="password" /><br/>
    <%--    生日： <input type="text" name="date">--%>
    <input type="submit" value="提交"/>
</form>

<a href="testSessionAttributions">设置属性</a>
<a href="testGetSessionAttributions">获取属性</a>
<a href="testDelSessionAttributions">删除属性</a>

<form enctype="multipart/form-data" method="post" action="/uploadFile">
    文件上传：<input name="file" type="file"/>
    <input type="submit" value="提交" />
</form>

<%--  测试异常处理   --%>
<a href="exceptions">异常处理</a>

</body>
</html>
