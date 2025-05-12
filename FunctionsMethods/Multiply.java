package FunctionsMethods;
import java.util.*;
public class Multiply {
    public static int Product(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int mul=Product(a,b);
        System.out.println(mul);
    }
}
