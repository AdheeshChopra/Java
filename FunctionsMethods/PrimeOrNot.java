package FunctionsMethods;
import java.util.*;
public class PrimeOrNot {
    public static void checkPrime(int n){
        boolean isPrime=true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("This is neither a prime nor composite");
            }else{
                System.out.println("This is a prime number.");
            }
        }else{
            System.out.println("This is not a prime number.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);
    }
}
