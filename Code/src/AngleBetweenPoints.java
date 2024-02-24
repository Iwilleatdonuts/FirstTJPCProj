import java.util.Scanner;

public class AngleBetweenPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the coordinates of the two points
        System.out.println("Enter coordinates of the first point (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of the second point (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double angle = angleBetweenPoints(x1, y1, x2, y2);

        System.out.println("Angle between the two points: " + angle + " degrees");

        scanner.close();
    }

    public static double angleBetweenPoints(double x1, double y1, double x2, double y2) {
        double deltaY = y2 - y1;
        double deltaX = x2 - x1;

        double angleRadians = Math.atan2(deltaY, deltaX);
        double angleDegrees = Math.toDegrees(angleRadians);

        // Convert angle to positive value
        if (angleDegrees < 0) {
            angleDegrees += 360;
        }

        return angleDegrees;
    }
}