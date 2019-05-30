package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdealWeightKgPage extends BaseClass {

	public static String xpath_idealWeightKg =  "//*[@id=\"question-input\"]";
	private static WebElement element;
	
	public IdealWeightKgPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txtbx_idealWeightKg() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_idealWeightKg));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_surveyControlsNext() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[2]/div/div[2]/div[2]/button[2]"));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
