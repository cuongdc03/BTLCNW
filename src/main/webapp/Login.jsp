<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
<h1>Đăng nhập</h1>
<form action="Controller/LoginController" method="post">
    <label for="username">Tên đăng nhập:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Mật khẩu:</label>
    <input type="password" id="password" name="password" required><br><br>

    <input type="submit" value="Đăng nhập">
</form>
</body>
</html>
