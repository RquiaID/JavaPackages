package class30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

   /* Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map*/

            public static void main(String[] args) {

                HashMap<Integer, String> buildingMap = new HashMap<>();

                buildingMap.put(1, "Google");
                buildingMap.put(2, "Syntax");
                buildingMap.put(3, "Amazon");
                buildingMap.put(4, "Google");
                buildingMap.put(5, "Microsoft");
                buildingMap.put(6, "google");
                buildingMap.put(7, "Amazon");

                System.out.println( buildingMap.size());

                buildingMap.put(4, "Shell");

                buildingMap.remove(7);

                System.out.println(buildingMap);

                }
            }




