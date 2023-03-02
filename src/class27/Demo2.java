package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "Savo"; // name to be searched
        String[] names = {"Hiral", "Nima", "Laura", "Nat"}; // Array parameters or elements. Size of this array is 4, index is 3.
        // create a method which can search a name from this array
        System.out.println(contains(name,names));
    }

        public static boolean contains(String nameToBeSearched,String[]names){ // this is header part, // this is a method
            for (String name : names) {
                if (nameToBeSearched.equals(name)) {
                    return true;
                }
            }
            return false;
        }




    }

