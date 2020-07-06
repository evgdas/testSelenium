package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DriverSingleton {
    private static WebDriver driver;

    public DriverSingleton() {    }

    public static WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        return driver;
    }

    public static void closeDriver(){
     //   driver.quit();
        driver=null;
    }

}
