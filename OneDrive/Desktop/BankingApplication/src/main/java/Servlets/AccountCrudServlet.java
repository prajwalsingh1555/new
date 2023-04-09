package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.accountDAO;
import DAO.accountinfoDAO;

/**
 * Servlet implementation class AccountCrudServlet
 */
@WebServlet("/accountcrudservlet")
public class AccountCrudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountCrudServlet() {
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String action = request.getParameter("action");
		String name,username,email,address,contact,amount,account_no;
		String password;
		accountinfoDAO ai = new accountinfoDAO();
		accountDAO ad = new accountDAO();
		switch(action) {
		case "addAccount":
			username = request.getParameter("username");
			name = request.getParameter("name");
			email = request.getParameter("email");
			contact = request.getParameter("contact");
			address = request.getParameter("address");
			amount = request.getParameter("amount");
			account_no = ""+(Math.random()*1000000);
			password = request.getParameter("password");
			account_no= "4495"+account_no.substring(8,account_no.length());
			if(name!="" && email!="" && address!="" && amount!="" && account_no!="" && contact!="" && username!="" && password!="") {
				try {
				ad.setName(name);
				ad.setEmail(email);
				ad.setContact(contact);
				ad.setUsername(username);
				ad.setAmount(amount);
				ad.setAddress(address);
				ad.setAccount_no(account_no);		
				ad.setPassword(password);
				}catch (Exception e) {
					request.getRequestDispatcher("addAccount.jsp").include(request, response);
					out.println("Duplicate entry found try again");
				}
				ai.insertAccount(ad);
				request.getRequestDispatcher("Homepage.jsp").forward(request, response);
				}
				else
				{
					request.getRequestDispatcher("Homepage.jsp").include(request, response);
					out.println("Enter All Details fill Empty Cells");
				}
			
			break;
			
		case "deposit":
				username = request.getParameter("username");
				password = request.getParameter("password");
				account_no = request.getParameter("account_no");
				amount = request.getParameter("amount");
				
			break;
			
			
		}
	}

}
