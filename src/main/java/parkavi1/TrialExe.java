package parkavi1;

import org.openqa.selenium.WebDriver;

public class TrialExe extends Trial1
{
	static WebDriver driver;

	public static void main(String args[])
	{
		browserLaunch();
		maximize();
		urlLaunch("http://www.softwaretestinghelp.com");
		ieLaunch();
		maximize();
		urlLaunch("http://prince2.sensiple.com");
		
	}

}
