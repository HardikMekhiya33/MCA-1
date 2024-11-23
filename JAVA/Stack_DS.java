package org.gvp.dcs.ds;

public class Stack_DS {
    public int stack[] = new int[5];
    public int top;

    public Stack_DS() {
        top = -1;
    }

    // Push Method
    public void push(int value) 
	{
        if (top == 4) {
            System.out.println("Stack Is Overflow.!!");
        } else 
		{
            top++;
            stack[top] = value;
            System.out.println("Stack Top Value Push is:=" + stack[top]);
        }
    }

    // Pop Method
    public int pop() 
	{
        if (top == -1) {
            System.out.println("Stack is Empty.!!");
        } 
		else 
		{
            return stack[top];
        }
        return -1;
    }

    // Peek Method
    public void peek() 
	{
        if (top == -1) 
		{
            System.out.println("Stack is Empty.!!");
        } 
		else 
		{
            System.out.println("Stack Peek Value is:=" + stack[top]);
        }
    }

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