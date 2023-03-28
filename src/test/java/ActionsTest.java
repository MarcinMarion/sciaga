import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest {
    @Test
    public void actionsTest() {



        Actions actions = new Actions(driver);
        actions.contextClick().perform();
        actions.doubleClick(driver.findElement(By.id("bottom"))).perform();


    }
}

