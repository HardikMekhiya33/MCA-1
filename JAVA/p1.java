/*
import java.util.*
class p1 
{
    public static void main(String args[]) 
	{
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE;

        int[] a = new int[args.length];
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = Integer.parseInt(args[i]);
            System.out.println(a[i]);

            if (a[i] > max) 
			{
                max = a[i];
            }
            if (a[i] < min) 
			{ 
                min = a[i];
            }
        }
		Arrays.sort(a);
		System.out.println("sorted array...");
		
		for (int i : a) 
		{
			System.out.println(i);
        }
        System.out.println("max value: " + max);
        System.out.println("min value: " + min);
    }
}

*/


import java.util.Arrays;

/*(1).Write a program to read five integer numbers from command line and sort them and display minimum, maximum values out of it.*/
public class P1 {

    public static void main(String[] args) {

        try {

            int arr[] = new int[args.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Origional Value of Arr:-");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }

            System.out.println("\nSorted Value of Arr:-");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }

            System.out.println("\nMinimum Value of:" + arr[0]);
            System.out.println("Maximum Value of:" + arr[arr.length - 1]);
        } catch (NumberFormatException e) {
            System.out.println("Please Enter only Integer.!!" + e.getMessage());
        }
    }
}
