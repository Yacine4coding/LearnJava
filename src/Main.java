import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Math class
        int resutl1 = Math.round(1.1F);
        int resutl2 = (int)Math.ceil(1.1F);
        int resutl3 = Math.max(5,8);
        int resutl4 = (int) (Math.random()*100);
//        Formating Nums
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String rslt = percentInstance.format(0.5);
        System.out.println(rslt);
//        shift + f6 to change variable name
    }


}