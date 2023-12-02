<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách bệnh nhân</title>
</head>
<body>
<h1>Danh sách bệnh nhân</h1>
<table border="1">
    <thead>
    <tr>
        <th>Mã bệnh nhân</th>
        <th>Tên đăng nhập</th>
        <th>Họ và tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="patient" items="${patients}">
        <tr>
            <td>${patient.patientId}</td>
            <td>${patient.username}</td>
            <td>${patient.fullName}</td>
            <td>${patient.dob}</td>
            <td>${patient.address}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
