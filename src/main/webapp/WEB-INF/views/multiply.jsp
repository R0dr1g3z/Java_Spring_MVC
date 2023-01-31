<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Multiply</title>
</head>
<body>
    <style>
        table, tr, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        .firstRow {
            background-color: rgb(124, 124, 125);
        }
        tr, td {
            padding: 10px 15px;
        }
    </style>
<table>
    <tr>
        <td class="firstRow">X</td>
        <c:forEach var="i" begin="1" end="${size}">
            <td class="firstRow">${i}</td>
        </c:forEach>
    </tr>
    <c:forEach var="j" begin="1" end="${size}">
        <tr>
            <td>${j}</td>
            <c:forEach var="i" begin="1" end="${size}">
                <td>${i*j}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>