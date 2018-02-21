package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputForms {
	 
		private static WebElement element= null;
		
		public static WebElement Text_Box(WebDriver driver) {
			element= driver.findElement(By.id("user-message"));
			return element;
		}
		public static WebElement Message_Button(WebDriver driver) {
			element= driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
			return element;
		}
		public static WebElement Message_Validation(WebDriver driver) {
			element= driver.findElement(By.xpath("//*[@id=\"display\"]"));
			return element;
		}
		
		public static WebElement Value_boxa(WebDriver driver) {
			element= driver.findElement(By.id("sum1"));
			return element;
		}	
	
		public static WebElement Value_boxb(WebDriver driver) {
			element= driver.findElement(By.id("sum2"));
			return element;
		}	
		
		public static WebElement Total(WebDriver driver) {
			element= driver.findElement(By.xpath("//*[@id=\\\"gettotal\\\"]/button"));
			return element;
		}
		
		public static WebElement Number_Validation(WebDriver driver) {
			element= driver.findElement(By.id("displayvalue"));
			return element;
		}
	
	}
	

	
	
	

	
