import java.util.*;
import java.util.Scanner;

class number
{
	private double n;
	
	public static boolean zero(double n)
	{
		return n==0;
	}
	public static boolean positive(double n)
	{
		return n>0;
	}
	public static boolean negative(double n)
	{
		return n<0;
	}
	public static boolean odd(double n)
	{
		return n % 2 != 0;
	}
	public static boolean even(double n)
	{
		return n % 2 == 0;
	}
	public static long factorial(double n)
	{
		 if (n == 0) 
		{
            return 1;
        }
        long result = 1;
        for (long i = 1; i <= n; i++) 
		{
            result *= i;
        }
        return result;
	}
	
}
class p4
{
	public static void main(String args[])
	{
		double no;
		int ch;
		number obj=new number();
		Scanner sc=new Scanner(System.in);
		
		
		
		while(true)
		{
			System.out.println("1. for check is zero...");
			System.out.println("2. for check is positive...");
			System.out.println("3. for check is negative...");
			System.out.println("4. for check is odd...");
			System.out.println("5. for check is even...");
			System.out.println("6. find factorial number...");
			System.out.println("7. exit");
			
			System.out.println("enter an number: ");
			no=sc.nextInt();
			System.out.println("enter your choics: ");
			ch=sc.nextInt();
			
			
			
			switch(ch)
			{
				case 1: System.out.println(obj.zero(no)); break;
				case 2: System.out.println(obj.positive(no)); break;
				case 3: System.out.println(obj.negative(no)); break;
				case 4: System.out.println(obj.odd(no)); break;
				case 5: System.out.println(obj.even(no)); break;
				case 6: System.out.println(obj.factorial(no)); break;
				case 7: System.exit(0);
				default: System.out.println("wrong choics..."); break;
			}
		
		}
	
	}
	
}