package encapsulation;

/*
 은행계좌
 * */

public class Account {
	private int bankbookNo;

	public Account() {
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
	}
	public int getBankbookNo() {
		return bankbookNo;
	}
}


