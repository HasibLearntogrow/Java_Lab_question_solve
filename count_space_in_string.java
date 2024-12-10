package finalexam;

import java.util.Scanner;

public class count_space_in_string {

	public static void main(String[] args) {
		System.out.println("Enter 1st string:");
		Scanner sc= new Scanner(System.in);
		String word1=sc.nextLine();
		System.out.println("Enter 2nd string:");
		String word2=sc.nextLine();
		System.out.println(word2);
		int back1=0;
		int back2=0;
		
		for(int i=0;i<word1.length();i++)
		{
			
			if(word1.charAt(i)==' ')
			{
				back1++;
			}
			
		}
		
		
		
		for(int i=0;i<word2.length();i++)
		{
			
			if(word2.charAt(i)==' ')
			{
				back2++;
			}
			
		}
		if(back1==back2)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}

}
