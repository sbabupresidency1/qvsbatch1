package parkavi1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class CsvDemo{
	public static void main(String[] args) throws Exception
	{
		String x= ",";
		FileReader f=new FileReader("C:\\SeleniumBackUp\\csvdemo.csv");
		BufferedReader br = new BufferedReader(f);//(new FileReader("C:\\SeleniumBackUp\\csvdemo.csv"));
		String line = br.readLine();
		if(line!= null){
			String[] b = line.split(x);
			System.out.println(Arrays.toString(b));
		}
		br.close();
	}
}




