package selenium_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableAutomation {
    public static void main(String[] args) {
        // tables are used to match data from UI to database
        // in selenium, interacting with table element means locating a table
        //              and then navigating through its rows and columns to retrieve or manipulate the data.
        //findElements used with an "s"-> returns list of elements. cant get getText() method as its a list
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/tag/table.html");
        driver.manage().window().fullscreen();

//STEPS:

        //1.LOCATE A TABLE: locate an element in a table (use id,class,Xpath)
        driver.findElements(By.xpath("//td[.='Bob']")); //from any text
        //OR
        driver.findElements(By.xpath("//td[contains(text(),'Bob')]")); // from contains text
        //OR
        driver.findElement(By.xpath("//table[@id='mytable']//tr[3]/td[1]")); // from grandparent

        //2. RETRIEVE TEXT FROM CELLS:
        String textInCell = driver.findElement(By.xpath("//td[.='Bob']")).getText();
        System.out.println(textInCell);

        //3. NAVIGATE THROUGH ROWS & COLUMNS: Once table is located navigate through it to reach specific cells.
        //Get the list of all table rows
        List<WebElement> tableRows = driver.findElements(By.tagName("tr"));

        // 4.ITERATE through each of table rows & columns: to perform actions on multiple cells
        for (WebElement row : tableRows) {
            //for each table row get the list of the table data ( cells)
            List<WebElement> cells = row.findElements(By.tagName("td"));
            //iterate though each of the table data/cells for each single row
            for (WebElement cell : cells) {
                System.out.println(cell.getText());
            }
        }

        //5. WORKING WITH HEADERS:
        List<WebElement> tableHeader = driver.findElements(By.tagName("th"));
        for (WebElement header : tableHeader) {
            System.out.println(header.getText());
        }

        driver.close();
    }
}