package class25;
public interface MovAble { // it has public access modifier because its name matches the file's name
  void move();
}

interface OwnAble{
  void own();
}

class Car implements MovAble, OwnAble{

  @Override
  public void move() {
    System.out.println(" I can move");
  }

  @Override
  public void own() {
    System.out.println("You can own me");
  }
}

class  Dog implements MovAble, OwnAble{

  @Override
  public void move() {
    System.out.println("I can move");
  }

  @Override
  public void own() {
    System.out.println("you can own me");
  }
}
