public class DataTypesHw {
    public static void main(String[] args) {
        //CelsiusToFahrenheit();
       // PrintSumOfDigits();
       //  LeapYear();
       //  SwapValues();
    }

    public static void CelsiusToFahrenheit() {
        byte c1 = 0;
        byte c2 = 37;
        short c3 = 100;
        double celsius_to_fahrenheit_c1 = (c1 * 9 / 5 + 32);
        double celsius_to_fahrenheit_c2 = (c2 * 9 / 5 + 32);
        double celsius_to_fahrenheit_c3 = (c3 * 9 / 5 + 32);

        System.out.println(c1 + "C = " + celsius_to_fahrenheit_c1 + " F");
        System.out.println(c2 + "C = " + celsius_to_fahrenheit_c2 + " F");
        System.out.println(c3 + "C = " + celsius_to_fahrenheit_c3 + " F");

    }

    public static void PrintSumOfDigits() {
        int number = 472;
        int digit1 = number / 100;
        int digit2 = number / 10 % 10;
        int digit3 = number % 10;
        int sum = digit1 + digit2 + digit3;
        System.out.println(sum);

    }

    public static void LeapYear() {
        int year = 2026;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + " is leap: " + isLeap);

    }

    public static void SwapValues() {
        int a = 10;
        int b = 8;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

}
