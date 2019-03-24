package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class EmailLoginPage {
    private AndroidDriver driver;

    public EmailLoginPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="com.wsl.noom:id/email_sign_in_email")
    private AndroidElement emailFieldElement;

    @AndroidFindBy(id="com.wsl.noom:id/email_sign_in_password")
    private AndroidElement passwordFieldElement;

    @AndroidFindBy(id="com.wsl.noom:id/email_password_headline")
    private AndroidElement headline;

    @AndroidFindBy(id="com.wsl.noom:id/action_next")
    private AndroidElement nextElement;

    public boolean isDisplayed(){ return headline.isDisplayed(); }

    public void hideKeyboard(){ driver.hideKeyboard(); }

    public void login(String email, String password){
        emailFieldElement.sendKeys(email);
        passwordFieldElement.sendKeys(password);
        nextElement.click();
    }
}
