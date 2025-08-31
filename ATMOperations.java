package accountholder;

import java.util.Scanner;


public class ATMOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AdminLogin b = new AdminLogin();
		ATMOperations Atm = new ATMOperations();

		System.out.println(ConsoleColors.GREEN+"------------Atm started------------"+ConsoleColors.RESET);
		boolean t = true;
		while (t) {

			System.out.println(ConsoleColors.PURPLE+"\n\t1.adminLogin\n\t2.userLogin\n\t3.exit\n\t"+ConsoleColors.RESET);
			System.out.println("select above choice---------");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the admin pin :");
				
				boolean t2 = true;
				while (t2) {
					String pinnn = sc.next();
					if (b.Adminpin().equals(pinnn)) {
						boolean run = true;
						while (run) {
							System.out.println(
									"Enter the option to make below operation\n\t1.)create account \n\t2.)Delete Account \n\t3.)view AllAccount\n\t 4.)Exit");

							int n = sc.nextInt();
							switch (n) {
							case 1:
								b.createAccount();
								break;

							case 2:
								System.out.println("Enter Account number");
								long s = sc.nextLong();
								b.deleteAccount(s);
								break;

							case 3:
								
								b.viewAllAccount();
								break;

							case 4:
								run = false;
								t2 = false;
								break;

							default:
								System.out.println(ConsoleColors.RED+"Please enter correct pin"+ConsoleColors.RESET);
								break;
							}
						}

					} else {
						System.err.println(ConsoleColors.RED+"Entered pin is Wrong"+ConsoleColors.RESET);
					}
				}
				break;
			case 2:
				
				boolean run2 = true;
				while (run2) {
					System.out.println(ConsoleColors.GREEN+
							"Enter the option to make below operation\n\t1.)Credit Amount \n\t2.)Debit amount \n\t3.)viewAmount  \n\t 4.)Exit"+ConsoleColors.RESET);
					int n = sc.nextInt();
					switch (n) {
					case 1:
						System.out.println("Enter the Account number for Credit : ");
						long d = sc.nextLong();
						Useroperations.credit(d);
						
						break;

					case 2:
						System.out.println("Enter the Account number for Debit: ");
						long f = sc.nextLong();
						Useroperations.debit(f);
					
						break;

					case 3:
						Useroperations.viewbalance();
						break;

					case 4:
						run2 = false;
						break;

					default:
						System.out.println(ConsoleColors.RED+"you Entered a worng input");
						break;
					}
				}
				break;
			case 3:
				t = false;
				System.out.println(ConsoleColors.CYAN+"Thank you visit Again");
				break;

			}

		}

	}
}
