<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/7/16
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
</body>
<h2>Hello World!</h2>
<% String ss = "index.jsp的请求";
    out.println(ss);
%>
<a href="javascript:location.href=encodeURI('/HelloMaven/hello?msg=chinese中文字符串乱码测试')">发送请求到servlet</a>
</body>
</html>