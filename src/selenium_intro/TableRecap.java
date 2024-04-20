package selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRecap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./browserdrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().fullscreen();
    }
}
