package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChoosePlanPage extends BaseClass {

	private static WebElement element;
	
	public ChoosePlanPage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement btn_claimMyPlan() {
		element = null;
		try {
			element = driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/div/div[2]/div/div/div[2]/div"));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
}
