<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <meta charset="utf-8">
    <style>
        body {background: #99a6ff}
    </style>
    <title>Привет!</title>
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td align="center" style="font-size: 80px; line-height: 85px; font-family: Helvetica, Arial, sans-serif; color: #333333; padding-top: 15%;" class="padding-copy">
                <% String name = new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8");
                   name = name == null || name.length() == 0 ? "стесняшка" : name.trim();%>
            Привет, <span id="name" style="color: black" ><%= name %></span>!
            </td>
        </tr>
    </table>
</html>


<script>
    var arrColors = [ "red", "blue", "green", "darkblue", "orange", "aqua", "violet", "black", "white" ];
    var i = 0;
    var elem = document.getElementById("name");
    elem.addEventListener("click", function() {
        if (i == arrColors.length - 1) {
            i = 0;
        }
        elem.style.color = arrColors[i];
        i++;
    });
</script>

