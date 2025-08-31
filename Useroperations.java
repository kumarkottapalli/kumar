package accountholder;

import java.util.*;
public class Useroperations {
	
	 
	static Scanner sc = new Scanner(System.in);
	public static void credit(long Accountnumber) {
		for(int i=0;i<AdminLogin.acount;i++)
		{
			if(AdminLogin.accounts[i].getAccountNumber()==(Accountnumber))
			{  System.out.println("Enter the pin : ");
				String s=sc.next();
				
				if(AdminLogin.accounts[i].getPin().equals(s)) {
					System.out.println("Enter Amount");
					double Amount = sc.nextInt();
				double bal = AdminLogin.accounts[i].getBalance();
				bal +=Amount;
				AdminLogin.accounts[i].setBalance(bal);	
			       System.out.println("credited amount and total balance is"+bal);
				break;}else {
					credit(Accountnumber);
				}
				
				}  
			else {
				System.out.println("No such type of account");
				credit(Accountnumber);
				break;}}			
	}
	
	public static void debit(long Accountnumber) {
		
int count=0;
		for(int i=0;i<AdminLogin.acount;i++){
			
			if(AdminLogin.accounts[i].getAccountNumber()==(Accountnumber))	
			{     count++;
			System.out.println("Enter pin");
			String s=sc.next();
			if(AdminLogin.accounts[i].getPin().equals(s)) {
				
				System.out.println("Enter Amount");
				double Amount = sc.nextInt();
				double bal = AdminLogin.accounts[i].getBalance();
				bal -=Amount;
		
				AdminLogin.accounts[i].setBalance(bal);		
				System.out.println("the total balance after debit : "+bal);
				break;}else {
					System.out.println(" pleaseenter correct pin");
					debit(Accountnumber);
				}
				} 
			
		}
		
			if(count==0) {
				System.out.println("No such type of account");
				debit(Accountnumber);
				}
			
			
		}
	
	public static void viewbalance() {
		System.out.println("Enter Accno");
		long acn = sc.nextLong();
		int count =0;
		for(int i=0;i<AdminLogin.acount;i++)
		{
			if(AdminLogin.accounts[i].getAccountNumber()==(acn))
			{     count++;
				double bal = AdminLogin.accounts[i].getBalance();
				System.out.println(bal);
				}  
			}
			if(count==0) {
				System.out.println("No such type of account");
			  viewbalance();}
	}

}
