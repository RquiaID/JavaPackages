package class30;

public class Entry {
    int key;
    String value;

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey(){
        return key;


    }
    public String getValue(){
        return value;
    }

    @Override
    public String toString() {  // This method helps to avoid printing HashCode on the console

        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}

