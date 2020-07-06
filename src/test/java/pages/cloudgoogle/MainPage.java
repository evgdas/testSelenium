package pages.cloudgoogle;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AbstractPage;

public class MainPage extends AbstractPage {
    @FindBy(id = "paste_code")
    WebElement textArea;
    private final String URL = "https://cloud.google.com/";

    @FindBy(name = "q")
    WebElement searchButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public MainPage openPage() {
        driver.navigate().to(URL);

        return this;
    }


    public SearchResult search(){
        searchButton.sendKeys("Google Cloud Platform Pricing Calculator");
        searchButton.sendKeys(Keys.ENTER);
        return new SearchResult(driver);
    }
}
