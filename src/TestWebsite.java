import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestWebsite {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xxr8m\\Desktop\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("Window scroll down");
		Thread.sleep(3000);
		driver.findElement(By.id("user-message")).sendKeys("Test Message");
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		System.out.println("Button Clicked");
		String a= driver.findElement(By.xpath("//*[@id=\"display\"]")).getText();
		if(a.contains("Test Message"))
		{
			System.out.println("Text is present");
		}
		else {
			System.out.println("Text is not present");
		}
		
		System.out.println("Single Input field works. Now moving to multiple input fields");
		
		driver.findElement(By.id("sum1")).sendKeys("15");
		driver.findElement(By.id("sum2")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
		String b= driver.findElement(By.id("displayvalue")).getText();
		int n = Integer.parseInt(b);
		System.out.println(n);
		if(n==55)
		{
			System.out.println("Sum is correct");
		}
		else {
			System.out.println("Sum is incorrect");
		}
		
		//Click on Date Pickers
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/a")).click();
		//Click on BootStrap Date Picker
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/ul/li[1]")).click();
		//Input date through the keyboard
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input[1]")).sendKeys("20071990");;
		
		
	}

}

