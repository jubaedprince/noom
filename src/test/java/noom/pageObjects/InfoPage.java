package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoPage extends BaseClass {

	private static WebElement element;
	
	public InfoPage(WebDriver driver) {
		super(driver);
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
