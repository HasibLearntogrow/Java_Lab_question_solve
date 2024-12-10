package finalexam;
//Find Angle between two vector:
import java.util.Scanner;

public class find_angel_betweentwovector {

	public static void main(String[] args) {
		System.out.println(" Enter the value of i,j and k for 1st vector:");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(" Enter the value of i,j and k for 1st vector:");
		int i2=sc.nextInt();
		int j2=sc.nextInt();
		int k2=sc.nextInt();
		double D1=Math.sqrt(i*i+j*j+k*k);
		double D2=Math.sqrt(i2*i2+j2*j2+k2*k2);
		double D1D2=i*i2+j*j2+k*k2;
		double m=D1D2/(D1*D2);
		double angle=Math.acos(m)*(180/3.1416);
		System.out.println("Angle is:"+" "+(int) Math.ceil(angle));
	}

}
