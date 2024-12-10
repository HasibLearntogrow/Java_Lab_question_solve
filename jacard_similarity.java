package finalexam;

import java.util.HashSet;
import java.util.Set;

public class jacard_similarity {

	public static void main(String[] args) {
		String name1="Data is the new oil of the digital economy";
		String name2= "Data is a new oil";
		double jacardnum=hasib(name1, name2);
		System.out.println("Jacard number is"+" "+jacardnum);
	

	}
	public  static double hasib(String x,String y) {
		Set<String>str1 =new HashSet<String>();
		Set<String>str2 =new HashSet<String>();
		for(String word : x.split(" "))
		{
			str1.add(word);
		}
		for(String word : y.split(" "))
		{
			str2.add(word);
		}
		Set<String>intersction =new HashSet<String>(str1);
		intersction.retainAll(str2);
	
		Set<String>union =new HashSet<String>(str1);
		
		union.addAll(str2);
	
		int num1=intersction.size();
		int num2= union.size();
		double jacard= (double)num1/num2;
		return jacard;
		
	}

}
