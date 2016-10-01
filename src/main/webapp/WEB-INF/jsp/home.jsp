<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style>
        <%@include file="resources/css/home.css" %>
    </style>
    <title>Введите имя</title>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
        <td align="center" class="home">
            <form action="/hello">
                Пожалуйста, введите ваше имя: <br>
                <input autofocus="autofocus" type="text" spellcheck="true" name="name">
                <input type="submit" value="ввод">
            </form>
        </td>
    </tr>
</table>
</body>
</html>
