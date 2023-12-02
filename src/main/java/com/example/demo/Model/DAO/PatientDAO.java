package com.example.demo.Model.DAO;

import com.example.demo.Model.bean.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDAO {
    // Cần tạo kết nối trong constructor hoặc các phương thức khác
    private Connection cnn;

    public PatientDAO() {
        // Khởi tạo kết nối trong constructor
        String url = "jdbc:mysql://localhost/thongtinbenhan";
        String user = "root";
        String password = "";

        try {
            cnn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace(); // Xử lý lỗi kết nối ở đây
        }
    }

    public List<Patient> getAllPatients() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        String query = "SELECT * FROM patients";

        try (PreparedStatement statement = cnn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int patientId = resultSet.getInt("patient_id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String fullName = resultSet.getString("full_name");
                java.sql.Date dob = resultSet.getDate("dob");
                String address = resultSet.getString("address");

                Patient patient = new Patient(patientId, username, password, fullName, dob, address);
                patients.add(patient);
            }
        }

        // Đóng kết nối sau khi hoàn thành
        if (cnn != null) {
            cnn.close();
        }

        return patients;
    }
}
