package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConveniencePage extends BaseClass {

	private static WebElement element;
	
	public ConveniencePage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement btn_questionOptionChecked() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[1]/div[2]/div[1]/div/label[1]"));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_surveyControlsNext() {
		element = null;
		try {
			element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[1]/div[2]/div[2]/button[2]"));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
