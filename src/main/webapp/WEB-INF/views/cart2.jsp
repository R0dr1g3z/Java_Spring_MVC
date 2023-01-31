<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Cart2</title>
</head>
<body>
<c:forEach items="${cartItems}" var="cartItem">
    Product: ${cartItem.product.name} Quantity: ${cartItem.quantity} 
    <a href="fastAdd/${cartItem.product.id}">+</a> 
    <a href="fastSub/${cartItem.product.id}">-</a> 
    <a href="removeProduct/${cartItem.product.id}">REMOVE THIS PRODUCT</a> <br>
</c:forEach>
<a href="addToCart2">Back to form</a>
</body>
</html>