package tests.googlecloud;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cloudgoogle.MainPage;
import pages.cloudgoogle.SearchResult;
import tests.CommonConditions;

public class CheckGoogleCloudCalculator extends CommonConditions {
    @Test
    public void checkCoogleCloudCalculator() {
        SearchResult page = new MainPage(driver)
                .openPage()
                .search()
                .openCalculator();
        Assert.assertNotNull(page);

    }
}
