public class StatementsHw {
    public static void main(String[] args) {
        Task1();
    }
//    Write a program that prints the number of days in a month by its number (1–12) using switch-case.
//    Ignore leap years. Print "Invalid month" for any other number.

    public static void Task1() {
        int day = 2;
        switch (day)
        {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Error!"); break;
        }

    }
}

