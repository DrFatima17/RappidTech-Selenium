package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JavaScriptExeHighlight {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/index.html");
        driver.manage().window().fullscreen();
        //create instance of element:
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // identify the webElement:
        WebElement element = driver.findElement(By.xpath("//h2[.='Examples']"));

        //Use method : js.executeScript("arguments[0].setAttribute();",element);
        //                ( method from Javascript; WebElement )

        // Execute JavaScript code to apply a border and change background color
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background-color: yellow;');", element);

        Thread.sleep(2000);

        // Execute JavaScript code to remove the highlighting
        js.executeScript("arguments[0].setAttribute('style', 'border: none; background-color: none;');", element);

        Thread.sleep(2000);
        driver.close();

        // separate method for highlight:
        highlight(driver, element);
    }

//        // highlight a table:
//        List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
//        for (WebElement row : tableRows) {
//            List<WebElement> tableData = row.findElements(By.tagName("td"));
//            for (WebElement col : tableData) {
//                //highlight the cell before printing it
//                highlightElement(driver, col);
//                System.out.println(col.getText());
//            }


            // we can make a separate method to call onto highlighting in JavaScript:
            private static void highlight(WebDriver driver, WebElement element) throws InterruptedException {
                JavascriptExecutor js = (JavascriptExecutor) driver;

                // Execute JavaScript code to apply a border and change background color
                js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background-color: yellow;');", element);


                Thread.sleep(1000);


                // Execute JavaScript code to remove the highlighting
                js.executeScript("arguments[0].setAttribute('style', 'border: none; background-color: none;');", element);
            }

        }
