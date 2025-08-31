package accountholder;
import java.util.Scanner;
import java.util.Random;
public class AdminLogin {
	
	Random rand=new Random();
	
	 public static int size;
	 private static final String ADMIN_PIN = "1234";
	
	 public static  String  Adminpin() {
		
		 return ADMIN_PIN;
	 }
	 
	 

	static Scanner sc = new Scanner(System.in);
	
	
	 static {
		 System.out.println(ConsoleColors.YELLOW+"Enter the number of members in  Bank");
		 size=sc.nextInt();
	 }
	 
	
	 static Account[] accounts=new Account[size];
	 static int acount=0;
	
	
	public void createAccount() {
	        boolean check=true;
	   if(acount<size) {
		System.out.print("Enter the Name:");
		String name=sc.next();
		
		sc.nextLine();
		System.out.println("Enter the Location");
		String location=sc.next();
		sc.nextLine();
		long min=210101120169l;
		
		long accountnumber=rand.nextLong(min);
		System.out.println("The Account number"+rand.nextLong(min));
		    min=min+1;
		
		System.out.println("enter pin:");
		String pin=sc.next();
		sc.nextLine();
		System.out.println("enter balance");
		Double balance=sc.nextDouble();
		sc.nextLine();
		Account ac=new Account(name,location,accountnumber,balance,pin);
		System.out.println("details are entered ");
		accounts[acount++]=ac;
		}else {
			System.out.println("Bank size is full");
			return;
		}
	     
		
		}
	
	
	public void viewAllAccount() {
		for(int i=0;i<acount;i++) {
			System.out.print("Ac holder Name:");
			System.out.println(accounts[i].getUsername()); 
			System.out.print("Account Number");
			System.out.print(accounts[i].getAccountNumber());
			System.out.println("Location");
			System.out.print(accounts[i].getLocation());
			System.out.println("Balance");
			System.out.print(accounts[i].getBalance());
			System.out.println("");
		}}
	
	
	public void deleteAccount(long accountNumber) {
		int count=0;
	    for (int i = 0; i < acount; i++) {
	        if (accounts[i] != null && accounts[i].getAccountNumber()==(accountNumber)) {
	            System.out.println("Account " + accountNumber + " deleted successfully.");
	            count++;
	            
	            // Shift elements left
	            for (int j = i; j < acount - 1; j++) {
	                accounts[j] = accounts[j + 1];
	            }
	            
	            // Last slot null
	            accounts[acount - 1] = null;
	            
	            // Reduce size
	            acount--;
	            return;
	        }
	    }
	    if(count>0) {
	    	System.out.println("Account not found");
	    }
	   
	}

	
	}
