import java.util.*;
class p2 
{
    public static void main(String args[]) 
	{
        String[] str = new String[args.length];
        for (int i = 0; i < str.length; i++) 
		{
            str[i] = args[i];
            System.out.println(str[i]);
        }
		Arrays.sort(str);
		System.out.println("sorted Strings...");
		for(String i : str)
		{
			System.out.println(i);
		}
    }
}



