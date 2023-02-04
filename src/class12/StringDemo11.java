package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support channel. More java";
        // we only want a part of it, this method gives us new string base of number of indexes it does count spaces
        // what is the output to this substring is number output is String
        // in this case I only specify the starting point


        String newStr=str.substring(28);
        System.out.println(newStr);
        // I can also specify the starting and ending points
        System.out.println(str.substring(0,27));
    }
}
