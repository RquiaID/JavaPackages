package class16;

public class Task5 {

    // Write a method to return whether given number is prime or not?

    // from requirement it says write weather a given number is prime or not
    // so data type we are going to use is boolean
    // name of the method is  not mentioned ,so we are going to call it is Prime
    // parameters is going to be int

    boolean isPrime(int number){
        int name=5;
        boolean flag=true;
        if(name>1){
            for (int i = 2; i < name; i++) {
                if(name%i==0){
                    flag=false;
                    break;
                }
            }
        }else {
            flag = false;

        }
        return flag;
    }
    public static void main(String[] args) {
         Task5 task5=new Task5();  // After return keyword java won't perform anything which mean we can not put anything
        // between brackets if we already return using return key.
        System.out.println(task5.isPrime(13));

    }
}


