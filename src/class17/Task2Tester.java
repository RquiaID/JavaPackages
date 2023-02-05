package class17;

public class Task2Tester {
    public static void main(String[] args) {


        Task2 task2 = new Task2(); // this way without using static keyword
        task2.reverseStr("Monday");

 // Preference to use this
        Task2.reverseStr("Sunday");// I can just call it like that if
       // I have static keyword. We don't need to write instance first
        System.out.println(Task2.reverseStr("Sunday"));
    }
}
