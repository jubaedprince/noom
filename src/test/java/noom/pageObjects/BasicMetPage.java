package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicMetPage extends BaseClass {

	private static WebElement element;
	
	public BasicMetPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txtbx_basicHeightCm() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id=\"height-cm\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txtbx_basicWeightKg() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id=\"weight-kg\"]"));
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
