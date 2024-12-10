
package finalexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class recall_precision_accurarcy_calculation {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        try (BufferedReader br = new BufferedReader(new FileReader("prediction.txt"))) {
            String line;
            int TP = 0, TN = 0, FP = 0, FN = 0;
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); 
                String td = parts[0].trim();
                String pt = parts[1].trim();
             if(td.equals("Favour") && pt.equals("Favour")) {
                    TP++;
                } else if(td.equals("Favour") && pt.equals("Against")) {
                    FN++;
                } else if(td.equals("Against") && pt.equals("Favour")) {
                    FP++;
                } else if(td.equals("Against") && pt.equals("Against")) {
                    TN++;
                }
            }

            // Calculate Recall, Precision, and Accuracy after all lines are processed
            double recall = (double) TP / (TP + FN);
            double precision = (double) TP / (TP + FP);
            double accuracy = (double) (TP + TN) / (TP + TN + FP + FN);
            
            System.out.println("Recall: " + recall + " Precision: " + precision + " Accuracy: " + accuracy);
        }
    }
}

