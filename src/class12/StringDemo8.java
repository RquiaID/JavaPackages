package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(2); // char method allows you to get all characters one by one
        System.out.println(c);

        for (int i = 0; i <str.length() ; i++) {

            System.out.println(str.charAt(i)); // it will print all letters one by one
              // check how many times A is repeated
              int counter=0;
              for (int j = 0; j <str.length() ; j++) {
                  if(str.charAt(i)=='a'){
                      counter++;

                  }
                  System.out.println(counter);

              }

        }
    }
}
