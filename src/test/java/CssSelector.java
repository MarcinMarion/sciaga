import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {

    @Test
    public void cssSelector(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basics.html");


        WebElement attrTag = driver.findElement(By.cssSelector("input[name='fname']")); //po tagu
        WebElement attrContains = driver.findElement(By.cssSelector("[name*='ame']")); //po części nazwy
        WebElement attrStarts = driver.findElement(By.cssSelector("[name^='f']")); //zaczyna się od
        WebElement attrEnds = driver.findElement(By.cssSelector("[name$='name']")); //kończy się na

        WebElement firstChild = driver.findElement(By.cssSelector("li:first-child")); // pierwszy element z listy
        WebElement lastChild = driver.findElement(By.cssSelector("li:last-child")); // ostatni element z listy
        WebElement thirdChild = driver.findElement(By.cssSelector("li:nth-child(3)")); // x element z listy



    }
}
