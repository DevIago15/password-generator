package application;

import java.util.Scanner;
import entities.Generator;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Generator g = new Generator();

		int option;
		int quantidade;
		String password = "";
		
		System.out.println("Hello, Welcome to Password Generator!");
		System.out.println("1 - Easy");
		System.out.println("2 - Medium");
		System.out.println("3 - Hard");
		System.out.printf("Your option: ");
		option = sc.nextInt();
		System.out.printf("Password length: ");
		quantidade = sc.nextInt();
		
		switch(option) {
		case 1:
			password = g.generateEasyPassword(quantidade);
			break;
		case 2:
			password = g.generateMediumPassword(quantidade);
			break;
		case 3:
			password = g.generateHardPassword(quantidade);
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		
		System.out.println("Your password: " + password);
		sc.close();
	}
}
