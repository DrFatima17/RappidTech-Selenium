import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    /*TestCase:
     * As a user , when I navigate to http://ec2-3-81-250-170.compute-1.amazonaws.com:8080/employees/list
     * and when we click on the add employee button
     * Then you will have a form displayed to enter first,last name and email address
     * then user click on save
     * Verify that the user entered in the User interface is being saved into the DB
     */
    /*
    The answer has two part: successfully add data to UI. Then connect Java to DB and retrieve the last row
     */
    public static void main(String[] args) throws InterruptedException {

        // PART 1: ENTER DATA TO UI AND SAVE IT
        String firstNameInsertedUI = "Fatima";
        String lastNameInsertedUI = "A";
        String emailInsertedUI = "123@email.com";

        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Upcasting
        driver.get("http://ec2-3-81-250-170.compute-1.amazonaws.com:8080/employees/list");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstNameInsertedUI);
        driver.findElement(By.id("lastName")).sendKeys(lastNameInsertedUI);
        driver.findElement(By.id("email")).sendKeys(emailInsertedUI);
        driver.findElement(By.xpath("//button[.='Save']")).click();
        Thread.sleep(4000);

        // PART 2: CONNECT TO DB AND RETRIEVE LAST ROW:

        //url, username,password
        String url = "jdbc:postgresql://rappidtechdb.c9gw58tlkxgg.us-east-1.rds.amazonaws.com/";
        String username = "postgres";
        String password = "postgres";
    }
}
