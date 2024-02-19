import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int nbr = scanner.nextInt();

        boolean divisible5 = (nbr % 5 == 0);
        boolean divisible3 = (nbr % 3 == 0);



        if(divisible3 && divisible5)
            System.out.println("fizzBuzz");
        else if(divisible5)
            System.out.println("fizz");
        else if(divisible3)
            System.out.println("buzz");
        else
            System.out.println(nbr);

    }
}