package swathy.tasks;

public class Simplestrings{
	static String string;

	public static void reverse(String input){
		String reverse = new StringBuffer(input).reverse().toString();
		System.out.println(reverse);
	}
	public static void concatString(String input1, String input2) {
		System.out.println(" " +(input1+input2));
	}

	public static void removeChar(String input, int pos) {

		System.out.println(input.substring(0, pos) + input.substring(pos + 1));
	}


	public static void compareByEquals(String input1, String input2) {
		if(input1.equals(input2))
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("provide correct strings");
	}
	
	public static void compareByLoc(String input1, String input2) {
		if(input1==input2)
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("provide correct strings");
	}
	
}
