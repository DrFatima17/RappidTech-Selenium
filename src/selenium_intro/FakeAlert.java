package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/fake-alert-test.html");
        driver.manage().window().fullscreen();
        // not every pop-up is an alert.
        // Method to identify: search in inspect and try to hover over the alert box.
        // if it doesn't select anything then its an alert. if you can select from pop-up box then its fake alert
        driver.findElement(By.id("fakealert")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.close();
    }
}
