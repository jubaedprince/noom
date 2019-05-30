package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FourMonthPersonalizedCoursePage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_btn_continue = "//button[contains(text(), 'continue')]";
			
	public static String xpath_footer = "//footer[@class='footer']";
	
	public FourMonthPersonalizedCoursePage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement btn_continue() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_continue));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement section_footer() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_footer));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
