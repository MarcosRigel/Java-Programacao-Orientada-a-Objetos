package application;

import java.util.Locale;
import java.util.Scanner;

import entitiess.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char opiton = sc.next().charAt(0);
		
		if (opiton == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			account = new Account(number, holder, deposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account " + account.getNumber() 
						+ ", Holder: " + holder
						+ ", Balance: $ %.2f%n", account.getBalance());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double newDeposit = sc.nextDouble();
		account.setBalance(newDeposit);
		System.out.println("Updated account data: ");
		System.out.printf("Account " + account.getNumber() 
						+ ", Holder: " + account.getHolder() 
						+ ", Balance: $ %.2f%n", account.getBalance());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble() + 5.00;
		account.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.printf("Account " + account.getNumber() 
						+ ", Holder: " + account.getHolder() 
						+ ", Balance: $ %.2f%n", account.getBalance());
		
		sc.close();
	}

}
