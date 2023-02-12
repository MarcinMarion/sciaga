import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testIframe {


    @Test
    public  void testIframe(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.manage().window().maximize();
        //driver.switchTo().frame(0);
        WebElement iFrame = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iFrame);

        //driver.switchTo().frame();
       // driver.switchTo().frame(value); - specyficzna metota można użyć tylko jak iFrame ma name lub ID
        driver.findElement(By.id("fname")).sendKeys("Marcin");
    }
}