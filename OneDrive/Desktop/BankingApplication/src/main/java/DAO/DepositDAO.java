package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Beans.DepositBean;
import Beans.Mycon;

public class DepositDAO {

	Mycon myconn = new Mycon();
	Connection con = myconn.getConn();
	
	public boolean insertDeposit(DepositBean db) {
		String sql = "insert into deposit(account_no, date, amount) values(?,?,?);";
		try {
			System.out.println("intered into dao");
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1,db.getAccount_no());
			pt.setString(2,db.getDate());
			pt.setString(3,db.getAmount());
			System.out.println("data sent to databases");
			return pt.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public boolean getEmployees(){
		List<DepositBean> list = new ArrayList<>();
		boolean flag = false;
		try {
			String sql = "select * from accounts;";
			PreparedStatement pt = con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()) {
				DepositBean db = new DepositBean();
				db.setAccount_no(rs.getString("account_no"));
				db.setDate(rs.getString("date"));
				db.setAmount(rs.getString("amount"));
				list.add(db);
				flag = true;
			}
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
}
