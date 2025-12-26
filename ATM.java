package atmproject;

import java.util.Scanner;

public class ATM {
	public static  void main(String[]args) {
		int balance=10000,withdraw=0,deposit;
		Scanner sc= new Scanner (System.in);
		while(true)
		{
			System.out.println("automated teller machine");
			System .out.println("choose 1 for withdrawn");
			System .out.println("choose 2 for Deposit");
			System.out.println("choose 3 for check Balance");
			System.out .println("choose 4 for Exit");
			System.out.print("choose the operation you want to perform:");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1: System.out.print("enter money to be withdrawn");
			withdraw=sc.nextInt();
			if(balance>=withdraw)
			{
				balance=balance-withdraw;
				System.out.println("please collect your money"); 
			}
			else
			{
				System.out.println("insufficient balance");
			}
			System.out.println("");
			break;
			case 2: System.out.print("Enter money to be deposited");
			deposit = sc.nextInt();
			balance=balance+deposit;
			System.out.println("your money has siccessfully deposited");
			System.out.println("");
			break;
			case 3: System .out.println("balance:"+balance);
			System.out.println("=========================");
			break;
			case 4: 
				System.exit(0);




			}
			


		}
	}
	
}


