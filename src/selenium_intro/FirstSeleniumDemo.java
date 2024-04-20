package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

/* Jar file-> java archive file.
it is a bunch of method,classes and other resources that will allow you to use them to build you testing framework.
// slows down the code by --> Thread.sleep (millis:3000)
// close the browser by --> driver.close()
*/

public class FirstSeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        //Set the path to chrome driver executable/ set a driver path
        System.setProperty("webdriver.chrome.driver","./browserdrivers/chromedriver.exe");

        // create chrome driver instance/create an instance of ChromeDriver
        WebDriver driver=new ChromeDriver();

        // open website/ navigate to URL. use driver.get("") or driver.navigate().to("")
        driver.get("https://www.google.com");

        // maximize the screen
        driver.manage().window().fullscreen();

        // will wait 3 seconds
        Thread.sleep(3000);

        //will close browser
        driver.close();
    }
}
