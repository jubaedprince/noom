package noom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebEnrollmentPage extends BaseClass {

	private static WebElement element;
	
	public static String xpath_txtbx_password = "//*[@id='id_password']";
	public static String xpath_txtbx_confirm_password = "//*[@id='id_confirm_password']";
	public static String xpath_txtbx_phone_number = "//*[@id='id_phone_number']";
	public static String xpath_chkbx_male = "//input[@id='MALE']";
	public static String xpath_chkbx_imperial = "//*[@id='imperial']";
	public static String xpath_chkbx_kg = "//input[@id='kg']";
	public static String xpath_txtbx_height_ft = "//*[@id='height_ft']";
	public static String xpath_txtbx_height_in = "//*[@id='height_in']";
	public static String xpath_txtbx_weight_kg = "//*[@id='weight_kg']";
	public static String xpath_txtbx_id_age = "//*[@id='id_age']";
	public static String xpath_btn_finish_signup = "//button";
	
	
	public WebEnrollmentPage(WebDriver driver) {
		super(driver);
	}
	


	public static WebElement btn_finish_signup() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_btn_finish_signup));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}

	public static WebElement txtbx_id_age() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_id_age));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	

	public static WebElement txtbx_weight_kg() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_weight_kg));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	


	public static WebElement txtbx_height_in() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_height_in));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	

	public static WebElement txtbx_height_ft() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_height_ft));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	


	public static WebElement chkbx_kg() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_chkbx_kg));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement chkbx_imperial() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_chkbx_imperial));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement chkbx_male() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_chkbx_male));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement txtbx_password() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_password));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txtbx_confirm_password() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_confirm_password));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	public static WebElement txtbx_phone_number() {
		element = null;
		try {
			element = driver.findElement(By.xpath(xpath_txtbx_phone_number));
		} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	
}
