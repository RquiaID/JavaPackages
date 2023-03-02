package class24;

public class FinalDemo {
    public static void main(String[] args) {

         final int num=10;
        // num=20;===> here gives error because we can not change the value of final variable  once it is  assigned.

        final int numb; // we have created a constant variable
        numb=20;// after this we can not change it because we already assigned it
        // numb=30; not possible

    }
   final void noOneShouldOverrideIt(){
        System.out.println("This method should never be overridden otherwise it might break the code base");
    }
}
/*class Nelson extends FinalDemo{

   /* void noOneShouldOverrideIt() { // can't override this method as it is declared as final
        System.out.println("Let me do that");
    }
}

 */


