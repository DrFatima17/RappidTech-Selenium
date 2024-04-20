package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TaskAction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/sortable/");
        driver.manage().window().fullscreen();
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        // items are in a different frame so first go to that specific frame:
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement item1 = driver.findElement(By.xpath("//li[.='Item 1']"));
        WebElement item7 = driver.findElement(By.xpath("//li[.='Item 7']"));
        //actions.dragAndDrop(item1,item7).build().perform();
        // OR
        //actions.clickAndHold(item1).moveToElement(item7).release().build().perform();
        //OR
        actions.clickAndHold(item1).moveToElement(item7).moveByOffset(0, 2).build().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
//WebElement item2= driver.findElement(By.xpath("//li[.='Item 2']"));
//WebElement item3= driver.findElement(By.xpath("//li[.='Item 3']"));
//WebElement item4= driver.findElement(By.xpath("//li[.='Item 4']"));
// WebElement item5= driver.findElement(By.xpath("//li[.='Item 5']"));
//WebElement item6= driver.findElement(By.xpath("//li[.='Item 6']"));