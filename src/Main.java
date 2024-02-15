import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Primitive types
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isElgble = false;
//        System.out.println(age);

//         Reference types

        Date now = new Date();
//        System.out.println(now);
        //    Primitive types vs  Reference types

        byte x = 1;
        byte y = x;
        x = 2;// didn't effect Y
//        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2; // did effect point2
//        System.out.println(point2);

//        Strings

        String message = "c:\\Windows\\...";

//        System.out.println(message.replace("😎🙂",""));
        System.out.println(message);   // didn't effect the original msg
    }


}