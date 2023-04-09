package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Beans.Mycon;
import Beans.signupDAO;

public class userDAO {
	
	Mycon myconn = new Mycon();
	Connection con = myconn.getConn();
	
	public boolean insertEmployee(signupDAO signupdao) {
		String sql = "insert into signupinfo(name,email,contact,username,password) values(?,?,?,?,?);";
		try {
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1,signupdao.getName());
			pt.setString(2,signupdao.getEmail());
			pt.setString(3,signupdao.getContact());
			pt.setString(4,signupdao.getUsername());
			pt.setString(5,signupdao.getPassword());
			return pt.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public boolean deleteEmployee(String name) {
		return false;
		
	}
	public boolean updateEmployee(String name, String email) {
		return false;
		
	}
	public boolean getEmployee(String name) {
		return false;
		
	}
	
	public boolean getEmployees(String username, String password){
		List<loginDAO> list = new ArrayList<>();
		boolean flag = false;
		try {
			String sql = "select * from logininfo;";
			PreparedStatement pt = con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()) {
				loginDAO ld = new loginDAO();
				ld.setUsername(rs.getString("username"));
				ld.setPassword(rs.getString("password"));
				if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
					System.out.println("matched");
					flag = true;
				}
				list.add(ld);
			}
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}

}
