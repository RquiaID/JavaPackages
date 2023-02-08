package class21;

public class Task2 {

    // Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static void method(String str1) {
        System.out.println("Method with one String");
    }

    static void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    static void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {

        method("Java"); // We don't have to write Task2.method I can just right name of method because it is static and the same package
        method("Python", "Java");
        method("C+", "Python", "Java");

    }
}
