package ConditionalStatements.IfElse;
import java.util.*;
public class IfElseOddEven {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
