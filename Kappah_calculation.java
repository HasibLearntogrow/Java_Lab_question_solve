package finalexam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Kappah_calculation {

	public static void main(String[] args) throws IOException {
		List<String> lS1= new LinkedList<String>();
		List<String> lS2= new LinkedList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("expct.txt"))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(",");
	            String aa1 = parts[1].trim();
	            lS1.add(aa1);
	            String aa2 = parts[2].trim();
	            lS2.add(aa2);
	            
	            
	          
	        }
	        int FF=0,AA=0;int F1 = 0,F2=0;
	        int A1=0,A2=0;
	        double Po=0;
	        double pe=0;
	        String col1=null;
	        String col2=null;
	        double kapp=0;
	        //Count Against and Favour in 1st colom
	        for(int i=0;i<lS1.size();i++)
	        {
	        	col1=lS1.get(i);
	        	if(col1.equals("Favor"))
	        	{
	        		F1++;
	        	}
	        	if(col1.equals("Against"))
	        	{
	        		A1++;
	        	}
	        	
	        }
	        //Count Against and Favour in 2nd colom
	        for(int j=0;j<lS2.size();j++)
	        {
	        	col2=lS2.get(j);
	        	if(col2.equals("Favor"))
	        	{
	        		F2++;
	        	}
	        	if(col2.equals("Against"))
	        	{
	        		A2++;
	        	}
	        	
	        	
	        
	        }
	        //Count Favor-Favor And Against-Against Value
	        
	        for(int i=0;i<lS1.size();i++)
	        {
	        	
	        		col1=lS1.get(i);
	        		col2=lS2.get(i);
	        		if(col1.equals("Favor") && col2.equals("Favor"))
	        		{
	        			FF++;
	        		}
	        		if(col1.equals("Against") && col2.equals("Against"))
	        		{
	        			AA++;
	        		}
	        		
	        		
	        	
	        }
	        Po=(double)(FF+AA)/10;
	        double fa=(double)(F1/10.0)*(F2/10.0);
	        double aa=(double)(A1/10.0)*(double)(A2/10.0);
	        pe= fa+aa;
	        
	        double x=Po-pe;
	        double y= 1-pe;
	        kapp=x/y;
	        
	        
	        
	        
	        
	        System.out.println("F1:"+" "+F1);
	        System.out.println("A1:"+" "+A1);
	        System.out.println("F2:"+" "+F2);
	        System.out.println("A2:"+" "+A2);
	        System.out.println("FF:"+" "+FF);
	        System.out.println("AA:"+" "+AA);
	        
	        System.out.println("Kappah:"+kapp);
	        
	        
	    }

	}

}


	
	
	

