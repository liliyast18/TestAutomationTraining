package Homework;

public class TestCaseMain {
    public static void main(String[]args){
        TestCase tc1 = new TestCase(1,"Login with valid credentials");
        System.out.println(tc1.getId());
        System.out.println(tc1.getTitle());
        System.out.println(tc1.getStatus());
    }
}
