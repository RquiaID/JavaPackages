package class15;

public class Task {
    //Create a method createEmail(). Based on values of users firstName, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    //return type  is string
    // method name is CreateEmail
    // parameters are string fristName, String lastName string emailType
    // in the body we need to concat
    String createEmail(String fristName,String lastName ,String emailType ){
        return fristName+lastName+"@"+emailType+"com";

    }





    }



