package Loops.ForLoop;
import java.util.*;
public class TableOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(n*i);
        }
    }
}
