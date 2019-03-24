package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="com.wsl.noom:id/log_in_email_button")
    private AndroidElement emailLoginElement;

    @AndroidFindBy(id="com.wsl.noom:id/log_in_facebook_button")
    private AndroidElement facebookLoginElement;

    @AndroidFindBy(id="com.wsl.noom:id/google_log_in_button")
    private AndroidElement googleLoginElement;

    public boolean isDisplayed(){ return emailLoginElement.isDisplayed(); }
    public void emailLogin(){ emailLoginElement.click(); }
    public void facebookLogin(){ facebookLoginElement.click(); }
    public void googleLogin(){ googleLoginElement.click(); }
}
