package PrcaticeSheet1;
import java.util.*;
public class GreatestOf2 {
    public static void Greatest(int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(a==b){
            System.out.println(a+" is equal to "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Greatest(a,b);
    }
}
