package finalexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class salery_of_Player {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		
		Map<String, Double> play = new HashMap<>();
		 try (BufferedReader br = new BufferedReader(new FileReader("Player.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(","); // Assuming CSV format
	                String name = parts[0].trim();
	                double balance = Double.parseDouble(parts[1].trim());
	                play.put(name, balance);
	            }
	        }
		
		 System.out.println("1st FIle:");
		 for(String keyS : play.keySet())
		 {
			 System.out.println(keyS+" "+play.get(keyS));
		 }
		 if (play.containsKey("PlayerA")) {
			 double upadetesalary= play.get("PlayerA")+50000;
			 play.put("PlayerA", upadetesalary);
			
		}
		 System.out.println("********************************************");
		 System.out.println("After update FIle:");
		 for(String keyS : play.keySet())
		 {
			 System.out.println(keyS+" "+play.get(keyS));
		 }

	}

}
