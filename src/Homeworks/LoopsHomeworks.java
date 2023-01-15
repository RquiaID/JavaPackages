package Homeworks;

public class LoopsHomeworks {
    public static void main(String[] args) {
        /*   Create a boolean variable workDay and assign true
        create int variable day and assign it to 1
        As long as it is workDay print “I need a day off” and increase day.
                Once day is 6 print “I do not need a day off anymore”
     */
        boolean workDay = true;
        int day = 1;
        while (workDay) {
            if (day <= 5) {
                System.out.println("I need a day off");

            } else {
                System.out.println("I do not need a day off anymore");
                workDay = false; // If I don't have this the loop will keep printing
            }
            day++;
            // it is equal to day=day+1 or day+=1

            // Print odd numbers between 20 and 50 (2 ways)
            for (int i = 20; i <= 50; i++) {
                if (20 % 2 != 50) {
                    System.out.println(i);

                    

                }

            }
        }
    }
}


