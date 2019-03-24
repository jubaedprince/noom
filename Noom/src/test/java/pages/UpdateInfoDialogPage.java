package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class UpdateInfoDialogPage {
    private AndroidDriver driver;

    public UpdateInfoDialogPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="com.wsl.noom:id/simple_dialog_headline")
    private AndroidElement titleElement;

    public boolean isDisplayed(){ return titleElement.isDisplayed(); }
}
