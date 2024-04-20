package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().fullscreen();
        Actions actions = new Actions(driver);
        WebElement myframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(myframe);

        //Option 1: type the date in the dateBox
        WebElement dateBox= driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
        dateBox.click();
        dateBox.sendKeys("01/01/2001");

        //Option 2:
        WebElement specificDate = driver.findElement(By.xpath("//tr[2]/td[2]"));
        dateBox.click(); // this will display the date-picker box
        Thread.sleep(4000);
        specificDate.click();
        Thread.sleep(2000);

        //Go to different month
        WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
        nextButton.click();//to march
        Thread.sleep(1000);
        // Without identifying the element again it was giving us StaleElementException, which means that the element
        // was found but when it got clicked may be the DOM got changed, so we need to find the same element again and click on it again
        WebElement nextButton2 = driver.findElement(By.xpath("//a[@title='Next']"));
        nextButton2.click();//to april
        driver.close();
    }
}
