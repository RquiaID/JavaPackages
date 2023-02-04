package Replits;

public class Task93 {
    public static void main(String[] args) {
        /*
        String “abracadabra alakazam”;
- Print out the position of the first occurrence of "c".
- Print out the position of the first occurrence of " ".
- Print out the position of the first occurrence of the variable target1.
- Print out the position of the first occurrence of the variable target2.

**Expected Output:**

```
4
```

```
11
```

```
6
```
         */
        String str= "abracadabra alakazam";
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf('d'));

    }
}
