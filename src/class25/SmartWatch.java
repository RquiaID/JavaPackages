package class25;

 interface WashAble{ // this is the name of interface

    void wash();// in an interface, by default all methods are abstract we don't need to write it
               // interface method does not have a body
              // we can think of interface about something already designed to reach the abstraction.
             // public is also by default in interface
            // 99 percent if you want to achieve abstraction you go with interface


}

class SmartWatch implements WashAble{

    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issues");
    }
}

class Phone implements WashAble{

    public   void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }

}

class Inverter implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}