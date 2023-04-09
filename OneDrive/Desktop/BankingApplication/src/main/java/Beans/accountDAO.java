package Beans;

public class accountDAO {
	private String username;
	private String name;
	private String email;
	private String address;
	private String contact;
	private String amount;
	private String account_no;
	private String password;
	
	public accountDAO() {}
	

	public accountDAO(String username, String name, String email, String address, String contact, String amount,
			String account_no,String password) {
		super();
		this.username = username;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.amount = amount;
		this.account_no = account_no;
		this.password = password;
	}
	
	


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}


	@Override
	public String toString() {
		return "accountDAO [username=" + username + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", contact=" + contact + ", amount=" + amount + ", account_no=" + account_no + ", password="
				+ password + "]";
	}
	
	
	
	

}
