package class20;

public class Sport {
    String name;
    String country;


    Sport(String name,String country){ // parametrized cons
        this.name=name;
        this.country=country;

    }
    public void display (){
        System.out.println(name+" is played in "+country);


    }
}
class Cricket extends Sport{ // inside my child class I can make my own features

    String helmet;// here I am initializing my own feature
     Cricket(String name, String country,String helmet){
         // super makes a call to the immediate super class constructor
         //Always must be on the first line
         super( name,country); // I have to explicitly initialize my parent features using super keyword
         this.helmet=helmet;

     }
}
 class Soccer extends Sport{
    String team;// here I am initializing my own variables
    int numberOfPlayers;// same here
    Soccer(String name, String country,String team,int numberOfPlayers){
        super(name,country);// refers to the super class
        this.team=team;// this refers to the current class
        this.numberOfPlayers=numberOfPlayers;
    }
    void displayTeam(){

        System.out.println(team+" consist of "+numberOfPlayers+" players");
    }



 }



