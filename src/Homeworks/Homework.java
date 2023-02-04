package Homeworks;

public class Homework {
    public static void main(String[] args) {
        //Password should be minimum 8 characters, if less → message=”Password is too short”.
        //Password cannot contain username if so, → message=”Password cannot contain username”.
        //Password should match confirmed password, if not  → message=“Passwords do not match”.

        String str="Blanche";
        int cha=8;
        if( str.equals(str))
            System.out.println("password is too short");


        String password = "password";
        String confirmedPassword = "Mypassword";

        if (!password.equals(confirmedPassword)) {
            System.out.println("Passwords do not match");

        }

    }
}
