import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverMenager {
    //WebElement attrTag = driver.findElement(By.xpath("/html/body/button")); // Podstawowa ścieżka lokalizacji

    @Test
    public void xPath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basics.html");


        WebElement xPath = driver.findElement(By.xpath("/html/body/button")); // Podstawowa ścieżka lokalizacji
    }
}
