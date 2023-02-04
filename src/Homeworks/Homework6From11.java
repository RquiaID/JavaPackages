package Homeworks;

public class Homework6From11 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries,
        // african countries. Then print all values from that array using 2 different loops
        // and calculate how many total countries been stored
        String[][]countries= {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany", "United", "Kingdom", "France", "Spanish"},
                {"China", "India", "Japan"}
        };
        System.out.println(countries[3].length);

        int counter=0;
        for(int i=0;i<countries.length;i++){
            for(int j=0;j<countries[i].length;j++) {
                System.out.println(countries[i][j] + " ");
                counter++;
            }
            System.out.println();


        }
        // using enhanced for loop

        for(String[]country:countries){
            for(String s :country){
                System.out.println(s+ " ");
                counter++;

            }
            System.out.println();

        }
        System.out.println("Total countries"+counter);

                //country.length  tells me how many d array I have its 5 cuz i have 5 rows
                //countries[0].length will give the first whole d array
                // countries[1].length will give the second whole d array
                // countries[i]. length it tells me the size of each d array

    }
}
