import java.util.Arrays;

public class MethodsHw {
    public static void main(String[] args) {
        //  Task1();
        task2();
      //  task3();
    }

    //    Write the methods sum(int[]) and average(int[]). For {4, 8, 15, 16, 23, 42} they return 108 and 18.0.
//    Watch out for integer division.
    public static void Task1() {
        int[] data = {4, 8, 15, 16, 23, 42};
        System.out.println(sum(data));
        System.out.println(average(data));
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }

    //    Write a method findMax(int[]) without using Math.max
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void task2() {
        int[] data = {4, 8, 15, 16, 23, 100};
        System.out.println(findMax(data));
    }


    public static int[] reverse(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }

        return result;
    }

    public static void task3(String[] args) {
        int[] data = {4, 8, 15, 16, 23, 42};
        int[] reversed = reverse(data);

        System.out.println(Arrays.toString(reversed));
        System.out.println(Arrays.toString(data));
    }
    public static boolean isPalindrome(String text){
        for (int i = 0; i<text.length()/2;i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;


    }
    public static void task4(String []args){
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("test"));
    }
}



