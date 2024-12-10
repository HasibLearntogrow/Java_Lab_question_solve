package finalexam;
//Reverse any line without reverse word:
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverseline {

	public static void main(String[] args) {
		String line="Technical interview Preparation";
		List<String> lS= new LinkedList<String>();
		String[] partS= line.split(" ");
		for(String wd: partS)
		{
			lS.add(wd);
			
		}
		Collections.reverse(lS);
		StringBuilder SD = new StringBuilder();
		for(String word: lS)
		{
			SD.append(word+" ");
			
		}
System.out.println(SD);
	}

}
