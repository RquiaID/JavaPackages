package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java.I write a lot of code daily. I am from Batch 15 .";
        // we can get individual sentences using this method which break down these sentence into array of strings
        // this method is called split
        String[] strArr=str.split("[.?!]");

        System.out.println(strArr.length); // sometimes we use length with() sometimes without it.
        // we should use length without  parenthesis when we are working with arrays
        // we use it with parenthesis when we are working with Strings

        System.out.println(strArr[0]);// if I want to print the first sentence I use the first index which is [0].
        System.out.println(strArr[2].trim());// to remove the space at the beginning of the sentence

    }
}
