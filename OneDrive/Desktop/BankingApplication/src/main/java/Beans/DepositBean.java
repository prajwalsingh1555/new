package Beans;

public class DepositBean {
	private String account_no;
	private String date;
	private String amount;
	
	public DepositBean() {}
	
	
	public DepositBean(String account_no, String date, String amount) {
		super();
		this.account_no = account_no;
		this.date = date;
		this.amount = amount;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "DepositBean [account_no=" + account_no + ", date=" + date + ", amount=" + amount + "]";
	}
	
	
}
