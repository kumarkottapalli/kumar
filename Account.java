package accountholder;

public class Account{
	
	 private String username;
	    private String location;
	    private long accountNumber;
	    private String pin;
	    private double balance;
	    
	    public Account(String username, String location, long accountNumber,  double balance,String pin) {
	    	
	    	setUsername( username);
	    	setLocation( location);
	    	setAccountNumber(accountNumber);
	    	setPin(pin);
	    	setBalance(balance);
		}

	 public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(Character.isAlphabetic(username.charAt(0))) {
		this.username = username;
	}}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		
		if(Character.isAlphabetic(username.charAt(0))) {
			this.location = location;
		}}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		
		this.accountNumber = accountNumber;
	}
	
	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
