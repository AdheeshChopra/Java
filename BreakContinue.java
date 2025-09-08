import java.util.*;

public class BreakContinue {
    public static void main(String[] args){
        String input = "";
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            if (input.equals("pass")) continue;
            if(input.equals("quit")) break;
            System.out.println(input);
        }
    }
}
