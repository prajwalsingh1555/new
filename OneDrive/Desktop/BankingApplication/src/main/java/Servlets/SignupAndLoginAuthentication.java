package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.signupDAO;
import DAO.loginDAO;
import DAO.userDAO;

/**
 * Servlet implementation class SignupAndLoginAuthentication
 */
@WebServlet("/SignupAndLoginAuthentication")
public class SignupAndLoginAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupAndLoginAuthentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entered into servlet");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String action = request.getParameter("action");
		userDAO ud = new userDAO();
		signupDAO signupdao = new signupDAO();
		String name,email,contact,username,password;
		switch(action){
		case "signup":
			System.out.println("signup");
			name = request.getParameter("name");
			email = request.getParameter("email");
			contact = request.getParameter("contact");
			username = request.getParameter("username");
			password = request.getParameter("password");
			if(name!="" && email!="" && password!="" && contact!="" && username!="") {
			try {
			signupdao.setName(name);
			signupdao.setEmail(email);
			signupdao.setContact(contact);
			signupdao.setUsername(username);
			signupdao.setPassword(password);
			}catch (Exception e) {
				request.getRequestDispatcher("signup.jsp").include(request, response);
				out.println("Duplicate data found Re-Enter Data");
			}
			ud.insertEmployee(signupdao);
			System.out.println("updated");
			request.getRequestDispatcher("index.jsp").include(request, response);
			}
			else
			{
				request.getRequestDispatcher("signup.jsp").include(request, response);
				out.println("Enter all Details");
			}
			break;
			
		case "login":
			System.out.println("login servlet");
			username = request.getParameter("username");
			password = request.getParameter("password");
			boolean flag = ud.getEmployees(username,password);
				if(flag) {
					HttpSession session = request.getSession(true);
					session.setAttribute("username", username);
					System.out.println(request.getAttribute("username"));
					System.out.println("logined");
					request.getRequestDispatcher("Homepage.jsp?action="+username+"").include(request, response);

				}
				else
				{
					request.getRequestDispatcher("index.jsp").include(request, response);
					out.println("Incorrect Username or password try again");
				}
				
			break;
			
		case "logout":
			System.out.println("logout");
			request.getSession().invalidate();
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
		}
	}

}
