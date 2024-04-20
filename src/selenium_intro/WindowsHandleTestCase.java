package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class WindowsHandleTestCase {
    public static void main(String[] args) throws InterruptedException {
        //To test if the title is a match based on the requirement.
        // required/expected text: "Test Page For Basic Ajax "
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        driver.manage().window().fullscreen();

        driver.findElement(By.id("gobasicajax")).click();
        Thread.sleep(2000);

        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

        WebElement givenText= driver.findElement(By.xpath("//h1"));
        String actualText= givenText.getText();
        String expectedText= "Test Page For Basic Ajax ";
        if(actualText.equals(expectedText)){
            System.out.println("Test pass");
        }else{
            System.out.println("Test Fail");
        }
        driver.quit();
    }
}
