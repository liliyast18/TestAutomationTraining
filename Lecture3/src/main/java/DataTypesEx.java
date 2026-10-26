public class DataTypesEx {
    public static void main(String[] args) {
        PrintNumbers();
        isFemale();
        HelloWorld();
    }

    public static void isFemale() {
        boolean isFemale = true;
        System.out.println(isFemale);
    }

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

    public static void HelloWorld() {
        String a = "Hello";
        String b = "World";
        Object object = a + " " + b;
        String c = (String) object;
        System.out.println(c);
    }
}

