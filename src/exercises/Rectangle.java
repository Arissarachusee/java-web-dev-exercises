package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Length of the rectangle: ");
        double length = input.nextDouble();
        System.out.println("rectangle's length is " + length + "cm" );

        System.out.println(" rectangle’s width: ");
        double width = input.nextDouble();
        System.out.println("rectangle's width is" + width +  "cm" );

        System.out.println(" rectangle’s area:  ");
        double area = input.nextDouble();
        System.out.println("rectangle's area is" + area+ "Square metter" +("\n") );
        System.out.println("Total of the rectangle area is " +  length + width + area);



    }
}