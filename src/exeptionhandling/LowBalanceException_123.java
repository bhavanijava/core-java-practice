package exeptionhandling;

import java.util.Scanner;

class LowBalanceException extends Exception {
	LowBalanceException(String name) {
		super(name);
	}

}
class Account{
	int balance;
	Account(int balance){
		this.balance=balance;
	}
	public void withdraw(int amount) throws LowBalanceException{
		if(amount<=this.balance) {
			System.out.println("Collect Cach:"+amount);
			this.balance=this.balance-amount;
			
		}
		else
		{
			LowBalanceException obj=new LowBalanceException("Invalid LowBalance");
			throw obj;
		}
	}
}

public class LowBalanceException_123 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter initial balance");
		int amount=sc.nextInt();
		Account acc=new Account(amount);
		System.out.println("Account created with balance"+acc.balance);
		System.out.println("Enter withdraw amount");
		amount=sc.nextInt();
		try{
			acc.withdraw(amount);
		}
		catch(LowBalanceException e) {
			System.out.println("Exception"+e.getMessage());
		}
		System.out.println("Fnal Balance"+acc.balance);
		}

}
