package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./browserdrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        driver.manage().window().fullscreen();

//LOCATE ELEMENTS (without Xpath):

        // locate  by: By.id for id attribute
        // findElement-->without an "s"
        // dataType   variable    =  element;
        //WebElement googleInputBox =
                driver.findElement(By.id("HTMLFormElements"));

        // locate by By.name("") for name attribute
        WebElement inputBox= driver.findElement(By.name("username"));

        // locate by By.className("") for class attribute
        driver.findElement(By.className("centered"));

        // locate by By.tagName("")
        driver.findElement(By.tagName("div"));

        // locate by By.linkText ("") // full text inside anchor tag <a>
        driver.findElement(By.linkText("page?app=basichtmlformexample&t=About"));

        // locate by By.partialLinkText("") //  portion of the text inside anchor tag
        driver.findElement(By.partialLinkText("page?app=basich"));

        // locate by By.cssSelector("")
                              //  tagName#idValue OR
                              //  tagName.classValue


        //locate element by By.Xpath()// 95% chance to successfully locate element. also works for dynamic elements
        driver.findElement(By.xpath("//input[@id='username']"));

        // send value/ string/ text into input box using sendKeys("")
        inputBox.sendKeys("selenium for testers");
        Thread.sleep(2000);
        driver.close();
    }
}
