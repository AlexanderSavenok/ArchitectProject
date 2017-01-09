package webdriver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 *
 * The general class of similar features of all elements
 */
public class WebElementMenager {

    public static boolean isDisplayed(WebElement webElement) {
        boolean isDisplayed;
        try {
            isDisplayed = webElement.isDisplayed();
        } catch (NoSuchElementException ex) {
            isDisplayed = false;
        }
        return isDisplayed;
    }
}
