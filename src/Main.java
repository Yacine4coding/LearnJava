import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name : ");
//        byte age = scanner.nextByte();
        String text = scanner.nextLine().trim().toUpperCase();
        System.out.println("you are " +  text);
    }


}