package Beans;

public class signupDAO {

	private String name;
	private String email;
	private String contact;
	private String username;
	private String password;
	
	public signupDAO() {}
	
	public signupDAO(String name, String email, String contact, String username, String password) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.username = username;
		this.password = password;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "signupDAO [name=" + name + ", email=" + email + ", contact=" + contact + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
}
