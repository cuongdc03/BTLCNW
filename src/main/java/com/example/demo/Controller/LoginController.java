package com.example.demo.Controller;

import com.example.demo.Model.DAO.PatientDAO;
import com.example.demo.Model.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra thông tin đăng nhập ở đây (ví dụ: so sánh với thông tin trong cơ sở dữ liệu)
        boolean isValidUser = false;
        try {
            isValidUser = validateUser(username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (isValidUser) {
            // Nếu thông tin đăng nhập hợp lệ, chuyển hướng đến trang thành công (ví dụ: dashboard.jsp)
            response.sendRedirect("patients.jsp");
        } else {
            // Nếu thông tin đăng nhập không hợp lệ, chuyển hướng đến trang đăng nhập lại
            response.sendRedirect("login.jsp");
        }
    }

    // Hàm kiểm tra thông tin đăng nhập (giả sử)
    private boolean validateUser(String username, String password) throws SQLException {
        if (username == null || password == null) {
            return false;
        }
        PatientDAO dao = new PatientDAO();
        List<User> patients = dao.getallusers();
        for (User user : patients) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }return false;
    }
}
