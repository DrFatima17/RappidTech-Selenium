package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        // Multiple selection
        WebElement selectElement = driver.findElement(By.xpath("(//select)[1]"));
                Select selection = new Select(selectElement);
        Thread.sleep(3000);
        selection.selectByIndex(0);
        selection.selectByIndex(1);
        selection.selectByIndex(2);
        selection.selectByIndex(3);

        selection.selectByValue("ms3");
        selection.selectByValue("ms4");
        Thread.sleep(3000);
        // deselect all
        selection.deselectAll();
        Thread.sleep(3000);
        driver.close();
    }
}
