package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuildPlanPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_btn_no = "//button[contains(text(), 'no')]";
	public static String xpath_btn_seated = "//button[contains(text(), 'seated')]";
			
	public BuildPlanPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_no() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_no));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_seated() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_seated));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
