public class StatementsEx {
    public static void main(String[] args) {
//        Exercise1();
//        Exercise2();
//        Exercise3();
//        Exercise4();
//        Exercise5();
//        Exercise6();
//        Exercise7();
        Exercise8();
    }

    public static void Exercise1() {


        int a = 3;
        int b = 8;
        int c = 10;
        int max;
        if (a >= b) {
            if (a >= c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b >= c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println("Largest: " + max);
    }

    public static void Exercise2() {


        int score = 85;

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

    public static void Exercise3() {
//Write an IF statement that examines two integer
// variables and exchanges their values if the first one is greater than the second one.
        int a = 20; //swap numbers to test the first if statement
        int b = 15;
        int exchange;
        if (a > b) {
            exchange = a;
            a = b;
            b = exchange;
            System.out.println("a= " + a);
            System.out.println("b= " + b);
//        } else {
//            System.out.println("a= " + a);
//            System.out.println("b= " + b);
        }

    }

    public static void Exercise4() {
// Write a program that shows the sign of the product of three real numbers
// without calculating it. If any of the numbers is 0, print 0. Use a sequence of if statements.
        double a = 30.8;
        int b = -20;
        int c = -25;
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("0 detected");
        } else {
            double sum = a + b + c;
            if (sum > 0) {
                System.out.println("Positive");
            } else if (sum < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero sum");
            }

        }
    }

    public static void Exercise5() {
        int dayNum = 1;
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid date");

        }
    }

    //    Compare an expected and an actual page title with equals() and print PASS, or FAIL with both values.
    public static void Exercise6() {
        String expectedPageTitle = "neshto";
        String actualPageTitle = "neshto";
        if (expectedPageTitle.equals(actualPageTitle)) {
            System.out.println("PASS " + expectedPageTitle + " = " + actualPageTitle);
        } else {
            System.out.println("FAIL" + expectedPageTitle + " not equal to " + actualPageTitle);
        }
    }

    //    Write a program that prints all the numbers from 1 to 30.
    public static void Exercise7() {
        int number = 1;
        while (number <= 30) {
            System.out.println("Number is " + number);
            number++;

        }
    }

//    Write a program that prints all the numbers from 1 to 30,
//    skipping the numbers divisible by both 3 and 7 (e.g. 21)

    public static void Exercise8() {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 7 ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}