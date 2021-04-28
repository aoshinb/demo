package com.web.pre;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Power;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.utils.DataBaseUtil;
import com.web.AbstractServlet;


@WebServlet("/log")
public class Login extends AbstractServlet {
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("utf-8");
			response.setCharacterEncoding("UTF-8");
		Connection conn=null;	
		try {
			// 获得连接对象！
			conn = DataBaseUtil.getConnection();
			// 调用数据访问层代码！
			UserService user=new UserServiceImpl();
			String name=request.getParameter("username");
			String pwd=request.getParameter("password");
			int seleid = user.denlu(name, pwd);
			System.out.println("id"+seleid);
			System.out.println(pwd);
			System.out.println(name);
			if(seleid>0) {
				List<Power> list = user.seleq(seleid);
				System.out.println(list.size());
				request.setAttribute("list", list);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			response.sendRedirect("register.jsp");
		} catch (Exception e) {
			// 捕获异常！
		} finally {
			// 释放资源！
			DataBaseUtil.closeAll(null, null, conn);
		}
	}
	@Override
	public Class getServletClass() {
		return Login.class;
	}
}