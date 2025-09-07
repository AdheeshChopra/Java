import java.util.*;

public class IfStatements {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's temperature: ");
        int temp= sc.nextInt();

        if(temp>30) System.out.println("It's a hot day.\nDrink plenty of water.");
        else if (temp>20) System.out.println("It's a nice day.");
        else System.out.println("It's cold.");

    }
}