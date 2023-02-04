package class15;

public class MethodPractice2 {

        // create a method that takes a String reverse it and return the reverse String.
        // call the method reverseStr
        // return String
        // reverseStr
         String reverseStr(String input){
             String newStr="";
            String str = "Sunday";
            for (int i = str.length()-1; i >=0 ; i--) {
               newStr+=input.charAt(i);
        }
            return newStr;
        }
    }

