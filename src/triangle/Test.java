package triangle;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Input color of the triangle.");
		String color=input.next();
		System.out.println("Is triangle filled? 1/0");
		boolean filled=input.nextBoolean();
		System.out.println("Lenght of the side a.");
		double side1=input.nextDouble();
		System.out.println("Lenght of the side b.");
		double side2=input.nextDouble();
		System.out.println("Lenght of the side c.");
		double side3=input.nextDouble();
		Triangle trokut=new Triangle(side1, side2, side3, color, filled);
		trokut.toString();

	}

}
