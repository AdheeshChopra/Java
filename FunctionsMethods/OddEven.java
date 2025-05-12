package FunctionsMethods;
import java.util.*;
public class OddEven {
    public static void Even(int n){
        if(n%2==0){
            System.out.println(n+" is an even number.");
        }else{
            System.out.println(n+" is an odd number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Even(n);
    }
}
