import java.util.*;

public class While_DoWhileLoop {
    public static void main(String[] args){
        int i=0;
        while(i<5){
            System.out.println("Hello World "+i);
            i++;
        }
        int a=5;
        while(a>0){
            System.out.println("Hello World "+a);
            a--;
        }

        String input = "";
        Scanner sc = new Scanner(System.in);
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        }

        do{
            System.out.print("Input: ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));
    }
}
