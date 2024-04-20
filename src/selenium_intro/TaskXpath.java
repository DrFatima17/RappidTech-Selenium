package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskXpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./browserdrivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        // to click on checkbox
        driver.findElement(By.xpath("//input[@type='checkbox'][@value='cb2']")).click();
        Thread.sleep(3000);
        // to check if checkbox is checked by default
        boolean isSelected= driver.findElement(By.xpath("//input[@type='checkbox'][@value='cb3']")).isSelected();
        System.out.println(isSelected);
        // to select radio button
        driver.findElement(By.xpath("//input[@type='radio' and @value='rd1']")).click();
        Thread.sleep(3000);
        // to check if radio button is selected by default
        boolean isRadioSelected= driver.findElement(By.xpath("//input[@type='radio' and @value='rd1']")).isSelected();
        System.out.println(isRadioSelected);
        // to chose option from a box
        driver.findElement(By.xpath("//option[@value='ms2']")).click();
        Thread.sleep(3000);
        // to choose multiple options from a box:

        // to select from drop down box:
        driver.findElement(By.xpath("//option[@value='ms4']")).click();
        Thread.sleep(3000);
        //driver.close();
    }
}
