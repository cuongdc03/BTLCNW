<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.example.demo.Model.bean.Patient"%>
<%@ page import="java.util.List"%>
<%@ page import="com.example.demo.Model.DAO.PatientDAO"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.sql.SQLException" %>


<%

        // Xác thực người dùng thành công, hiển thị thông tin bệnh nhân
        PatientDAO patientDAO = new PatientDAO();
    List<Patient> patients = null;
    try {
        patients = patientDAO.getAllPatients();
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Thông tin bệnh nhân</title>
</head>
<body>
<h1>Danh sách bệnh nhân</h1>
<table border="1">
    <!-- Hiển thị thông tin bệnh nhân tại đây -->
    <!-- Ví dụ: -->
    <% for (Patient patient : patients) { %>
    <tr>
        <td><%= patient.getPatientId() %></td>
        <td><%= patient.getUsername() %></td>
        <td><%= patient.getFullName() %></td>
        <!-- ... -->
    </tr>
    <% } %>
</table>
</body>
</html>

<%

%>
