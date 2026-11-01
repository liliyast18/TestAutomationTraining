public class DataTypesEx {
    public static void main(String[] args) {
//        PrintNumbers();
//        isFemale();
//        HelloWorld();
//        Employee();
//        SwapNumbers();
//        FloatDouble();
//       CharToInt();
//        SecondsIn100Years();
    }

    //Task 1
    public static void isFemale() {
        boolean isFemale = true;
        System.out.println(isFemale);
    }

    //Task 2
    public static void PrintNumbers() {
        int a = 51240;
        byte b = -113;
        int c = 4735941;
        byte d = 87;
        short e = -20000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    //Task 3
    public static void HelloWorld() {
        String a = "Hello";
        String b = "World";
        Object object = a + " " + b;
        String c = (String) object;
        System.out.println(c);
    }

    //Task 4
    public static void Employee() {
        String firstName = "Liliya";
        String familyName = "Stoyanova";
        byte age = 24;
        char gender = 'f';
        String idNumber = "1234567890";
        int employeeNumber = 38560005;
        System.out.println("Name:" + firstName + " " + familyName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Employee Number: " + employeeNumber);

    }

    // Tasks 4
    public static void SwapNumbers() {
        int number1 = 5;
        int number2 = 10;
        int swapNumber = number1;
        number1 = number2;
        number2 = swapNumber;
        System.out.println("Number 1 = " + number1 + " " + "Number 2 = " + number2);
    }

    // Task 5
    public static void FloatDouble() {
        float a = 34.567839023f;
        double b = 34.567839023D;
        System.out.println(a);
        System.out.println(b);
// Float uses 32 bits and holds about 6-7 significant decimal digits
    }

    public static void CharToInt() {
        char a = 'A';
        System.out.println((int) a);
        char symbol = (char) 72;
        System.out.println(symbol);
    }

    public static void SecondsIn100Years() {
        short days = 365;
        int minutes_in_day = 24 * 60;
        long seconds_in_a_day = minutes_in_day * 60;
        long seconds_in_a_year = seconds_in_a_day * days;
        long seconds_in_100_years = seconds_in_a_year * 100L;
        System.out.println(seconds_in_100_years);
    }

}

