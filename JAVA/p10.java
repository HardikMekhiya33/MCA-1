import java.util.*;
import java.util.Scanner;
/*
interface Shape {
    double area();

    double perimeter();
}

class Rectangle_ implements Shape {
    private double length, width;

    // Constructor
    Rectangle_(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    private double base, height, side1, side2, side3;

    // Constructor
    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Circle_ implements Shape {
    private double radius;

    // Constructor
    Circle_(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class p10 {
    public static void main(String[] args) {
        // Rectangle
        Rectangle_ r1 = new Rectangle_(10, 5);
        System.out.println("Rectangle Area: " + r1.area());
        System.out.println("Rectangle Perimeter: " + r1.perimeter());

        // Triangle
        Triangle t1 = new Triangle(5, 12, 5, 12, 13);
        System.out.println("Triangle Area: " + t1.area());
        System.out.println("Triangle Perimeter" + t1.perimeter());

        // Circle
        Circle_ c1 = new Circle_(7);
        System.out.println("Circle Area: " + c1.area());
        System.out.println("Circle Perimeter" + c1.perimeter());
    }
}
*/



interface shapes
{

 double area();
 double perimeter();
}
class Rectangle1 implements shapes
{
  int v1,v2;
    Rectangle1()
    {
        v1=12;
        v2=10;
    }
    Rectangle1(int v1,int v2)
    {
        this.v1=v1;
        this.v2=v2;
    }
    public double area()
    {
              return v1*v2;
    }
    public double perimeter()
    {
        return 2*(v1+v2);
    }
}
class Triangle1 implements shapes
{
    int v3,v2,v1;
    Triangle1()
    {
       v1=10;
       v2=v1;   
       v3=13;
    }
    Triangle1(int v1,int v2)
    {
        this.v1=v1;
        this.v2=v1;
        v3=v2;
    }
   public double area()
    {
        return (v1*v3)/2;
    }
   public double perimeter()
    {
        return v1+v2+v3;
    }
}

class Circle1 implements shapes
{
  int v2;
    Circle1()
    {
        v2=5;
    }
    Circle1(int r)
    {
        v2=r;
    }
   public double area()
    {
        return 3.14*v2*v2;
    }
   public  double perimeter()
    {
        return 2*3.14*v2;
    }
}
public class p10 {
static Scanner sc=new Scanner(System.in);
  public static void operation(shapes s)
  {
    while (true)
    {
        System.out.println("\n1.Area");
        System.out.println("2.Perimeter");
        System.out.println("3.exit");
        System.out.println("Enter operation no : ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:System.out.println("\nArea : "+s.area());
                   break;
            case 2:System.out.println("Perimeter : "+s.perimeter());
                    break;
            case 3:
                   return;
            default:System.out.println("please,enter valid choice");
        }
    }
  }
  public static void main(String[] args) {
  while (true) {
    
 
    System.out.println("\nVarious shape to perform operation : ");
    System.out.println("1.Rectangle");
    System.out.println("2.Triangle");
    System.out.println("3.Circle");
    System.out.println("4.exit");
    System.out.println("Enter Shape no to perform operation  : ");
    int choice=sc.nextInt();
    if(choice==1)
    {
       System.out.println("\n1.User Default size Rectangle");
       System.out.println("2.Use Specific size Rectangle");
       System.out.println("Enter No Specific Rectange Use : ");
       int c=sc.nextInt();
       if(c==1)
       {
         Rectangle1  r = new Rectangle1();
         operation(r);
       }
       else if(c==2)
       {
         int l,b;
         System.out.println("\nEnter l and b : ");
         l=sc.nextInt();
         b=sc.nextInt();
         Rectangle1 r=new Rectangle1(l,b);
         operation(r);
       }
       else
         System.out.println("please,enter valid choice");
    }
    else if(choice==2)
    {
        System.out.println("1.User Default size Triangle");
       System.out.println("2.Use Specific size Triangle");
       System.out.println("Enter No Specific Triangle Use : ");
       int c=sc.nextInt();
       if(c==1)
       {
         Triangle1  r = new Triangle1();
         operation(r);
       }
       else if(c==2)
       {
         int l,b;
         System.out.println("\nEnter height and base : ");
         l=sc.nextInt();
         b=sc.nextInt();
         Triangle1 r=new Triangle1(l,b);
         operation(r);
       }
       else
         System.out.println("please,enter valid choice");
    }
    else if(choice==3)
    {
        System.out.println("1.User Default size Circle");
        System.out.println("2.Use Specific size Circle");
        System.out.println("Enter No Specific Circle Use : ");
        int c=sc.nextInt();
        if(c==1)
        {
          Circle1  r = new Circle1();
          operation(r);
        }
        else if(c==2)
        {
          int l,b;
          System.out.println("\nEnter Circle Radius ");
          l=sc.nextInt();
        
          Circle1 r=new Circle1(l);
          operation(r);
        }
        else
          System.out.println("please,enter valid choice");
    }
    else if(choice==4)
      System.exit(0);
    else
      System.out.println("\nPlease,entr valid choice");
  }
}
}

    
