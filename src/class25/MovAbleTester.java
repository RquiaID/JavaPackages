package class25;

public class MovAbleTester {
    public static void main(String[] args) {
        OwnAble[]ownAbles={new Dog(),new Car()};
         for(OwnAble o: ownAbles){
             o.own();
         }
        MovAble[]movAbles={new Car(),new Dog()};

        for (MovAble m: movAbles){
            m.move();


        }
    }
}
