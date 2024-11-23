
//package javaapplication8;
import java.util.*;
import java.util.Scanner;

class StackException extends Exception
{
    StackException(String s)
    {
        super(s);
    }
}
class Stack1 {
  int top, s[], max;

  Stack1() {
    max = 5;
    s = new int[max];
    top=-1;
  }

  Stack1(int len) {
    max = len;
    s = new int[max];
    top=-1;
  }

  void push(int ele)throws StackException {
    if (top == max - 1)
      throw new StackException("\nStack is Overflow..!!");
    else {
      top++;
      s[top] = ele;
    }
  }

  int pop()throws StackException{
      int rele;
    if (top == -1)
      throw new StackException("\nStack is Underflow..!!");
    else {
        rele=s[top];
        top--;
      return rele;
   
    }
  }

  void traverse()throws StackException {
    if (top == -1)
      throw new StackException("\nStack is Underflow..!!");
    else {
      System.out.print("Elements : ");
      for (int i = top; i >= 0; i--)
        System.out.print(s[i] + " ");
    }
  }
}

public class p12 {
  static Scanner sc=new Scanner(System.in);
  public static void operation(Stack1 s)
  {
     int ele;
      while (true)
      {
        try
        {
         System.out.println("\n1.PUSH");
         System.out.println("2.POP");
         System.out.println("3.Traverse");
         System.out.println("4.Exit");
         System.out.println("Enter Your Choice : ");
         int c=sc.nextInt();
         switch (c) {
          case 1:
             System.out.println("Enter New Element : ");
            ele = sc.nextInt();
            s.push(ele);
            break;
          case 2:
            int rele=s.pop();
            System.out.println("\nRemove Element : "+rele);
            break;
          case 3:
            s.traverse();
            break;
          case 4:
            System.exit(0);
          default:System.out.println("\nPlease,enter valid one above choice");
            break;
         }
      }
      catch(StackException e)
      {
          System.out.print("\nError : "+e.getMessage());
          e.printStackTrace();
      }
      catch(Exception e)
      {
        System.out.println("\nError : "+e.getMessage());
        e.printStackTrace();
      }
    }
   
  }
  public static void main(String args[])
  {

    boolean t=true;
    while(t)
    {
	     System.out.println("1.Default Stack");
       System.out.println("2.User Length Stack");
       System.out.println("Enter Your Choice : ");
       int c=sc.nextInt();
       if(c==1)
       {
          Stack1 s1=new Stack1();
          operation(s1);
          t=false;
       }
       else if(c==2)
       {
           System.out.println("Enter Stack Length : ");
           c=sc.nextInt();
           Stack1 s2=new Stack1(c);
           operation(s2);
           t=false;
       }
      else
      {
       System.out.println("\nPlease,enter one of above choice");
      }
  }
  }
}
