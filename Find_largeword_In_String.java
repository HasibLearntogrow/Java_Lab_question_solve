package finalexam;


public class Find_largeword_In_String {

	public static void main(String[] args) {
		String name="When God closes all the doors somewhere he leaves a little window open";
		
			String[] word= name.split(" ");
		
			String largest =word[0];
			
			for(int i=1;i<word.length;i++)
			{
				
			if(largest.length()<word[i].length())
			{
				largest=word[i];
			}
				
			}
			
System.out.println(largest);
	}

}
