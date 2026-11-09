/// /Write a method getMax() with two parameters that returns the bigger of two integers.
public class MethodsEx {
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;

        }
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 12;
        int result = getMax(x, y);
        System.out.println(result);

        task2();
    }

    public static void task2() {
        int x = 9;
        int y = 1;
        System.out.println(getMax(x, y));
    }

}
//
//
////Write a program that passes two integers and prints the biggest of them using the method getMax().
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




