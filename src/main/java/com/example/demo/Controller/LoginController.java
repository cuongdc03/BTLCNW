package com.example.demo.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra thông tin đăng nhập ở đây (ví dụ: so sánh với thông tin trong cơ sở dữ liệu)
        boolean isValidUser = validateUser(username, password,response);

        if (isValidUser) {
            // Nếu thông tin đăng nhập hợp lệ, chuyển hướng đến trang thành công (ví dụ: dashboard.jsp)
            response.sendRedirect("dashboard.jsp");
        } else {
            // Nếu thông tin đăng nhập không hợp lệ, chuyển hướng đến trang đăng nhập lại
            response.sendRedirect("login.jsp");
        }
    }

    // Hàm kiểm tra thông tin đăng nhập (giả sử)
    private boolean validateUser(String username, String password,HttpServletResponse response)  {
        // Thực hiện kiểm tra thông tin đăng nhập ở đây (ví dụ: so sánh với cơ sở dữ liệu)
        // Trong ví dụ này, username và password là cứng, bạn cần thay đổi để phù hợp với cơ sở dữ liệu thực tế
        return username.equals("admin") && password.equals("admin123");
    }
}
