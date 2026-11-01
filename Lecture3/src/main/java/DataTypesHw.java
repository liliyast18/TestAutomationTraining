public class DataTypesHw {
    public static void main(String[] args) {
        CelsiusToFahrenheit();
    }

    public static void CelsiusToFahrenheit() {
        byte c1 = 0;
        byte c2= 37;
        short c3 = 100;
        double celsius_to_fahrenheit_c1 = (c1 * 9 / 5 + 32);
        double celsius_to_fahrenheit_c2 = (c2 * 9 / 5 + 32);
        double celsius_to_fahrenheit_c3 = (c3 * 9 / 5 + 32);

        System.out.println(c1 + "C = " + celsius_to_fahrenheit_c1 + " F");
        System.out.println(c2 + "C = " + celsius_to_fahrenheit_c2 + " F");
        System.out.println(c3+ "C = " + celsius_to_fahrenheit_c3 + " F");

    }

}
