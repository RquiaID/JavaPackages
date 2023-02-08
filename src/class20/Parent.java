package class20;

public class Parent {
    String name;
    static String lastname;

  //private Parent(){

     // System.out.println("I am a parent class constructor"); // we can also add access modifiers to our constructors we
      //can make it private,or public.
  //}

    public static void main(String[] args) {

      Parent p=new Parent();
    }



    public void hello(){// public is Access modifier, void is nonAccess modifier

        System.out.println("hello from parent class");
    }
     protected static void bye(){

         System.out.println("protected method bye from parent class");
     }

     private void money(){

         System.out.println("private method from parent class");
     }

}
