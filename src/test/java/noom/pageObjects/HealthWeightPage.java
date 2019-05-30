package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HealthWeightPage extends BaseClass {

	private static String xpath_btn_loose_weight_for_good = "//a[@class='introduction__splash-cta--button']";
	private static WebElement element;
	
	public HealthWeightPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_LooseWeightForGood() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_loose_weight_for_good));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
