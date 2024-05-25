package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stock_Holders")
public class StockHolder {
	
	@Id
	@Column(name = "act_no")
	private int accountNo;
	
	@Column(name = "acc_name")
	private String name;
	
	@Column(name = "registered_email")
	private String email;
	
	public StockHolder() {
		
	}

	public StockHolder(int accountNo, String name, String email) {
		this.accountNo = accountNo;
		this.name = name;
		this.email = email;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
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

	@Override
	public String toString() {
		return "StockHolder [accountNo=" + accountNo + ", name=" + name + ", email=" + email + "]";
	}	
	
}