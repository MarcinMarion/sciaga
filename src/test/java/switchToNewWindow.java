import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class switchToNewWindow {

    WebDriver driver;

    @Test
    public void testNewWindow() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        String currentWindow = driver.getWindowHandle(); //przełączenie do okna
        WebElement clickMe = driver.findElement(By.id("newPage"));
        clickMe.click();
        Set<String> windowNames = driver.getWindowHandles(); //nazwy wszystkich okien
        for(String window : windowNames){
            if(!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
            }
        WebElement cookieAccept = driver.findElement(By.cssSelector("class='EM1Mrb'"));
        cookieAccept.click();

        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Slenium");
        }


    }


