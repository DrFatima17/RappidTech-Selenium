package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitFluent {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Upcasting
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//input[@id='reveal']"));
        button.click();

        //FluentWait:

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
        // checking every two seconds ,
        // first time checks at 0 if element is visible  then checks again at 2s then at 4s then at 6s etc...
        // until 10 seconds max is reached
                .ignoring(ElementNotInteractableException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='revealed']"))));

        //send a text to the elemet that we waited for its visibility
        driver.findElement(By.xpath("//input[@id='revealed']")).sendKeys("XXXXXX");
        Thread.sleep(2000);
        driver.quit();
    }
}
