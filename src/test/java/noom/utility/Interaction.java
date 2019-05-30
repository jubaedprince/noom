package noom.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interaction {
	public static void clickUntilElementPresent(WebDriver driver, WebElement focus, String result) {
		focus.click();
		WebDriverWait wait = new WebDriverWait(driver, 30000);
		System.out.println("waiting for " + result);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(result)));
		System.out.println("waiting is over");
	}
}