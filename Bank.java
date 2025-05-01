package com.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank  {

	ArrayList<Account> acc = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	

	public void addAccount() {
		System.out.println("Enter Account Number: ");
		int accNo = sc.nextInt();
		System.out.println("Enter Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Deposit Initial Balance in Account: ");
		double balance = sc.nextDouble();
		System.out.println("Create a Strong Password: ");
		String passwd=sc.next();
		Account account = findAccountByNumber(accNo);
        
		if (account != null) {
			System.out.println("Alredy this Account Number is Exists");
		} else {
			acc.add(new Account(accNo, name, balance,passwd));
			System.out.println("Account Created Successfully");
		}

	}

	public void getAccount() {
		System.out.println("Enter Account Number: ");
		int accNo = sc.nextInt();
		Account account = findAccountByNumber(accNo);
		if (account != null) {
			System.out.println("Account Details of the user");
			account.displayAccountInfo();

		} else {
			System.out.println("Account Number is not Found");
		}
	}

	public void verifyAccount(String s) {
		System.out.println("Enter Account Number: ");
		int accNo = sc.nextInt();
		Account account = findAccountByNumber(accNo);
		if (account != null) {
			//System.out.println("The Account Number  is Exists");
			if(s.equalsIgnoreCase("withdraw")) {
				account.withdraw();
			}
			else if(s.equalsIgnoreCase("deposit")){
				account.deposit();
			}
			else if(s.equalsIgnoreCase("changePassword")) {
				System.out.println("Enter New Password: ");
				String p=sc.nextLine();
				sc.nextLine();
				account.setPassword(p);
				System.out.println("Password Created Successfully");
			}
			else {
				System.out.println("The Account is Exists");
			}
		} 
		else {

			System.out.println("This Account Number doesn't Exists");
		}
	}

	public void showAllAccounts() {
		System.out.println("Display All Accounts present in Bank");
		for (Account ac : acc) {
			ac.displayAccountInfo();
		}
	}

	private Account findAccountByNumber(int accNo) {
		for (Account ac : acc) {
			if (ac.getAccountNumber() == accNo) {
				return ac;
			}
		}
		return null;
	}

}

