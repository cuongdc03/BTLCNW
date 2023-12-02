<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Danh sách bệnh án</title>
</head>
<body>
<h1>Danh sách bệnh án</h1>
<table border="1">
  <thead>
  <tr>
    <th>Mã bệnh án</th>
    <th>Mã bệnh nhân</th>
    <th>Ngày</th>
    <th>Bác sĩ</th>
    <th>Chẩn đoán</th>
    <th>Điều trị</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="record" items="${medicalRecords}">
    <tr>
      <td>${record.recordId}</td>
      <td>${record.patientId}</td>
      <td>${record.date}</td>
      <td>${record.doctor}</td>
      <td>${record.diagnosis}</td>
      <td>${record.treatment}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
