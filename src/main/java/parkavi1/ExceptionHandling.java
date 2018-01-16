package parkavi1;

import java.util.Scanner;

public class ExceptionHandling {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a, b, c, res;
		char op;
		Scanner in = new Scanner(System.in);
		System.out.println("Get two integers : ");

		a = in.nextInt();
		b = in.nextInt();

		try {
			c = a / b;
			System.out.println("Result=" + c);
		} catch (ArithmeticException e) {
			System.out.println("Exception found : Divideby zero");
		} finally {
			System.out.println("Enter the operator");
			op = in.next().charAt(0);
			switch (op) {
			case '+':
				res = a + b;
				System.out.println("" + res);
				break;
			case '-':
				res = a - b;
				System.out.println("" + res);

				break;
			case '*':
				res = a * b;
				System.out.println("" + res);

				break;
			case '/':
				res = a / b;
				System.out.println("" + res);

				break;
			default:
				System.out.println("Invalid operator");
				break;

			}
		}
	}
}
