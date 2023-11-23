package Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InputMismatchException {
		int choice;
		boolean inLoop = true;
		StackLinkedList s = new StackLinkedList();
		Scanner input = new Scanner(System.in);
		while (inLoop) {
			try {
				System.out.println("\n\n[1]ADD\n[2]DELETE\n[3]SHOW SIZE\n[4]SEARCH\n[5]DISPLAY ALL\n[0]EXIT");
				System.out.println("\nAction: ");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter the Number: ");
					int num = input.nextInt();
					s.push(num);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					System.out.println("Number of Items: " + s.getSize());
					break;
				case 4:
					System.out.println("Enter Number to search: ");
					int data = input.nextInt();
					s.search(data);
					break;
				case 5:
					s.display();
					break;
				case 0:
					System.exit(1);
					break;
				default:
					System.out.println("Invalid Choice");
				}
			} catch (Exception e) {
				System.out.println("Please Enter A Number!");
				input.nextLine();
			}
		}
		input.close();
	}
}
