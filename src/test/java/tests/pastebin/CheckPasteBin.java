package tests.pastebin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pastebin.MainPage;
import tests.CommonConditions;

public class CheckPasteBin extends CommonConditions {
    @Test
    public void insertDataToPagePastebin() {
        String title = new MainPage(driver)
                .openPage()
                .setText()
                .setExpireDate()
                .setPasteName()
                .clickSubmitButton()
                .getTitle();
        Assert.assertTrue(title.contains("WebDriver"));
    }
}
