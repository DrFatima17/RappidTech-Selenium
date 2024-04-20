package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // upcasting
        driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");
        driver.manage().window().fullscreen();

        // uses the method switchTo().

        //1.switch to the frame by index(assuming there is a frame on the page)
        driver.switchTo().frame(0); // takes you to frame
        // to retrieve a text you have to go to element in this frame
        String text = driver.findElement(By.xpath("//h1[.='Nested Frames Example']")).getText();
        System.out.println(text);

        //switch back to main HTML frame (default frame) before entering another frame
        driver.switchTo().defaultContent();

        // 2.switch to another frame using String:
        driver.switchTo().frame("right");
        // retrieve text from this frame
        String textInFrame = driver.findElement(By.id("right2")).getText();
        System.out.println(textInFrame);

        //switch back to main HTML frame (default frame) before entering another frame
        driver.switchTo().defaultContent();

        //3. switch to another frame using Web Element:
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='footer']")));
        // retrieve text from this frame
        String textInSecondFrame = driver.findElement(By.xpath("//a[.='EvilTester.com']")).getText();
        System.out.println(textInSecondFrame);

        Thread.sleep(1000);
        driver.close();


    }
}
