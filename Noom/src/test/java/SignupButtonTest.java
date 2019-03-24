import helper.Helper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LandingPage;

import java.net.MalformedURLException;
import java.net.URL;

public class SignupButtonTest {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    @BeforeMethod
    public void setup () throws MalformedURLException {
        driver = Helper.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void signUpButtonClickedTest ()  {
        LandingPage landingPage = new LandingPage(driver);
        if(!landingPage.isDisplayed()){ return; }
        landingPage.signUp();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
