package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Beans.Mycon;
import Beans.accountDAO;

public class accountinfoDAO {

	Mycon myconn = new Mycon();
	Connection con = myconn.getConn();
	
	public boolean insertAccount(accountDAO accountdao) {
		String sql = "insert into accounts(name, email, address, contact, amount, account_no, username,password) values(?,?,?,?,?,?,?,?);";
		try {
			System.out.println("intered into dao");
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1,accountdao.getName());
			pt.setString(2,accountdao.getEmail());
			pt.setString(3,accountdao.getAddress());
			System.out.println(accountdao.getAddress());
			pt.setString(4,accountdao.getContact());
			pt.setString(5,accountdao.getAmount());
			pt.setString(6,accountdao.getAccount_no());
			pt.setString(7,accountdao.getUsername());
			pt.setString(8,accountdao.getPassword());
			System.out.println("data sent to databases");
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
	
	public boolean getEmployees(){
		List<accountDAO> list = new ArrayList<>();
		boolean flag = false;
		try {
			String sql = "select * from accounts;";
			PreparedStatement pt = con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()) {
				accountDAO ld = new accountDAO();
				ld.setUsername(rs.getString("username"));
				ld.setName(rs.getString("name"));
				ld.setEmail(rs.getString("email"));
				ld.setAddress(rs.getString("address"));
				ld.setContact(rs.getString("contact"));
				ld.setAmount(rs.getString("amount"));
				ld.setAccount_no(rs.getString("account_no"));
				ld.setPassword(rs.getString("password"));
				list.add(ld);
				flag = true;
			}
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}

}
