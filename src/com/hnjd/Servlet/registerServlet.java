package com.hnjd.Servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnjd.vo.User;

import DBUtil.execute;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public registerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("text/html;charset=utf-8");
		
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		String userrepwd = request.getParameter("reuserpwd");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		User user = new User(username , userpwd  , phone , email);
		String sql = "select * from userinfo where username = ?";
		try {
			ResultSet rs = execute.executeQuery(sql, username);
			if(rs.next() == false){
				String sql1 = "insert into userinfo(username,password,telephone,email) values(?,?,?,?)"; 
				int result = execute.executeUpdate(sql1, user.getUsername(),user.getPassword(),user.getTelephone(),user.getEmail());
				request.setAttribute("rmsg", "("+username+")"+"注册成功");
				request.getRequestDispatcher("/success.jsp").forward(request, response);
			}else {
				request.setAttribute("rmsg", "注册失败，此账号已被注册");
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
			;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
