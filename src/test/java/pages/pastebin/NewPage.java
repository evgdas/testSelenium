package pages.pastebin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AbstractPage;

public class NewPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();

    protected NewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public NewPage openPage() {
        return this;
    }

    public String getTitle() {
        logger.info(driver.getTitle());
        return driver.getTitle();
    }
}
