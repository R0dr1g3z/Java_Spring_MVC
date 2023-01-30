<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form page</title>
</head>
<body>
    <form action="/form" method="post">
        ParamName:
        <input type="text" name="paramName" id="paramName"><br>
        ParamDate:
        <input type="date" name="paramDate" id="paramDate"><br>
        <button>Send</button>
    </form>
</body>
</html>