package class20;

public class TestingConstructors {
    public static void main(String[] args) {

        SubClass sub=new SubClass();

//  here I am calling child constructor, java goes to subclass and makes a call
// to the parent class constructor with the use of super keyword which refers ONLY
// to the immediate parent class
// even we don't have super compiler will make it for us
//constructor don't participate on inheritance because it should have the same name as its class
    }
}
