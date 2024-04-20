package selenium_intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    // pop-ups to display message or prompt the user for input. 3 types:
    // 1.alerts: simple alert with some message and "OK" button that is triggered upon clicking something,
    // 2.confirm alerts: pop-up alert to choose from ok or cancel button,
    // 3.prompt alerts: prompts to type some text as input
    // uses the method switchTo().
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        driver.manage().window().fullscreen();

        // 1.handle alert by accepting it( click on ok)
        driver.switchTo().alert().accept();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Show confirm box']")).click();
        Thread.sleep(2000);

        //2.handle alert by dismissing it( click on cancel)
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Show prompt box']")).click();

        //3. handle alert by adding text to it ( add text)
        driver.switchTo().alert().sendKeys("This is a text from an ide");
        driver.switchTo().alert().accept();


        // Alert is a class
        // syntax:
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }
}
