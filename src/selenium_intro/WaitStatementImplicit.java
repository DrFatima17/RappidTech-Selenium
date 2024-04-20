package selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitStatementImplicit {
    // Without a wait statement if element is not found in 0 seconds the driver will throw NoSuchElementException
    //or ElementNotInteractableException: element not interactable
    // driver by default waits for 0 seconds to throw the exception.
    // Wait Statement is used to let the driver search an element for given time if the browser is taking time to load.

    //IMPLICIT WAIT:  set globally. the system waits for the given time then moves to other element.
    // if that other element is also not found then throws exception
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

    }
}
