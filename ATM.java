package com.atm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args)  {
		
		System.out.println("--------ATM Application--------");
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		
		while(true) {
			System.out.println("1.Create New Account\n2.View Account Details\n3.Deposit Money\n4.Withdraw Money\n5.Check Account Exists\n6.Show All Accounts\n7.Change Password\n8.Exist");
			System.out.println("Enter Your Choice");
			
		try {
			int choice=sc.nextInt();
			switch(choice) {
		
			case 1:
				 b.addAccount();
				 break;
			case 2:
				 b.getAccount();
				 break;
			case 3:
				b.verifyAccount("deposit");
				break;
			case 4:
				b.verifyAccount("withdraw");
				break;
			case 5:
				b.verifyAccount("");
				break;
			case 6:
				b.showAllAccounts();
				break;
			case 7:
				 b.verifyAccount("changepassword");
				 break;
			case 8:
				System.out.println("SEE YOU AGAIN");
				System.exit(0);
				sc.close();
			default:
				System.out.println("Enter Valid Choice");
			}
		
			}catch(InputMismatchException  e) {
				System.out.println("Enter Valid Input");
		   }
		   
		}
	}

}

