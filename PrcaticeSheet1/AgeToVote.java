package PrcaticeSheet1;
import java.util.*;
public class AgeToVote {
    public static boolean Vote(int age){
        return age > 18;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(Vote(age));
    }
}
