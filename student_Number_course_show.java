package finalexam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import swing.frame;

public class student_Number_course_show {

	public static void main(String[] args) {
		//File Create for cse311 and cse111:
		File fr = new File("cse311.txt");
		File fr2 = new File("cse111.txt");
		try {
			fr.createNewFile();
			fr2.createNewFile();
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
		/********************write in cse3118*/
			try(FileWriter frFileWriter= new FileWriter("cse311.txt"))
			{
				frFileWriter.write("std A,Std B,std C");
			} catch (Exception e) {
				System.out.println(e);
			}
			/*******************Write in cse111*******************/
try (FileWriter fmFileWriter= new FileWriter("cse111.txt"))
{
	fmFileWriter.write("std A,Std B,std C,std D,std E");
	
} catch (Exception e) {
	System.out.println(e);
}	
/*********************COnvert CSE311 file to set*********************/
Set<String>cse311= new TreeSet<String>();

try(BufferedReader rm= new BufferedReader(new FileReader("cse311.txt"))) {
	String line;
	while ((line = rm.readLine()) != null) {
        String[] parts = line.split(",");
        for (String part : parts) {  // Loop through each element of the array
            cse311.add(part.trim());  // Add each part to the set after trimming any whitespace
        }
        	
	}
	
} catch (Exception e) {
System.out.println(e);
}
/*********************COnvert CSE111 file to set*********************/
Set<String>cse111= new TreeSet<String>();

try(BufferedReader rm= new BufferedReader(new FileReader("cse111.txt"))) {
	String line;
	while ((line = rm.readLine()) != null) {
        String[] parts = line.split(",");
        for (String part : parts) {  // Loop through each element of the array
            cse111.add(part.trim());  // Add each part to the set after trimming any whitespace
        }
        	
	}
	
} catch (Exception e) {
System.out.println(e);
}
/**************************Details of CSE311********************************************/
System.out.println("Student of CSE311:");
int i=0;
for(String std:cse311)
{
	System.out.println(std+" ");
	 i++;
}
System.out.println("Number of student cse 311:"+i);
/****************Details os CSE 111************************/
System.out.println("Student of CSE111:");
int m=0;
for(String std:cse111)
{
	System.out.println(std+" ");
	 m++;
}
System.out.println("Number of student cse 111:"+m);


	}

}
