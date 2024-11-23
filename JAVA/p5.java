import java.util.*;
import java.util.Scanner;

public class p5 
{

    public static void main(String[] args) 
	{
        int arr[][] = new int[][]{{3, 3, 3}, {2, 2, 2}};
        int brr[][] = new int[][]{{1, 1, 1}, {2, 2, 2}};

        // Addition of Matrix arr and brr
        System.out.println("addition of arr and brr");
        for (int i = 0; i < arr.length; i++) 
		{
            for (int j = 0; j < brr[i].length; j++) 
			{
                System.out.print(arr[i][j] + brr[i][j]+" ");
            }
            System.out.println();
        }

        // Subtraction of Matrix arr and brr
        System.out.println("subtraction of arr and brr");
        for (int i = 0; i < arr.length; i++) 
		{
            for (int j = 0; j < brr[i].length; j++) 
			{
                System.out.print(arr[i][j] - brr[i][j]+" ");
            }
            System.out.println();
        }

        // Multiplication of Matrix arr and brr
        System.out.println("multiplication of arr and brr");
        for (int i = 0; i < arr.length; i++) 
		{
            for (int j = 0; j < brr[i].length; j++) 
			{
                System.out.print(" "+arr[i][j] * brr[i][j]);
            }
            System.out.println();
        }

        // Division of Matrix arr and brr
        System.out.println("Division of arr and brr");
        for (int i = 0; i < arr.length; i++) 
		{
            for (int j = 0; j < brr[i].length; j++) 
			{
                System.out.print(" "+arr[i][j] / brr[i][j]);
			
            }
            System.out.println("");
        }
    }
}