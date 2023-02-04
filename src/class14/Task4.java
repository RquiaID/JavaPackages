package class14;

public class Task4 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

       // StringBuilder st = new StringBuilder("This is sentence i want to reverse");
       // System.out.println(st.reverse());// I used one stringBuilder to reverse it,but it is not in order
        //String str = st.toString();// converting a StringBuilder to String so that we call methods from String
        // there is a method that can give me individual word, but it exists in string object


        String str = "This is sentence i want to treverse";
        String[] arr = str.split(" ");// this line split a string into an array of individual strings

        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) { // reverse each word

                System.out.print(word.charAt(i));// I converted my sentence into array of words ,and I am  printing it
                // we can also use
                //for(String word:arr){
                // sout (new StringBuilder(word).reverse()+" "); //
            }
            System.out.println();


        }
    }
}




