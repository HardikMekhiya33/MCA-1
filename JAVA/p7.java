import java.util.Scanner;

class Stack 
{

    int stack[] = new int[5];
    int top;

    public Stack() 
	{
        top = -1;
    }

    // Push Method
    public void push(int value) 
	{
        if (top == 4) 
		{
            System.out.println("Stack Is Overflow.!!");
        } 
		else 
		{
            top++;
            stack[top] = value;
            System.out.println("Stack Top Value Push is:=" + stack[top]);
        }
    }

    // Pop Method
    public int pop() 
	{
        if (top == -1) 
		{
            System.out.println("Stack is Empty.!!");
        } 
		else 
		{
            return stack[top];
        }
        return -1;
    }

    // Peek Method
   /* public void peek() 
	{
        if (top == -1) 
		{
            System.out.println("Stack is Empty.!!");
        } 
		else 
		{
            System.out.println("Stack Peek Value is:=" + stack[top]);
        }
    }*/

    // Display Method
    public void traverse() 
	{
        if (top == -1) 
		{
            System.out.println("Stack is Empty.!!");
        } 
		else 
		{
            for (int i = 0; i <= top; i++) 
			{
                System.out.print(stack[i] + ",");
            }
            System.out.println();
        }
    }
}

public class p7 
{
    public static void main(String[] args) 
	{
        Stack s1 = new Stack();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Push");
        System.out.println("2 Pop");
        System.out.println("3 Peek");
        System.out.println("4 Traverse");
        System.out.println("5 Exit");

        while (true) 
		{
            int c, value, pvalue;
            System.out.print("Select the Choice:=");
            c = sc.nextInt();

            switch (c) 
			{
                case 1:
                    System.out.print("Enter the Value:=");
                    value = sc.nextInt();
                    s1.push(value);
                    break;
                case 2:
                    pvalue = s1.pop();
                    if (pvalue != -1) {
                        System.out.println("Stack Top Value Pop is:=" + pvalue);
                        s1.top--;
                    }
                    break;
                case 3:
                    s1.peek();
                    break;
                case 4:
                    s1.traverse();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pls Enter Valid Choice.!!");
            }
        }
    }
}