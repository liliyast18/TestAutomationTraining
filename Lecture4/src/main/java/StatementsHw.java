public class StatementsHw {
    public static void main(String[] args) {
//        Task1();
//        Task2();
//        Task3();
        Task4();
    }
//    Write a program that prints the number of days in a month by its number (1–12) using switch-case.
//    Ignore leap years. Print "Invalid month" for any other number.

    public static void Task1() {
        int month = 5;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }

    //Print the numbers from 1 to 30. Print "Fizz" instead of the numbers divisible by 3,
// "Buzz" for 5 and "FizzBuzz" for both.

    public static void Task2() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

//    Sum all numbers in [1, 100] that are divisible by 3 or 5.
//    Use continue to skip the others. Expected result: 2418.

    public static void Task3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

//    Print a triangle of n rows of * with nested loops: row 1 has one *, row n has n.

    public static void Task4() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




