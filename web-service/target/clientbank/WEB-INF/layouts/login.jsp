<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 11.08.15
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
login page

<form name='loginForm'
      action="/auth/signin" method='POST'>

    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='phoneNumber' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='text' name='mdl' /></td>
        </tr>
        <tr>
            <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
    <br/>
    <a href="/join/step1">join</a>

</form>
</body>
</html>
