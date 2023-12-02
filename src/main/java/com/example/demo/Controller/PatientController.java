package com.example.demo.Controller;

import com.example.demo.Model.DAO.PatientDAO;
import com.example.demo.Model.bean.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/patients")
public class PatientController extends HttpServlet {
    private PatientDAO patientDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        patientDAO = new PatientDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Patient> patients = patientDAO.getAllPatients();
            request.setAttribute("patients", patients);
            request.getRequestDispatcher("patients.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Đã xảy ra lỗi khi lấy thông tin bệnh nhân.");
        }
    }
}
