package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
        driver.manage().window().fullscreen();

        WebElement source = driver.findElement(By.id("draggable1"));
        WebElement destination = driver.findElement(By.id("droppable1"));
        // use Actions class for drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).build().perform();

        //OR use click and hold then move it to destination
        WebElement source2 = driver.findElement(By.id("draggable2"));
        WebElement destination2 = driver.findElement(By.id("droppable2"));
        actions.clickAndHold(source2).moveToElement(destination2).release().build().perform();

        // actions is always followed by .build().perform(); at the end

        Thread.sleep(2000);
        driver.close();
    }
}
