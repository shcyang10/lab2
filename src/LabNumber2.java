import java.util.Scanner;

public class LabNumber2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		System.out.print("Enter Length: ");
//		double length = scan.nextDouble();
//		System.out.print("Enter Width: ");
//		double width = scan.nextDouble();
//		System.out.print("Area: ");
//		System.out.println(length * width);
//		System.out.print("Perimeter: ");
//		System.out.println((2 * length) + (2 * width));

		char userChar;
		userChar = 'y';

		while (userChar == 'y') {
			System.out.print("Enter Length: ");
			double length2 = scan.nextDouble();
			System.out.print("Enter Width: ");
			double width2 = scan.nextDouble();
			System.out.print("Area: ");
			System.out.println(length2 * width2);
			System.out.print("Perimeter: ");
			System.out.println((2 * length2) + (2 * width2));

			System.out.println("Continue? (y/n)");
			userChar = scan.next().charAt(0);

		}

		System.out.println("Done");
		scan.close();
		
		// adding some stuff to push again w/Antonella

	}

}
