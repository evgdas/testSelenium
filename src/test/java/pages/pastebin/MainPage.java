package pages.pastebin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.AbstractPage;

public class MainPage extends AbstractPage {
    @FindBy(id = "paste_code")
    WebElement textArea;
    private final String URL = "https://pastebin.com";

    @FindBy(name = "paste_expire_date")
    WebElement expireDate;

    @FindBy(name="paste_name")
    WebElement pasteName;

    @FindBy (id="submit")
    WebElement submitButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public MainPage openPage() {
        driver.navigate().to(URL);
        return this;
    }

    public MainPage setText() {
        textArea.sendKeys("Text for test");
        return this;
    }
    public MainPage setExpireDate (){
        Select select=new Select(expireDate);
        select.selectByVisibleText("10 Minutes");
        return this;
    }


    public MainPage setPasteName() {
        pasteName.sendKeys("WebDriver");
        return this;
    }

    public NewPage clickSubmitButton(){
        submitButton.click();
        return new NewPage(driver);
    }
}
