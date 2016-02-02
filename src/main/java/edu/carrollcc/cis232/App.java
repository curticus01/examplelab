package edu.carrollcc.cis232;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String name;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is your name? ");
		name = keyboard.nextLine();

		System.out.printf("Hello %s!%n", name);
		keyboard.close();
	}
}