package class26;

public interface TrustAble { // name of interface
    // int age; // we can create an instance field in the interface, by default all variables that we define in interface are public, static, and final.
   // We can not have a field as protected or private all the fields are public, static, and final. All variables created are called constant.
  // we can have static method in an interface.
    int age=10;
    String color="kjhkjhjh";
    int trust();

    static void method1(){ // this is another kind of method in interface exactly as static which explain that interface can have a static method, if I remove static it will give error because it will be abstract and abstrace in interface can nt have a body (this is a good information for developers)
        System.out.println("Hello world");

    }
    default void method2(){ // this is another type of method , this is for functional programming

    }

    private void method3(){

    }

}
class Bank implements TrustAble{
    public int trust(){
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }



}
