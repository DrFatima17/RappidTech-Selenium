package selenium_intro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {
    // this class has all utility methods that you can call upon whenever you need that function
    // reuse your code using this class



    public static void scrollToElementUsingJavaScriptExecutor(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    private static void highlight(WebDriver driver, WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }
    public static void clickElementWithJavaScriptExecutor(WebDriver driver, WebElement element){
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }
}
