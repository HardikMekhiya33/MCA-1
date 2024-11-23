import java.util.*;
class Circle 
{

   // @SuppressWarnings("unused")
    private double x, y, r;

    Circle() 
	{
        x = 10;
        y = 20;
        r = 30;
    }

    //area of circle calculate method
    public double area() 
	{
        return Math.PI * r * r;
    }

    //perimeter of circle calculate method
    public double circumference() 
	{
        return 2 * Math.PI * r;
    }

    //diameter of circle calculate method
    public double diameter() 
	{
        return 2 * r;
    }
}

public class p6 
{

    public static void main(String[] args) 
	{
        Circle c1= new Circle();
        //area
        double areac = c1.area();
        System.out.println("Area of Circle:=" + areac);
        //perimeter
        double perimeter = c1.circumference();
        System.out.println("Perimeter of Circle:=" + perimeter);
        //diameter
        double diameterc = c1.diameter();
        System.out.println("diameter of Circle:=" + diameterc);
    }
}