import java.util.Arrays;

public class JavaTest1 {
    public static void main() {
        System.out.println("testing stream");
        
        int[] numbers = {2, 3, 12, 1, 5, 6, 17, 8, 13, 21};
        
        int sumOfEvens = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
    //
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }

}