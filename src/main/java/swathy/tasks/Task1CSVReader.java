package swathy.tasks;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.util.Arrays;

			 
		// Java program to read .CSV file

			public class Task1CSVReader {

		 //Start with main()

			    public static void main(String[] args) throws Exception {

			        BufferedReader br = new BufferedReader(new FileReader("C:\\SeleniumBackUp\\lib\\input.csv"));

			        String line; //Read string line by line

			        while ((line = br.readLine()) != null) {

			            String[] data = line.split(","); //To Split a String

			            // Print the data in array form

		            System.out.println(Arrays.toString(data)); //Returns string representation of the contents of the array

			    }

			        br.close();

			 }

			 

		}

