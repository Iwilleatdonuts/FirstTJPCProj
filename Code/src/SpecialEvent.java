import java.util.ArrayList;
import java.util.Scanner;

public class SpecialEvent {
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        Scanner charScanner = new Scanner(System.in);

        ArrayList<Integer> days = new ArrayList<Integer>();

        days.add(0);
        days.add(0);
        days.add(0);
        days.add(0);
        days.add(0);

        int numOfPeople = intScanner.nextInt();

        for (int i = 0; i < numOfPeople; i++) {
            for (int j = 0; j < 5; j++) {
                String availability = charScanner.next();

                if (availability.equals("Y")) {
                    days.set(j, days.get(j) + 1);
                }
            }
        }

        int highestNum = 0;

        for (int i = 0; i < 5; i++) {
            if (days.get(i) > highestNum) {
                highestNum = days.get(i);
            }
        }

        ArrayList<Integer> bestDays = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            if (days.get(i) == highestNum) {
                bestDays.add(i + 1);
            }
        }

        boolean firstTime = true;

        for (int i = 0; i < bestDays.size(); i++) {
            if (!firstTime) {
                System.out.println(",");
            }
            System.out.println(bestDays.get(i));
        }

        intScanner.close();
        charScanner.close();
    }
}
