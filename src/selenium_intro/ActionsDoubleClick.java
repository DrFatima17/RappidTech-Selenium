package selenium_intro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsDoubleClick {
    // class that is used for interactions like drag&drop, mouse hover, double click
    // actions is always followed by .build().perform(); at the end

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");
        driver.manage().window().fullscreen();

        // find the button that you need to double-click
        WebElement button= driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        Actions actions= new Actions(driver);
        actions.doubleClick(button).build().perform();

        Thread.sleep(2000);
        driver.close();
    }
}
