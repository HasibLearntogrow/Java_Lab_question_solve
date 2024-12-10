package finalexam;
/*
Write a Java method that takes two binary string as input and estimate their simple matching 
coefficient (SMC) score as follows: (number 3) */
import java.util.Scanner;

public class SMS_claculation {

    public static void main(String[] args) {
        String x;
        String y;
        System.out.println("Enter first binary number:");
        Scanner sc =new Scanner(System.in);
        x=sc.next();
        System.out.println("Enter 2nd binary number:");
        y=sc.next();

        try {
            double man = SMC(x, y);
            System.out.println(man);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double SMC(String x, String y) throws Exception {
        int f01 = 0, f10 = 0, f00 = 0, f11 = 0;

        if (x.length() != y.length()) {
            throw new Exception("Strings must be of equal length.");
        }

        for (int i = 0; i < x.length(); i++) {
            char a = x.charAt(i);
            char b = y.charAt(i);

            if (a == '0' && b == '1') {
                f01=2;
            } else if (a == '1' && b == '0') {
                f10=1;
            } else if (a == '0' && b == '0') {
                f00=7;
            } else if (a == '1' && b == '1') {
                f11=0;
            }
        }

        // Calculate SMC
        double smc = (double) (f11 + f00) / (f01 + f10 + f11 + f00);
        return smc;
    }
}

