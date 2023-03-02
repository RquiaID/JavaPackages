package class23;

public class WebDriverTester {

        public static void main(String[] args) {

            WebDriver webDriver=new Chrome(); // Up casting
            webDriver.startBrowser();
            webDriver.openURL();
            webDriver.testLoginPage();
            webDriver.closeBrowser();

            System.out.println("---------------------------");

            // If I want to perform a test  using Safari I can just change one code which is the first line

            WebDriver webDriver1=new Safari();
            webDriver1.startBrowser();
            webDriver1.openURL();
            webDriver1.testLoginPage();
            webDriver1.closeBrowser();

            System.out.println("---------------------------------------------");

 // we can also use Array and loop to call those objects

 // VERY IMPORTANT Parent class WebDriver is able to hold the objects of any child classes
 // But a child can not hold the object of parent
 // ex a vehicle can hold object of car but a car can not hold the object of a vehicle

            // This can not happen
            // FireFox fireFox=new WebDriver(); this can not happen because child class can not hold the parent class objects this is Down casting

            // This array is a shortcut of
            Chrome chrome=new Chrome();
            FireFox fireFox=new FireFox();
            Safari safari=new Safari();

            // In here I am creating the array of type parent class and initializing it, and I am storing the objects of all child classes.// This array is a shortcut of the previous call
            WebDriver []browsers={new Chrome(),new Safari(),new FireFox()};

            for(WebDriver browser:browsers){
                browser.startBrowser();
                browser.openURL();
                browser.testLoginPage();
                browser.closeBrowser();
                System.out.println("  ");
            }

// Poly means many morphism means form, in code means same exact browser method sometimes it will open chrome sometimes Safari , sometimes firefox. The condition  it should be a parent class and same method should be overridden.







        }
    }

