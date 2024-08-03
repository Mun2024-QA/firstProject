package launchBrowser;

import org.openqa.selenium.WebDriver;
import ChromeDriver.Chromedriver;

public class LaunchChrome {

	public static void main(String[] args) {
		WebDriver driver = new Chromedriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.close();

		// TODO Auto-generated method stub
		// System.out.print("Hello world");
	}
}