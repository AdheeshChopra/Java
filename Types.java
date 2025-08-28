import java.awt.*;
import java.util.*;

public class Types {
    public static void main(String[] args){
//        Primitive Data Types
        byte age=20;
        long bodyCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        int myAge=30;
        int herAge=myAge;
        System.out.println(age);
        System.out.println(herAge);

//        Reference Data Types
        Date now = new Date();
        System.out.println(now);

//        Primitive VS Reference Types
        byte x=1;
        byte y=x;
        x=2;
        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2= point1;
        point1.x = 2;
        System.out.println(point2);
    }
}
