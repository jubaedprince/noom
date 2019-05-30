package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddOnsPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_chkbx_CustomMealWorkoutPlan = "//div[@value='meal-workout-59']/div[@class='offer-checkbox']";
	public static String xpath_btn_AddToMyPlan = "//*[@id='offers-submit-add-to-cart']";
	public static String xpath_btn_BuyNow = "//*[@class='offers-submit-icon']";
	public static String xpath_btn_Skip= "//p[@id='offers-submit-skip']";
	
	
	public AddOnsPage(WebDriver driver) {
		super(driver);
	}
	

	public static WebElement btn_Skip() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_Skip));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	public static WebElement chkbx_CustomMealWorkoutPlan() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_chkbx_CustomMealWorkoutPlan));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_AddToMyPlan() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_AddToMyPlan));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_BuyNow() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_BuyNow));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	
}
