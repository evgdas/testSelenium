package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;

public abstract class  AbstractPage {
    protected WebDriver driver;
    public abstract AbstractPage openPage();
    protected final int WAIT_TIMEOUT_SECONDS = 20;
    protected AbstractPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
    }
}
