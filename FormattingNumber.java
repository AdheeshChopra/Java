import java.text.*;

public class FormattingNumber {
    public static void main(String[] args){
//        $1,234,567
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        NumberFormat percent=NumberFormat.getPercentInstance();
        result = percent.format(0.12);
        System.out.println(result);

        result = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result);
    }
}
