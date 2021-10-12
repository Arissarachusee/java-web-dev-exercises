package exercises;

import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" How many miles have you driven:  ");
        double numDistance = input.nextDouble();
        System.out.println(" You have driven " + numDistance + "miles");

        System.out.println(" How much gas did you use:  ");
        double numGallon = input.nextDouble();
        System.out.println(" You have driven " + numGallon + "Gallon");

        double numMpg = numDistance / numGallon;
        System.out.println("You are running on " + numMpg + " mpg.");
    }
}
