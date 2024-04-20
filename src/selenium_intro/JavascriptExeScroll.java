package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExeScroll {
    // brain of the webpage
    // it is an interface class.
    // automated look and feel.
    // We can use JavaScriptExcecutor to run some command that are not possible using the WebDriver
    //For Example : Highlighting element ,scrolling up and down by pixel , scrolling to element.
    //We can also sendKey or click on button/links
    // execute javascript to execute specific javaScript functions on webpage
    //                like scroll up/down, click on button, highlight element
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        // create a new element named driver:
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);

//SCROLL UP/DOWN METHOD in JAVASCRIPT:

        // casting of WebDriver element (driver) to JavaScript Executor ( js points to driver = new Chromedriver)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // scroll down by pixels:
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);
        //scroll up by pixels:
        js.executeScript("window.scrollBy(0, -1500)");
        Thread.sleep(2000);

        // scroll to an element:
        //Use method : js.executeScript("arguments[0].scrollIntoView();",link);
        //                             ( method from Javascript; WebElement )
        WebElement link = driver.findElement(By.xpath("//a[@id='simple-note-taker']"));
        js.executeScript("arguments[0].scrollIntoView()", link);

        Thread.sleep(2000);

        // method for scroll to an element:
        scrollToElementUsingJavaScriptExecutor(driver,link);
    }

    // we can make a separate method for scroll to element :
    public static void scrollToElementUsingJavaScriptExecutor(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
