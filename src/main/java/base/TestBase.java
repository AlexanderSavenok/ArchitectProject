package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webdriver.WebDriverConfiguration;

/**
 * Created by student on 06.09.2016.
 */
public class TestBase {

    protected static WebDriver driver;
    protected WebDriverConfiguration customDriver = new WebDriverConfiguration();
    private static final String URL_MAIN_PAGE = "http://someurl.com"; //this is invalid link!!!

    @BeforeMethod
    public void setup() {
        driver = customDriver.getWebDriver(URL_MAIN_PAGE);
    }

    @AfterMethod
    public void teardown() {
        customDriver.closeDriver(driver);
    }
    public static WebDriver getDriver() {
        return driver;
    }

    //also you can add general methods for this class

}
