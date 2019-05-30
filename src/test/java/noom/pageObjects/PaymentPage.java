package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_txt_bx_number = "//*[@id=\"credit-card-number\"]";
	public static String xpath_txt_bx_expiration_date = "//*[@id=\"cardExpirationDateWrapper\"]";
	public static String xpath_txt_bx_cvv = "//*[@id=\"cvv\"]";
	public static String xpath_footer = "//footer[@class='footer']";
	public static String xpath_btn_save_profile= "//button[contains(text(), 'Save Profile')]";
	
	
	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement btn_save_profile() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_save_profile));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement section_footer() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_footer));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txtbx_number() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txt_bx_number));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_bx_expiration_date() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txt_bx_expiration_date));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_bx_cvv() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txt_bx_cvv));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
}
