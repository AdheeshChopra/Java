package PrcaticeSheet1;
import java.util.*;
public class AverageOf3 {
    public static void Average(float a, float b, float c){
        float avg=(a+b+c)/3;
        System.out.println("The average of 3 inputs is: "+avg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        Average(a,b,c);
    }
}