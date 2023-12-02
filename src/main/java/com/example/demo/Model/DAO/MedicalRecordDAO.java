package com.example.demo.Model.DAO;

import com.example.demo.Model.bean.MedicalRecord;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordDAO {
    private Connection cnn;

    public MedicalRecordDAO() {
        String url = "jdbc:mysql://localhost/thongtinbenhan";
        String user = "root";
        String password = "";

        try {
            cnn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<MedicalRecord> getAllMedicalRecords() throws SQLException {
        List<MedicalRecord> medicalRecords = new ArrayList<>();
        String query = "SELECT * FROM medical_records";

        try (PreparedStatement statement = cnn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int recordId = resultSet.getInt("record_id");
                int patientId = resultSet.getInt("patient_id");
                java.sql.Date date = resultSet.getDate("date");
                String doctor = resultSet.getString("doctor");
                String diagnosis = resultSet.getString("diagnosis");
                String treatment = resultSet.getString("treatment");

                MedicalRecord medicalRecord = new MedicalRecord(recordId, patientId, date, doctor, diagnosis, treatment);
                medicalRecords.add(medicalRecord);
            }
        }

        if (cnn != null) {
            cnn.close();
        }

        return medicalRecords;
    }

}
