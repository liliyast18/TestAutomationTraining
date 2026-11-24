/// /Write a method getMax() with two parameters that returns the bigger of two integers.
public class MethodsEx {
//
//    public static int getMax(int a, int b) {
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//
//        }
//    }

    public static void main(String[] args) {
        arrayTask1();

//        int x = 3;
//        int y = 12;
//        int result = getMax(x, y);
//        System.out.println(result);
//
//        task2();
//    }
//
//    public static void task2() {
//        int x = 9;
//        int y = 1;
//        System.out.println(getMax(x, y));
    }

    //Write a program that allocates array of 20 integers and initializes each element by its index multiplied by 5.
// Print the obtained array on the console.
    public static void arrayTask1() {
        int[] Array = new int[20];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i * 5;
        }
            for (int number : Array) {
                System.out.println(number);
            }
        }
    }


//
//
/// /Write a program that passes two integers and prints the biggest of them using the method getMax().
//
//        public static int getMax(int a, int b) {
//            if (a > b) {
//                return a;
//            } else {
//                return b;
//            }
//        }
//
//        public static void main(String[] args) {
//            int x = 9;
//            int y = 1;
//
//            System.out.println(getMax(x, y));
//        }




