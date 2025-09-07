import java.util.*;

public class ReadingInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.println("You're name is "+ name);
        System.out.println("You are "+ age+" years old.");
    }
}
