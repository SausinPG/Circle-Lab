import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Circle circle = new Circle(); // creates circle object

        System.out.println();
        System.out.println("Initial circle with a radius of 10: "); // prints the initial circle
        System.out.println();
        circle.Display();

        System.out.println();
        System.out.print("Enter a new radius: "); // asks for the user's input
        double userRadius = (new Scanner(System.in)).nextDouble();
        circle.setRadius(userRadius);

        circle.setRadius(userRadius); // sets new radius to the users input
        System.out.println();
        circle.Display();

        System.out.println();
        circle.setRadius(30); // sets the new radius to 30
        System.out.print("New circle with a radius of 30: \n");
        circle.Display();

    }
}
