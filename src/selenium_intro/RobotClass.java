package selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass {
    // not a part of selenium. was built before they build selenium probably in the 1990s
    // key/mouse press and key/mouse release are the two methods used.
    //We can use Robot class from java.awt package to also perform same task as Keys class
    // ( its very likely not to be used)
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sketch.io/sketchpad/");
        driver.manage().window().fullscreen();
        Robot robot=new Robot();
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);// detect the state of mouse button
        robot.keyPress(KeyEvent.VK_DOWN); // presses down button in keyboard
        robot.keyRelease(KeyEvent.VK_TAB); // presses Tab button in keyboard
        robot.keyPress(KeyEvent.VK_ENTER); // presses Enter key on keyboard
        driver.quit();
    }
}
