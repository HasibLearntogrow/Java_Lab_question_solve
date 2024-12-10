package finalexam;
//Frequency count means find the number of present number in string;
import java.util.HashMap;
import java.util.Map;

public class cont_frequency {

	public static void main(String[] args) {
		String name="learning to code is learning to create and innovate";
		String[] partS=name.split(" ");
		Map<String, Integer> freqencey= new HashMap<String, Integer>();
		for(String wordS : partS)
		{
			if(freqencey.containsKey(wordS))
			{
				int x= freqencey.get(wordS)+1;
				freqencey.put(wordS,x );
			}
			else {
				freqencey.put(wordS,1);
			}
		}
		System.out.println(freqencey);
	}

}
