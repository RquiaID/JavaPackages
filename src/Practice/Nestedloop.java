package Practice;

public class Nestedloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j < 2) {
                }
                System.out.println("Hello");
                continue;
            }
            System.out.println("Bye");

        }
    }
}


