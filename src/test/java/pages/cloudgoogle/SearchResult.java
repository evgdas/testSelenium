package pages.cloudgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class SearchResult extends AbstractPage {
    protected SearchResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

By calc= By.xpath("//*[@id=\"___gcse_0\"]/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a");

    public SearchResult openCalculator(){
    WebElement c=new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(calc));
c.click();
       return this;
   }
    @Override
    public SearchResult openPage() {

        return this;
    }
}
