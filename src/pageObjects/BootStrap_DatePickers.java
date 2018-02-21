package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootStrap_DatePickers {

	private static WebElement element= null;
	
	public static WebElement Date(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]/div/span"));
		return element;
	}
	public static WebElement Date_Range(WebDriver driver) {
		WebElement a= driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input[1]"));
		WebElement b= driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input[2]"));
		return element ;
	}
	
}
