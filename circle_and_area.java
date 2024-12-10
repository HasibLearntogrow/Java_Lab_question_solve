package finalexam;

import java.util.Scanner;

public class circle_and_area {

	public static void main(String[] args) {
		System.out.print("Enter Radius of circle:");
		Scanner sc = new Scanner(System.in);
		double r= sc.nextDouble();
		Circl c= new Circl(r);
		System.out.println("Radius:"+c.radius);
		System.out.println("Area:"+c.area());

	}

}
class Circl{
	double radius=0;
	Circl(double r)
	{
		radius=r;
	}
	double area()
	{
		return 3.1416*radius*radius;
	}
}
