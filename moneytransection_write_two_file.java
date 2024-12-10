package finalexam;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class moneytransection_write_two_file {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Integer, String> old1=new HashMap<Integer, String>();
		Map<Integer, Double> old2=new HashMap<Integer, Double>();
		Map<Integer, Double> trans= new HashMap<Integer, Double>();
		/************************************************************************/
		 //Read oldmaster file
	        try (BufferedReader br = new BufferedReader(new FileReader("oldmast.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(" ");
	                int accountNo = Integer.parseInt(parts[0]);
	                 String name= parts[1];
	                double balance = Double.parseDouble(parts[2]);
	                old1.put(accountNo, name);
	                old2.put(accountNo,balance);
	               
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        /*******************************************************************************************/
	       //Read trans file: and update value:
	        
	        try (BufferedReader br = new BufferedReader(new FileReader("trans.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(" ");
	                int accountNo = Integer.parseInt(parts[0]);
	               
	                double trnasferamount = Double.parseDouble(parts[1]);
	               if(trans.containsKey(accountNo))
	               {
	            	   double updatevalue=trans.get(accountNo)+trnasferamount;
	            	  trans.put(accountNo, updatevalue); 
	               }
	               else {
					trans.put(accountNo,trnasferamount);
				}
	            
	               
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        /******************************************************************************************/
	        
	        try(BufferedWriter fr = new BufferedWriter(new FileWriter("updatemaster.txt"));
	        		BufferedWriter fr2 = new BufferedWriter(new FileWriter("log.txt")))
	        {
				//Read account number from transection file:
	        	for(int accn : old1.keySet())
				{
					/*Matchine with old1 and old2 map: if match account number then write in updatemaster file or
	        		do  not match then write in log file*/
	        		
	        		if (old2.containsKey(accn) && trans.containsKey(accn)) {
						double total=old2.get(accn)+trans.get(accn);
						fr.write(accn+" "+old1.get(accn)+" "+total);
						
						fr.newLine();
					}
					else
					{
						fr.write(accn+" "+old1.get(accn)+" "+old2.get(accn));
						fr.newLine();
                     
					}
	        		
					
				}
	        	//Find umatch transaction id:
	        	for(int num: trans.keySet())	      
	                {
    			if(!old1.containsKey(num))
    			{
        				fr2.write("Unmatchred transection id:"+" "+num);
                fr2.newLine();        					
                }
    			
        		}
	        	
			} catch (Exception e) {
				 e.printStackTrace();
				 
			}
	        
	        
	        
	}

}
