package finalexam;

import java.io.FileReader;

public class count_word_and_character {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		
		try(FileReader fm1= new FileReader("main.txt"))
		{
	int m;
      while((m=fm1.read()) !=-1)
      {
    	  //For Word count:
    	  if((char)m ==' ')
    	  {
    		  x++;
    	  }
    	  //For Count charactrer:
    	  if((char)m !=' ')
    	  {
    		  y++;
    	  }
    	  
      }
	
		} catch (Exception e) {
		System.out.println(e);
		}
		
		System.out.println("Coutn word in file:"+x);
		System.out.println("Coutn chacracter in file:"+y);
		
		

	}

}
