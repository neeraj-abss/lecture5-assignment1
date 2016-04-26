

import java.util.Scanner;

abstract class calcarea{
	abstract void findtriangle(double b,double h);
	abstract void findRectangle(double l,double b);
}
class Area extends calcarea{

	void findtriangle(double b,double h){
		double area =(b*h)/2;
		System.out.println("Areaa of triangle :" +area);
	}

	void findRectangle(double l,double b){
		double area =l*b;
		System.out.println("Areaa of triangle :" +area);
	}
}

public class assignment1{
	public static void main(String[] args){
		double l, b, h;
        Area area = new Area();
        Scanner in = new Scanner(System.in);
 
        System.out.print("\nEnter Base & Vertical Height of Triangle: ");
        b = in.nextDouble();
        h = in.nextDouble();
        area.findtriangle(b, h);

        System.out.print("\nEnter Length and Breadth of Rectangle: ");
        l= in.nextDouble();
        b = in.nextDouble();
        area.findRectangle(l,b);
	}
	
}