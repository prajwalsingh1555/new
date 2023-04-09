package Beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

public class accountdetails {
	
	HttpSession session;
	String username=(String)session.getAttribute("username");
	public String name;
	public String email;
	public String contact;
	public String address;
	public String amount;
	public String account_no;
	public String password;

	
	
	try {
	Mycon mycon = new Mycon();
	Connection con = mycon.getConn();
	String sql = "select * from accounts where username = ?;";
	PreparedStatement pt = con.prepareStatement(sql);
	pt.setString(1, username);
	
	}catch(Exception e) {
		e.printStackTrace();
	}

	
	
}
