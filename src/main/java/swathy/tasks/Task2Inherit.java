package swathy.tasks;

import java.util.Scanner;

public class Task2Inherit extends Muldivsample {

	/*
	 * Created By: Swathy.S Created Date: 27th December '17 Created Time: 5:00PM
	 * Concept Used: Switch & Inheritance Task Number: 2
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");

		// nextInt() reads the next integer from the keyboard
		int first = sc.nextInt();
		int second = sc.nextInt();

		System.out.println("Enter an operator (+, -, *, /, %): ");
		char operator = sc.next().charAt(0);

		int result;

		switch (operator) {
		case '+':
			result = add(first, second);
			break;

		case '-':
			result = sub(first, second);
			break;

		case '*':
			result = mul(first, second);
			break;

		case '/':
			result = div(first, second);
			break;

		case '%':
			result = mod(first, second);
			break;

		// If operator doesn't match any case constant (+, -, *, /)
		default:
			System.out.println("Error! operator is not correct");
			return;
		}

		// Print the result along with the input values

		System.out.printf("%d %c %d = %d", first, operator, second, result);
	}

}
