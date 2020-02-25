import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault( Locale.US);
		
		Scanner sc = new  Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawlimit = sc.nextDouble();
			System.out.println();
			Account account = new Account(number, holder, balance, withdrawlimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double limit = sc.nextDouble();
			account.withdraw(limit);

		   System.out.println(account);	
		}catch (DomainException e) {
			System.out.print("Withdraw error: "+ e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}	
		sc.close();

	}

}
