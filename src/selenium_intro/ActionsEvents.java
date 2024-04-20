package selenium_intro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEvents {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/events/javascript-events.html");
        driver.manage().window().fullscreen();
        //We can use Action class to perform the following:
        //Hover over element
        //Click context menu ( similar to right-click using the mouse )
        //Move to element using moveToElement()
        //double click using doubleClick()
        //single click using click()

        //We can use Keys (Enums) to perform Keyboard task
        //such as CTRL+A CTRL+V SHIFT etc...
        Actions action = new Actions(driver);

        //OnBlur
        WebElement onBlurButton = driver.findElement(By.xpath("//button[@id='onblur']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('blur'))", onBlurButton);
        Thread.sleep(3000);

        //OnContextMenu: performs a right click action to trigger the onContextMenu
        WebElement contextMenuButton = driver.findElement(By.xpath("//button[@id='oncontextmenu']"));
        action.contextClick(contextMenuButton).build().perform();
        Thread.sleep(3000);

        //OnKeyDown
        WebElement onKeyDownButton = driver.findElement(By.xpath("//button[@id='onkeydown']"));
        onKeyDownButton.sendKeys(Keys.DOWN);
        Thread.sleep(3000);

        //OnKeyUp
        WebElement onKeyUpButton = driver.findElement(By.xpath("//button[@id='onkeyup']"));
        onKeyUpButton.sendKeys(Keys.UP);
        Thread.sleep(3000);

        //OnKeyPress
        WebElement onKeyPress = driver.findElement(By.xpath("//button[@id='onkeypress']"));
        onKeyPress.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

       //OnMouseOver:
        WebElement onMouseOver = driver.findElement(By.xpath("//button[@id='onmouseover']"));
        action.moveToElement(onMouseOver).build().perform();
        Thread.sleep(3000);

      //OnMouseLeave:
        WebElement onMouseLeave = driver.findElement(By.xpath("//button[@id='onmouseleave']"));
        action.moveToElement(onMouseLeave).moveToElement(onMouseOver).build().perform();
        Thread.sleep(3000);

        driver.close();
    }
}
