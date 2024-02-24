import java.util.HashMap;
import java.util.Scanner;

public class ChiliPeppers {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        HashMap<String, Integer> spicyness = new HashMap<String, Integer>();

        spicyness.put("Poblano", 1500);
        spicyness.put("Mirasol", 6000);
        spicyness.put("Serrano", 15500);
        spicyness.put("Cayenne", 40000);
        spicyness.put("Thai", 75000);
        spicyness.put("Habanero", 125000);

        int numOfPeppers = intScanner.nextInt();

        int totalSpice = 0;

        for (int index = 0; index < numOfPeppers; index++) {
            String pepper = stringScanner.nextLine();

            for (String i : spicyness.keySet()) {
                if (pepper.equals(i)) {
                    totalSpice += spicyness.get(pepper);
                }
            }
        }

        System.out.println(totalSpice);

        intScanner.close();
        stringScanner.close();
    }
}
