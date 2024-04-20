package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class WindowsHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        driver.manage().window().fullscreen();

        driver.findElement(By.id("gobasicajax")).click();
        Thread.sleep(2000);

        // get all tabs and put them into array list:
        ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());

        // go to second tab:
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);

        // get text from second tab:
        WebElement newTabText= driver.findElement(By.xpath("//h1[.='Basic Ajax Example']"));
        System.out.println( newTabText.getText());


        //switch back to old tab:
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        driver.quit();

    }
}
