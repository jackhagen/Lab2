import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		double length;
		double width;
		double area;
		double perimeter = 2;
		double volume;
		String userChar;

		System.out.println("Welcome to the Grand Circus Room Detail Generator!");

		do {

			System.out.println("Please enter the length of the room: ");
			length = scnr.nextDouble();
			System.out.println("Please enter the width of the room: ");
			width = scnr.nextDouble();

			area = (length * width);
			perimeter = perimeter * (length + width);
			volume = (area * area * area);

			System.out.println("The area of the classroom is " + area);
			System.out.println("The perimeter is " + perimeter);
			System.out.println("The volume is " + volume);
			System.out.println("Continue? (y/n)");
			userChar = scnr.next();

		} while (userChar.equalsIgnoreCase("y") || userChar.equalsIgnoreCase("Yes"));
		scnr.close();

		System.out.println("Thanks for using the Grand Circus Room Detail Generator!");
	}

}
