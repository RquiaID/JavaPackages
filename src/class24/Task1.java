package class24;

public  class Task1 {

    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.


    class Computer {

        // Attributes or fields of Computer
        int RAM;
        int storage;
        String OS;


        void playVideo() {

            System.out.println("Video is playing");
        }

        void browserInternet() {
            System.out.println("Browse the internet");
        }


    }

    class Apple extends Computer {
        void playVideo() {
            System.out.println("Playing the video on quick time player");
        }

        void browserInternet() {
            System.out.println("Browsing the internet using safari");
        }

        void editVideos() {
            System.out.println("Editing on iMovies");
        }

        void installApp() {
            System.out.println("Installing the apps from App Store");
        }


    }

    class HP extends Computer {
        void browserInternet() {

            System.out.println("Browsing using chrome");
        }

        void playVideo() {
            System.out.println("Playing the video using VLC player");
        }


    }

    public  void main(String[] args) {

        Computer[] computers = {new Apple(), new HP()};
        for (Computer c : computers) {
            c.playVideo();
            c.browserInternet();
            if (c instanceof Apple) { // we are checking if the variable c contains the object of an Apple class

                Apple apple = (Apple) c; // converting the variable c back to an apple object

            }
        }
    }
}