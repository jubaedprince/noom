package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage extends BaseClass {

	private static WebElement element;
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	
	public static WebElement btn_surveyControlsNext() {
		element = null;
		try {
			//
			element = driver.findElement(By.xpath("//*[@class=\"survey__controls-next-btn\"]"));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
