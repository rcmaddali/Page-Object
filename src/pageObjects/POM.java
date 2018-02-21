package pageObjects;

import java.util.concurrent.TimeUnit;
import pageObjects.InputForms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class POM {

	 private static WebDriver driver = null;
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xxr8m\\Desktop\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("Window scroll down");
		Thread.sleep(3000);
		InputForms.Text_Box(driver).sendKeys("Test Message");
		InputForms.Message_Button(driver).click();
		InputForms.Message_Validation(driver);
		InputForms.Value_boxa(driver).sendKeys("25");
		InputForms.Value_boxb(driver);
		InputForms.Number_Validation(driver);
		
	}

}


