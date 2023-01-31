<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Add to cart</title>
</head>
<body>
<form method="post">
    <label>Choose product:</label>
    <select name="productId" id="productId">
        <c:forEach items="${products}" var="product">
            <option value="${product.id}">${product.name}</option>
        </c:forEach>
    </select><br>
    <label>Add quantity:</label>
    <input type="number" name="quantity" id="quantity" value="1"><br>
    <button>Add to cart</button>
</form>
</body>
</html>