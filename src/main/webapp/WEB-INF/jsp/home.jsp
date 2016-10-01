<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        body {background: #99a6ff}
    </style>
    <title>Введите имя</title>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td align="center" style="font-size: 80px; line-height: 85px; font-family: Helvetica, Arial, sans-serif; color: #333333; padding-top: 15%;" class="padding-copy">
    <form action="/hello" style="font-size: 50px; line-height: 55px; font-family: Helvetica, Arial, sans-serif; color: #333333">
        Пожалуйста, введите ваше имя: <br>
        <input autofocus="autofocus" type="text" spellcheck="true" name="name" style="font-size: 30px; line-height: 35px">
        <input type="submit" value="ввод" style="font-size: 30px; line-height: 35px">
    </form>
    </td>
    </tr>
</table>
</body>
</html>
