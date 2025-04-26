package Patterns;
import java.util.*;

public class SolidRectangleUserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        for(int n=1; n<=i; n++){
            for(int m=1; m<j; m++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
