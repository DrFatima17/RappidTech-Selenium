package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class WaitExplicit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().window().fullscreen();

        WebElement button = driver.findElement(By.xpath("//input[@id='reveal']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='revealed']")));

        WebElement inputBox= driver.findElement(By.xpath("//input[@id='revealed']"));
        inputBox.click();
        inputBox.sendKeys("ABC");

        Thread.sleep(2000);
        driver.quit();



    }}
