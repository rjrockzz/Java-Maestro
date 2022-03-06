import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int principal = (int)readNumbers("Enter principal: ", 1000 , 1000000 );
        float annualInterest = (float)readNumbers("Enter Annual Interest: ", 0 , 30 );
        byte period = (byte)readNumbers("Enter period in years: ", 1 , 30 );

        double mortgage = calculateMortgage(principal, annualInterest, period);
        String mortgageInCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageInCurrency);
    }
    public static double readNumbers(String prompt, double min, double max){
        double number;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println(prompt);
            number= scan.nextDouble();
            if(number>=min && number<=max)
                break;
            System.out.printf("Enter value in the range %f to %f", min, max);
            System.out.println();
        }
        return number;
    }
    public static double calculateMortgage(int principal, float annualInterest, byte period){
        final byte MONTHS_IN_YEAR= 12;
        final byte PERCENT= 100;
        float monthlyInterest = annualInterest/MONTHS_IN_YEAR/PERCENT;
        int numberOfPayments = period * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow( 1 + monthlyInterest, numberOfPayments ))
                / (Math.pow( 1 + monthlyInterest, numberOfPayments ) - 1);
        return mortgage;
    }

}