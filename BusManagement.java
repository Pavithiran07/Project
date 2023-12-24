package First;
import java.util.Scanner;

public class BankingManagement {
	 static void deposit(int c)//DEPOSIT
	{
		System.out.println("Enter your deposit amount");
		Scanner s = new Scanner(System.in);
		int deposit =s.nextInt();
		int totalamount = c + deposit;
		if(deposit<500)
		{
			System.out.println("Minimum deposit amount is Rupess 500");
			deposit(c);
		}
		else if(deposit>10000)
		{
			System.out.println(" Maximum deposit amount is Rupess 10000");
			deposit(c);
		}
		else
		{
			System.out.println(deposit+"Rupess is deposted to your account");
			System.out.println("Current balance = "+totalamount);
		}
		int x = totalamount;
		System.out.println("press 1 if you want receipt");
		System.out.println("press 2 to finish transaction");
		int p =s.nextInt();
		if(p==1)
		{
			System.out.println("current balance = "+x);
			System.out.println("your last transaction");
			System.out.println("you deposited Rupess "+deposit);
		}
		else if(p==2)
		{
			System.out.println("Thank you ");
			System.out.println("Transaction finished");
		}
		else
		{
			System.out.println("Enter the correct number");
		}
	}
	 //-------------------------------------------------
	static void withdraw(int cur)//WITHDRAW
	 {
		 System.out.println("Enter withdraw amount");
		 Scanner sc = new Scanner(System.in);
			int withdraw =sc.nextInt();
			int total = cur - withdraw;
			if(withdraw<500)
			{
				System.out.println("Minimum withdraw amount is Rupess 500");
			}
			else if(withdraw>10000)
			{
				System.out.println(" Maximum withdraw amount is Rupess 10000");
			}
			else
			{
				System.out.println(withdraw+"Rupess is withdraw to your account");
				System.out.println("Current balance = "+total);
			}
			System.out.println("press 1 if you want receipt");
			System.out.println("press 2 to finish transaction");
			int p =sc.nextInt();
			if(p==1)
			{
				System.out.println("current balance = "+total);
				System.out.println("your last transaction");
				System.out.println("you withdraw Rupess"+withdraw);
			}
			else if(p==2)
			{
				System.out.println("Thank you ");
				System.out.println("Transaction finished");
			}
			else
			{
				System.out.println("Enter the correct number");
			}
			
	 }
	//--------------------------------------------------
	static void current(int cu)//CURRENT BALANCE
	{
		System.out.println("your current balance = "+cu);
		start();
	}
	//--------------------------------------------------
	static void recipt(int cure)//RECIPT
	{
		System.out.println("current balance = "+cure);
		System.out.println("Take recipt");
		start();
	}
	//--------------------------------------------------
	static void run()//run function is used for recursion
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = scan.nextLine();	
		System.out.println("Hello "+name);
		int pin = 1111;
		int currentbal = 10000;
		int press;
		System.out.println("Enter your pin : ");
		int pwd = scan.nextInt();
		if(pwd==pin)
		{
			System.out.println("Your bank transaction begin ");
			System.out.println("Press 1 for deposit");
			System.out.println("Press 2 for withdraw");
			System.out.println("Press 3 for current balance");
			System.out.println("Press 4 for Recipt");
			 press = scan.nextInt();
			 switch(press)
				{
				case 1:
					deposit(currentbal);
					break;
				case 2:
					withdraw(currentbal);
					break;
				case 3:
					current(currentbal);
					break;
				case 4:
					recipt(currentbal);
				default:
					System.out.println("Enter number less than 5");
					System.out.println("Transaction failed");
				}
		}
		else
		{
			System.out.println("Your pin is wrong");
			System.out.println("Transaction failed");
		}
		start();
	}
	//--------------------------------------------------
	static void start()//program begin
	{
		Scanner sca = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to SBI");
		System.out.println("press 1 to start ");
		int pr1= sca.nextInt();
		if(pr1==1)
		{
			run();
		}
		else
		{
			System.out.println("Enter the correct number");
			start();
		}
	}
	//--------------------------------------------------
	public static void main(String args[])//MAIN FUNCTION
	{
		start();
	}
}
