<%--
  Created by IntelliJ IDEA.
  User: mizuyeh
  Date: 2021/2/9
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <form action="dept/insert.action" method="post">
        名称 <input type="text" name="deptName">
        地址 <input type="text" name="deptAddress">
        <input type="submit" value="提交">
    </form>
</body>
</html>
