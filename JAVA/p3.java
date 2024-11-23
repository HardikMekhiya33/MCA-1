
import java.util.*;

class p3 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		utility obj=new utility();
        
        System.out.println("Enter a number: ");
        long no = sc.nextLong();
        
        System.out.println("Factorial: " + obj.factorial(no));
        System.out.println("Is prime: " + obj.isPrime((int) no));
        System.out.println("Is even: " + obj.isEven(no));
        System.out.println("Is odd: " + obj.isOdd(no));
    }

   
    
}

class utility
{
	 public static long factorial(long n) 
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

    public static boolean isPrime(int n) 
	{
        if (n <= 1) 
		{
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
		{
            if (n % i == 0) 
			{
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(long n) 
	{
        return n % 2 == 0;
    }

    public static boolean isOdd(long n) 
	{
        return n % 2 != 0;
	}
	
}
