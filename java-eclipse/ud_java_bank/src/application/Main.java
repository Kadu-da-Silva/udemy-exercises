package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Make an initial deposit? (y/n)");
		char op = sc.next().charAt(0);
		
		System.out.println();
		if(op == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number,holder,initialDeposit);
		} else {
			account = new Account(number,holder);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println("---------------------------------------");
		System.out.println("Deposit value | Enter - 0");
		System.out.println("Withdraw value | Enter - 1");
		System.out.println("---------------------------------------");
		
		char response = sc.next().charAt(0);
		
		if(response == '0') {
			System.out.print("Enter a deposit value: ");
			double amount = sc.nextDouble();
			account.deposit(amount);
			
			System.out.println("Update account data: ");
			System.out.println(account);
		} else if(response == '1') {
			System.out.print("Enter a withdraw value: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("Update account data: ");
			System.out.println(account);
		} else {
			System.out.println("Closed access.");
		}
		
		sc.close();
	}
}
