package PrcaticeSheet1;
import java.util.*;
public class CircumferenceOfCircle {
    public static double Circumference(double radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(Circumference(radius));
    }
}
