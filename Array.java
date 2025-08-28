import java.util.*;

public class Array {
    public static void main(String[] args){
//        int[] numbers = new int[5];
//        numbers[0]=1;
//        numbers[1]=2;
        int[] numbers = {1,8,7,4,3};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
