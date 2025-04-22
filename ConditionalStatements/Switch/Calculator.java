package ConditionalStatements.Switch;
import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("""
                1. Press 1 for Addition
                2. Press 2 for Subtraction
                3. Press 3 for Multiplication
                4. Press 4 for Division
                5. Press 5 for Modulus""");
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a/b);
                }
                break;
            case 5:
                if(b==0){
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a%b);
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
