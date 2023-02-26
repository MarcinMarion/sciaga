import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitTest {
    WebDriver driver;

    @Test
    public void waitTest()  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/wait2.html");
        //driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS); //implicit wait przez 10 sekund szuka
        driver.findElement(By.id("clickOnMe")).click();
        //  Thread.sleep(5000);
      WebElement element = driver.findElement(By.cssSelector("pa"));
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
       // (driver.findElement(By.cssSelector("p"));
        wait.until(ExpectedConditions.visibilityOf(element));




    }
//    public void waitForElementToExist (By locator){
//        FluentWait<WebDriver> wait = new FluentWait<>(driver);
//        wait.ignoring(NoSuchElementException.class);
//        wait.withTimeout(Duration.ofSeconds(10));
//        wait.pollingEvery(Duration.ofSeconds(1));
//
//        wait.until(new Function<WebDriver, Boolean>() {
//            @Override
//            public Boolean apply(WebDriver webDriver) {
//                List<WebElement> elements = driver.findElement(locator);
//                if(elements.size()>0)
//                return null;
//            }
//        }
    }

