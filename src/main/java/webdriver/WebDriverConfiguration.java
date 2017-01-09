package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by student on 06.09.2016.
 */
public class WebDriverConfiguration {

    private WebDriver driver;

    public WebDriver getWebDriver(String url) {
        String browser = System.getProperty("browser") != null ? System.getProperty("browser").toLowerCase() : "firefox";
        switch (browser) {
            case "chrome":
                getChromeDriver(url);
            default:
                return getFfDriver(url);
        }
    }

    //return FF Driver
    public WebDriver getFfDriver(String url) {
        //add system property string for ff driver
        driver = new FirefoxDriver();
        defaultSettings(driver);
        driver.get(url);
        return driver;
    }

    //return Chrome Driver
    public WebDriver getChromeDriver(String url) {
        //add system property string for chrome driver
        driver = new ChromeDriver();
        defaultSettings(driver);
        driver.get(url);
        return driver;
    }

    private void defaultSettings(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeDriver(WebDriver driver) {
        driver.close();
    }
}
