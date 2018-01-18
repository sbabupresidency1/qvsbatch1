package parkavi1;

import java.io.FileInputStream;
//import Master_Scripts.HtmlReports;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {
	public static void main(String args[]) throws Exception
	{
		String inFilePath = "C:\\SeleniumBackUp\\SampleTestData.xls";
		System.out.println("ReadExcel : " + inFilePath);
		FileInputStream fs = new FileInputStream(inFilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int Temp=sh.getRows();
		System.out.println("No of Rows:"+Temp);
		for(int row = 1;row < Temp;row++)
		{		
			String UserName = sh.getCell(0,row).getContents();
			System.out.println("UserName :- "+ UserName);

			String Password = sh.getCell(1,row).getContents();
			System.out.println("Password :- "+ Password);

			String ValueFound = sh.getCell(2,row).getContents();
			System.out.println("ValueFound :- "+ ValueFound);

			Thread.sleep(3000);
		}

	}
}








