<%--
  Created by IntelliJ IDEA.
  User: 重金BUY来的组装战神
  Date: 2021/12/10
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
 <script>
     <%
     String password = (String) request.getAttribute("password");
     %>
   alert("邮箱匹配，请重新输入密码"+<%=password%>);
   window.location = "<%=path%>/html/login.html";
 </script>
  </body>
</html>
