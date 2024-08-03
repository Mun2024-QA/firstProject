package testcase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCompyTest {
	//public static void main(String[] args) {
	
	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
	System.out.println("Before class");
	}
	@AfterClass
	public static void afterClass() {
	System.out.println("After class");
	}

	@Before
	public void init() {
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\munir\\selenium\\crm\\driver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
	

}
	@Test
	public void addCompyTest() throws InterruptedException {
	
		driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("login_submit")).click();
		driver.findElement(By.id("Company")).click();
		driver.findElement(By.xpath("//button[text()='Add Company']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.id("Company_Name ")).sendKeys("Dream Team");
		driver.findElement(By.id("Company_Email")).sendKeys("DreamTeam@gmail.com");
		driver.findElement(By.id("Company_phone")).sendKeys("45524255588");
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.id("Companyformsubmited")).click();
		
		
		
	}
	@After
	public void tearDown2() throws InterruptedException{
		Thread.sleep(300);
		driver.close();
	}
}

