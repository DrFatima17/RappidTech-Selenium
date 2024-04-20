package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExeClick {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://testpages.eviltester.com/styled/index.html");
            driver.manage().window().fullscreen();
            Thread.sleep(2000);

            WebElement link = driver.findElement(By.xpath("//a[@id='webdriverexamplepage']"));
            JavascriptExecutor js =  (JavascriptExecutor) driver;

            //Use method : js.executeScript( method: "arguments[0].click()". WebElement );
            js.executeScript("arguments[0].click()", link);

            //clickElementWithJavaScriptExecutor(driver,link); // This can replace the code on line 19-20
            Thread.sleep(3000);
            driver.close();


        }
        public static void clickElementWithJavaScriptExecutor(WebDriver driver, WebElement element){
            JavascriptExecutor js =  (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", element);
        }

    }

