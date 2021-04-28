package com.servict;

import java.io.IOException;
import java.util.List;

/*import javax.security.auth.message.callback.PrivateKeyCallback.Request;*/
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Bumen;
import com.entity.FenMenu;
import com.entity.Juese;
import com.entity.Power;
import com.entity.Rank;
import com.entity.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.utils.Layui;
@WebServlet("/Servlet")
public class Servlet extends AbstractServlet{
	private UserService service = new UserServiceImpl();
	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	int YGid=0;
	public int Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		YGid = service.denlu(request.getParameter("name"), request.getParameter("pwd"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("pwd"));
		System.out.println("df");
		return YGid;
//		request.setAttribute("login", login);
//		//seleQX(request, response,login);
//		"BackJsp/InitialPage";
	}
	
	public String seleQX(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("-----------------");
		List<Power> list = service.seleq(Integer.parseInt(request.getParameter("id")));
		for (Power power : list) {
			System.out.println(power.getQxname());
		}
		request.setAttribute("list", list);//3
		return "BackJsp/InitialPage";
	}
	public String YG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int parseInt = Integer.parseInt(request.getParameter("fid"));
		List<Power> seleJsYG = service.seleJsJuese(parseInt,YGid);
		request.setAttribute("seleButton", seleJsYG);
		return "/BackJsp/YG";
	}
	public Layui<User> seleYG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Layui<User> seleYG = service.seleYG();
		return seleYG;
	}
	
	public List<Juese> seleJS(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Juese> seleJS = service.seleJuese();
		return seleJS;
	}

	public List<Bumen> seleBM(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Bumen> seleBM = service.seleBumen();
		return seleBM;
	}
	
	public List<Rank> seleZC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Rank> seleZC = service.seleRank();
		return seleZC;
	}
	
	public int addYG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User yg = new User(0, request.getParameter("name"), Integer.parseInt(request.getParameter("js")), Integer.parseInt(request.getParameter("bm")),Integer.parseInt(request.getParameter("zc")), null, null, null);
		return service.addUser(yg);
	}
	
	public int deleteYG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return service.deleteUser(Integer.parseInt(request.getParameter("id")));
	}
	
	public User echoYG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return service.echoUser(Integer.parseInt(request.getParameter("id")));
	}
	
	public int updateYG(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User yg = new User(Integer.parseInt(request.getParameter("id")), request.getParameter("name"), Integer.parseInt(request.getParameter("js")), Integer.parseInt(request.getParameter("bm")),Integer.parseInt(request.getParameter("zc")), null, null, null);
		return service.updateUser(yg);
	}
	
	public String QX(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int parseInt = Integer.parseInt(request.getParameter("fid"));
		List<Power> seleJsYG = service.seleJsJuese(parseInt,YGid);
		request.setAttribute("seleButton", seleJsYG);
		return "/BackJsp/QX";
	}
	public Layui<Power> seleALLQX(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Layui<Power> seleQX = service.selePower();
		return seleQX;
	}
	public Layui<FenMenu> seleALLQXTree(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Layui<FenMenu> seleALLQXTree = service.seleALLQXTree();
		return seleALLQXTree;
	}
	public String JS(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int parseInt = Integer.parseInt(request.getParameter("fid"));
		List<Power> seleJsYG = service.seleJsJuese(parseInt,YGid);
		request.setAttribute("seleButton", seleJsYG);
		
		return "/BackJsp/JS";
	}
	public Layui<Juese> seleALLJS(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Layui<Juese> seleALLYGJS = service.seleALLujs();
		return seleALLYGJS;
	}
	
	
	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return Servlet.class;
	}
}
