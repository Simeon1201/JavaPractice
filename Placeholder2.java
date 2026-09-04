import java.util.*;

public class Placeholder2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int number = scanner1.nextInt();
        List<Integer> myList = Arrays.asList(1,2,3,4,5);

        int[] Arr = {3,4,5,6,7};

        System.out.println(Arrays.toString(squared(Arr)));


        System.out.println(squareList(myList));

        for(int i = 0; i < 2; i++){

            try{
                System.out.println("Enter a number:");
                int num = scanner.nextInt();

                System.out.println("Your number cubed is: " + cubed(num) + "\n");
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        int num = 1;
        while(true){
            System.out.println("Enter a number or 0 to exit:");
            num = scanner.nextInt();

            if(num==0){
                break;
            }
            System.out.println("Your number cubed is: " + cubed(num) + "\n");
        }
    }

    public static int cubed(int num){

        if(num > 1000){
            throw new IllegalArgumentException("number too large");
        }

        return num * num * num;
    }

    public static boolean isEvenChars (String word){
        return word.length() % 2 == 0;
    }

    public static List<Integer> squareList(List<Integer> nums){
        List<Integer> list = new ArrayList<>();

        for( int num : nums ){
            list.add(num*num);
        }

        return list;
    }

    public static int[] squared(int[] arr){

        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i] * arr[i];
        }

        return result;
    }

}
