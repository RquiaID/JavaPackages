package class13;

public class Task3 {
    public static void main(String[] args) {
        // 3) Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? boy
        //Suggested baby name: DANRY
        //
        //Example Output:
        //Mom’s first name? Mary
        //Dad’s first name? Daniel
        //Boy or Girl? girl
        //Suggested baby name: MAIEL


        String dadsName="Daniel";
        String momsName="Mary";
        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";

        if(expectation.equalsIgnoreCase("boy")){
            firstHalf=dadsName.substring(0,dadsName.length()/2); // this is how I can get the first half of dads name
            // we add 0 before dads name because we want to start from the first letter of the name
            secondHalf=momsName.substring(momsName.length()/2);// for MomsName we are only interested on the second part
            System.out.println(firstHalf+secondHalf);
        }else{
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(momsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
