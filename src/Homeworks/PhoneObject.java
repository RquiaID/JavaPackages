package Homeworks;

public class PhoneObject {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Iphone";
        iphone.color="Gold";
        iphone.price=1500 ;
        iphone.version=11 ;
        iphone.storage= 256;
        iphone.isUnlocked=true;

        Phone googlePixel=new Phone();
        googlePixel.brand="Pixel";
        googlePixel.color="black";
        googlePixel.price=900 ;
        googlePixel.version=7 ;
        googlePixel.storage=512 ;
        googlePixel.isUnlocked=false;
        googlePixel.sendingMessages();


        Phone phone3=new Phone();
        phone3.brand="Samsung ";
        phone3.color="Silver";
        phone3.price=700 ;
        phone3.version=9;
        phone3.storage=64 ;
        phone3.isUnlocked=false;
        phone3.ringing();



    }
}
