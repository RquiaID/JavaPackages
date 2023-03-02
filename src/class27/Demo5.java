package class27;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<Character>characters=new ArrayList<Character>();
        characters.add('A');
        characters.add('Z');
        characters.add('D');
        characters.add('F');
        characters.add('H');
        characters.add('G');

        for(Character c:characters){//first thing we specify in enhanced for loop is the datatype then we specify any variable name like "c" then colon then name of arrayList from which we want to print
            System.out.println(c+" ");
        }
    }
}
