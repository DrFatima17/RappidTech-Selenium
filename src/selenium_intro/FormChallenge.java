package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormChallenge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        driver.manage().window().fullscreen();
        //enter username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Fatima");
        Thread.sleep(1000);
        //enter password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
        Thread.sleep(1000);
        //enter comments
        driver.findElement(By.xpath("//textarea[@name='comments']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("This is my comment");
        Thread.sleep(1000);

        //select file name
        driver.findElement(By.xpath("//input[@name='filename']"))
                .sendKeys("\"C:\\Users\\Fatima Amjad\\OneDrive\\Desktop\\UI Testing Checklist.rtf\"");

        //select a checkbox
        driver.findElement(By.xpath("//input[@type='checkbox'][@value='cb2']")).click();
        Thread.sleep(2000);
        //select a radiobutton
        driver.findElement(By.xpath(" //input[@value='rd1']")).click();
        Thread.sleep(2000);

        //Multi-select options in drop box
        WebElement multiselect = driver.findElement(By.name("multipleselect[]")); // select element NOT options in it
        Select select = new Select(multiselect);
        select.selectByValue("ms1");
        select.selectByValue("ms2");
        select.selectByValue("ms3");
        select.selectByValue("ms4");
        // select.selectByVisibleText(""); // or SelectByIndex(0)..
        Thread.sleep(1000);

        driver.findElement(By.xpath("//option[@value='dd2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
