package ch06.pra;

public class Account {
	private String accoutNum;	//계좌 번호
	private String accountName; // 계좌주
	private int money; 			// 금액
	
	
	public String getAccoutNum() {
		return accoutNum;
	}
	public void setAccoutNum(String accoutNUm) {
		this.accoutNum = accoutNUm;
	}
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	public Account(String accoutNum, String accountName, int money) {
		super();
		this.accoutNum = accoutNum;
		this.accountName = accountName;
		this.money = money;
	}
	
	public void plusMoney(int m) {
		this.money += m;
	}
	
	public void minusMoney(int m) {
		this.money -= m;
	}
}
