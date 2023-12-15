import java.util.Scanner;
public class BusReservation {
    static void run() {
		System.out.println("Welcome to online Siva Bus reservation");
		System.out.println("Enter your name ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello "+name);
		System.out.println("Enter the date you want to travel");
	
		System.out.println("Enter total number of people travel ");
		int num = scan.nextInt();
		scan.nextLine();
		int date = scan.nextInt();String arr[]=new String[num];
		int i;

		int j=1;
		for(i=0;i<num;i++)
		{
			System.out.println("Enter "+j+" person name");
			arr[i]= scan.nextLine();
			j++; 
		}
		
		int b[]=new int[num];
		for( i=0;i<num;i++)
		{	
			System.out.println("Enter "+arr[i]+"'s age:");
			b[i]= scan.nextInt();
		}
		for( i=0;i<num;i++)
		{
			System.out.println(arr[i]+" 's age is "+b[i]);
		}
		System.out.println("if the above information is correct press enter to continue ");
		scan.nextLine();
		scan.nextLine();
		System.out.println("press 1 for sleeper");
		System.out.println("press 2 for semi sleeper");
		int y=scan.nextInt();
		int k=num*1000,l=num*500;
		if(y==1)
		{
			System.out.println("Total cost for "+num+" persons sleeper is rupees "+k);	
		}
		else
		{
			System.out.println("Total cost for "+num+" persons sleeper is rupees "+l);
		}
		System.out.println("Press 1 for conformation");
		System.out.println("Press 2 for return Ticket");
		int h=scan.nextInt();
		int s=1;
		if(h==1)
		{
			System.out.println("Your ticket conformed");
			for( i=0;i<num;i++)
			{
				System.out.println("Date "+date+" "+arr[i]+"'s age is "+b[i]+" His seat number is A"+s);
				s++;
			}
			System.out.println("Ticket booked thankyou");	
		}
		else {
			System.out.println("-------------------------------------");	
			run();
		}
	}
	public static void main(String args[])
	{
		run();
	}
}
