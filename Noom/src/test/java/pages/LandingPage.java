package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private AndroidDriver driver;

    public LandingPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="com.wsl.noom:id/sign_up_button")
    private AndroidElement signUpElement;

    @AndroidFindBy(id="com.wsl.noom:id/login_button")
    private AndroidElement loginElement;

    @AndroidFindBy(id="com.wsl.noom:id/action_bar_root")
    private AndroidElement linearLayoutElement;

    public boolean isDisplayed(){ return linearLayoutElement.isDisplayed(); }
    public void signUp(){ signUpElement.click(); }
    public void login(){
        loginElement.click();
    }
}
