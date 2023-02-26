package pl.testeroprogamowania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogamowania.BaseTest;

import java.util.concurrent.TimeUnit;

public class SecondTest extends BaseTest {
    WebDriver driver;

    @Test
    public void firstTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait przez 10 sekund szuka
        driver.findElement(By.id("clickOnMe")).click();

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
    }
    @Test
    public void secondTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait przez 10 sekund szuka
        driver.findElement(By.id("clickOnMe")).click();

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
    }
}