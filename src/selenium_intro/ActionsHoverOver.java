package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHoverOver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/csspseudo/css-hover.html");
        driver.manage().window().fullscreen();
        Actions action = new Actions(driver);

        //HOVER OVER A BUTTON:
        WebElement hoverOver = driver.findElement(By.xpath("//p[@id='hoverpara']"));
        action.moveToElement(hoverOver).build().perform();
        Thread.sleep(2000);
        WebElement text1 = driver.findElement(By.xpath("//p[@id='hoverparaeffect']"));
        System.out.println(text1.getText());

        WebElement hoverOver2 = driver.findElement(By.xpath("//p[@id='hoverdivpara']"));
        action.moveToElement(hoverOver2).build().perform();
        Thread.sleep(2000);
        WebElement text2 = driver.findElement(By.xpath("//p[@id='hoverdivparaeffect']"));
        System.out.println(text2.getText());

        // Test Case: is hover para text located on UI if mouse isn't hover overed the button:
        // * As a user if I don't hover on the first button then the text
        //"You can see this paragraph now that you hovered on the above 'button'." should not be displayed
        WebElement text3 = driver.findElement(By.xpath("//p[@id='hoverparaeffect']"));
        boolean paratext = text3.isDisplayed();
        System.out.println(paratext);

        driver.quit();
    }
}
