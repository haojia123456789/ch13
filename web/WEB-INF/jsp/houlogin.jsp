<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/20 0020
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/backend/dologin" method="post">
      <input type="hidden" value="2" name="h">
      userCode:<input type="text" name="userCode"><br/>
      userPwd:<input type="password" name="userPassword">
    <input type="submit" value="send"/>
    </form>

  </body>
</html>
