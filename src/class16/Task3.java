package class16;

public class Task3 {

    //Create a method that will print whether given String is palindrome or not.

    //when we have to create method to just print things without retuning anything so  here we need
    // to use void return type.
    // next we decide about the name of the method it is going to be isPalindrome.
    //Concerning Parameters, they are going to be String  under name inputStr
    // if there is a string when we reverse its characters ,and we got back the same string after reverse with no change
    //then we call it palindrome
    //ex: dad=> dad true
    //abc=> cba false
    // here we are going to  use String builder (reverse method)  I don't have to write anything from scratch
    //That method is present inside String Builder so first thing we do is to create the object of that class
    //String reverse = new StringBuilder(inputStr).reverse().toString();
    //here we have to mention the return type which is void and between brackets I am going to put parameters
    void isPalindrome(String str){
        StringBuilder st= new StringBuilder(str);
        // call method if I already hae object of a class by
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" Not is palindrome");
        }


    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
        //String result= task3.isPalindrome("Kaya); can't assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya")); can't use void methods in PrintLn
        // we can not print anything because it has no value
        task3.isPalindrome("kaya");

        }
    }






