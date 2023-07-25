package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nameAccount = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char caractere = sc.next().charAt(0);
		
		if (caractere == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(numberAccount, nameAccount, initialDeposit);
		}
		else {
			account = new Account(numberAccount, nameAccount);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double mount = sc.nextDouble();
		account.deposit(mount);
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		mount = sc.nextDouble();
		account.withdraw(mount);
		System.out.println(account);
		
		sc.close();
	}
}