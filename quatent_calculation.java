package finalexam;

import java.util.Scanner;

public class quatent_calculation {

	public static void main(String[] args) {
		System.out.println("Enter value of(x,y):");
		double x,y;
		Scanner sc = new Scanner(System.in);
		x=sc.nextDouble();
		y= sc.nextDouble();
		if(x==0 && y==0)
		{
			System.out.println("This is orgin");
			}
		else if(x==0 && y!=0)
		{
			System.out.println("This is Y axis");
		}
		else if(x!=0 && y==0)
		{
			System.out.println("This is x axis");
		}
		else if(x>0 && y>0)
		{
			System.out.println("This is 1st quatent");
		}
		else if(x<0 && y>0)
		{
			System.out.println("This is 2nd quatent");
		}
		else if(x<0 && y<0)
		{
			System.out.println("This is 3rd quatent");
		}
		else if(x>0 && y<0)
		{
			System.out.println("This is 4th quatent");
		}
		else {
			System.out.println("Please enter valid value of x,y");
		}

	}

}
