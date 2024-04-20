package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./browserdrivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.manage().window().fullscreen();
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("iphone");
        Thread.sleep(3000);
        driver.close();
    }
}
