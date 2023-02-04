package Homeworks;

import java.sql.SQLOutput;

public class Phone {
    // Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
    String brand;
    String color;
    int price;
    int version;
    double storage;
    boolean isUnlocked;

    void ringing () {System.out.println("Ringringringring");}
    void sendingMessages(){System.out.println("SMS");}
    void calling(){System.out.println("Sending and receiving calls");}
    void UsingGPS(){System.out.println("Showing a map");}
    void playingGames(){System.out.println("Video games");}
    void CheckingAndSendingEmailS(){System.out.println("Email notifications");}

}
