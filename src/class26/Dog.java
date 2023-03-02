package class26;

public class Dog {
    public Dog(String jacky, String green, String unknow) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String name;
    private String color;
    private String breed;
}
// purpose of getter is to access the value of the field.
// purpose of setter is setting value ,and we use void ,so we don't need any return values
// encapsulation says two things 1) create classes don't  write code in the same classes
// create getter setter methods so u have control over data ur storing in your class, so they are more secured.
