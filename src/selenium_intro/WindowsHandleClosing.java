package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleClosing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        // finally block forces the code no matter what

        try {
            driver.findElement(By.name("qqqq")).sendKeys("selenium");

            // the above code will throw NoSuchElementException: no such element: Unable to locate element
            // the element name=q not name=qqqq.
            // so we can use NoSuchElementException, else add finally block:

        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
            ;
        } finally { // this will always run , whether your try statement throws an exception or not
            Thread.sleep(1000);
            driver.quit();
        }
    }
}