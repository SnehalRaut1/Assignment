package assignmentToSend;
//Assignment 30: Find the area and circumference of the circle,triangle,square,rectangle & trapezium using scanner class
import java.util.Scanner;

public class Areaof_shapes {
	
	static void circle(int r)
	{
		 double pi=3.14;
		 double area_of_circle=pi*r*r;
		 System.out.println("area_of_circle :"+area_of_circle);
	}
	
	static void circumference_of_circle(int r)
	{
		double pi=3.14;
		double circumference_of_circle =2*pi*r;
		System.out.println("circumference_of_circle :"+circumference_of_circle);
	}
	
	
	static void area_Of_triangle(int base,int height)
	{
		
		 int area_of_triangle=height*base/2;
		 System.out.println("area_of_triangle:" +area_of_triangle);
	}
	
	static void circumference_of_triangle(int a,int b,int c )
	{
	
	
	int circumference_of_triangle =(a+b+c);
	System.out.println("circumference_of_triangle :" +circumference_of_triangle);
	}
	
	static void area_Of_rectangle(int length,int width)
	{
		
		 int area_Of_rectangle=length*width;
		 System.out.println("area_Of_rectangle :" +area_Of_rectangle);
	}
	
	static void circumference_of_rectangle(int length,int width)
	{
		
		int circumference_of_rectangle =2*(length+width);
		System.out.println("circumference_of_rectangle :" +circumference_of_rectangle);
	}
	
	static void area_Of_square(int side)
	{
		
		
		 int area_Of_square =side*side;  //side square
		 System.out.println("area_Of_square :" +area_Of_square);
	}
	
	static void circumference_of_square(int side)
	{
		
		
		int circumference_of_square =4*side;
		System.out.println("circumference_of_square :" +circumference_of_square);
	}
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int r= s1.nextInt();
		circle(r);
		circumference_of_circle(r);

		int base=s1.nextInt();
		int height=s1.nextInt();
		area_Of_triangle(base,height);
		
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		circumference_of_triangle(a,b,c);
		
	int length=	s1.nextInt();
	int width=	s1.nextInt();
	area_Of_rectangle(length,width);
	circumference_of_rectangle(length,width);
	
	int side= s1.nextInt();
	area_Of_square(side);
	circumference_of_square(side);
	
	
	
		
		
	}
	

}
