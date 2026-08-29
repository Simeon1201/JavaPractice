import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Placeholder1 {
    public static void main(String[] args) {

        int num = 5;
        int num2 = 100;

        String name = "Bill";
        boolean flag = false;
        char letter = 'C';
        int[] arr = {1,2,3,4,5};
        int[] numbers = {2,3,4,5,6};

        String[] names1 = {"Charlie", "Drae"};
        List<String> names3 = new ArrayList<>(List.of("Charlie","Anad"));

        List<String> names2 = new ArrayList<>();
        names2.add("Bob");
        names2.add("Alice");

        // loops
        for(String n : names1){
            System.out.print(n + " ");
        }
        System.out.println();

        for(String n : names2){
            System.out.print(n + " ");
        }
        System.out.println();

        for(String n : names3){
            System.out.print(n + " ");
        }
        System.out.println();



        System.out.println(name);
        // System.out.println();

        System.out.println(sum(num,num2));
        System.out.println(mult(num,num2));

        System.out.println(Arrays.toString(numbers));
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int mult(int a, int b){
        return a*b;
    }

    public static int[] squared(int[] nums){
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length ; i++){
            result[i] = nums[i] * nums[i];
        }
        return result;
    }
}
