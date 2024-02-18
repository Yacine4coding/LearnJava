
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        avoid magic numbers
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


//        Get the Principle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Princple:  ");
        int princple = scanner.nextLong();

//        get the annual interest Rate
        System.out.print("Annual Interest Rate:  ");
        float annualRate = scanner.nextFloat();

//        get the period (year)
        System.out.print("Period (Year):  ");
        byte periodYo = scanner.nextByte();

//        set n & r
        int n = periodYo * MONTHS_IN_YEAR;
        float r = annualRate / PERCENT / MONTHS_IN_YEAR;

//        calculate the equation
        double resutl = princple * ( (r*Math.pow((1+r),n)) / (Math.pow((1+r),n)-1));

//        Print the result as Currency
        String mrtg = NumberFormat.getCurrencyInstance().format(resutl);
        System.out.println("Mortgage : " + mrtg);
    }


}