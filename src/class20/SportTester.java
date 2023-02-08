package class20;

public class SportTester {
    public static void main(String[] args) {
       Cricket crick= new Cricket("Cricket","Pakistan","Green helmet"); // here I have to make sure to put parameters because I had I parameterized parent class constructor
        crick.display();

       Soccer soccer=new Soccer("Soccer","Argentina","Oliver's",12);
       soccer.displayTeam();
       soccer.display();

    }
}
