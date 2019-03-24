//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.MobileElement;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//import pages.*;
//import helper.Helper;
//
//import java.net.MalformedURLException;
//
//public class EmailLoginTest {
//
//    public AndroidDriver<MobileElement> driver;
//    public WebDriverWait wait;
//
//    @BeforeMethod
//    public void setup () throws MalformedURLException {
//        driver = Helper.getDriver();
//        wait = new WebDriverWait(driver, 10);
//    }
//
//    @Test
//    public void emailLoginButtonClickedTest ()  throws InterruptedException{
//        //landing page
//        LandingPage landingPage = new LandingPage(driver);
//        if(!landingPage.isDisplayed()){ return; }
//        landingPage.login();
//
//        //login page
//        LoginPage loginPage = new LoginPage(driver);
//        if(!loginPage.isDisplayed()){ return; }
//        loginPage.emailLogin();
//
//        //email login page
//        EmailLoginPage emailLoginPage = new EmailLoginPage(driver);
//        if(!emailLoginPage.isDisplayed()){ return; }
//        emailLoginPage.login("jubaedprince@gmail.com", "bangladesh");
//
//        //login waiting page
//        LoginWaitingPage loginWaitingPage = new LoginWaitingPage(driver);
//        if(!loginWaitingPage.isDisplayed()){ return; }
//
//        //update info dialog
//        UpdateInfoDialogPage updateInfoDialogPage = new UpdateInfoDialogPage(driver);
//        if(!updateInfoDialogPage.isDisplayed()){ return; }
//
//        Thread.sleep(10000); //bad practice should use WebDriverWait
//
//        //homepage
//        HomePage homePage = new HomePage(driver);
//        if(!homePage.isDisplayed()){ return; }
//    }
//
//    @AfterMethod
//    public void teardown(){
//        driver.quit();
//    }
//}
