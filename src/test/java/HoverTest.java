import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest {

    //symulacja najechania na element
    @Test
    public void actionsTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basic.html");

        WebElement hedder = driver.findElement(By.tagName("h1"));


        Actions actions = new Actions(driver);
        actions.moveToElement(hedder).perform(); // każda akcja musi być zakończona metodą perform()

//        actions.dragAndDrop() // przeniesienie określamy źdórło i targe
//        actions.moveToElement() // symulacja
//        actions.contextClick()// klikniecie prawym przyciskiem myszy
//        actions.doubleClick()// podwójne kliknięcie w element


    }
}

