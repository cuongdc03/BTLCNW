package com.example.demo.Controller;

import com.example.demo.Model.DAO.MedicalRecordDAO;
import com.example.demo.Model.bean.MedicalRecord;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/medicalRecords")
public class MedicalRecordController extends HttpServlet {
    private MedicalRecordDAO medicalRecordDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        medicalRecordDAO = new MedicalRecordDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<MedicalRecord> medicalRecords = medicalRecordDAO.getAllMedicalRecords();
            request.setAttribute("medicalRecords", medicalRecords);
            request.getRequestDispatcher("medicalRecords.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý lỗi và thông báo cho người dùng nếu có lỗi xảy ra
            response.getWriter().println("Đã xảy ra lỗi khi lấy dữ liệu bệnh án.");
        }
    }
}
