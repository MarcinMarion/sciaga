package pl.testeroprogamowania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pl.testeroprogamowania.BaseTest;

import java.util.concurrent.TimeUnit;

@Listeners(value = {SampleTestListener.class})
public class FirstTest extends BaseTest {

    @Test @Ignore
    public void firstTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait przez 10 sekund szuka
        driver.findElement(By.id("clickOnMe")).click();

        String paraText = driver.findElement(By.cssSelector("p")).getText();
        Assert.assertEquals(paraText, "Dopiero się pojawiłem!");
        Assert.assertEquals(paraText, "Dopiero", "Teksty są różne");
    }

    @Test
    public void secondTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait przez 10 sekund szuka
        driver.findElement(By.id("clickOnMe")).click();


        WebElement para = driver.findElement(By.cssSelector("p"));
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(para.isDisplayed());
        softAssert.assertEquals(para.getText(), "Dopiero", "Teksty są różne");
        softAssert.assertTrue(para.getText().startsWith("Pojawiłem"));
        softAssert.assertFalse(para.getText().startsWith("Pojawiłem"));
        softAssert.assertEquals(para.getText(), "dopiero się" , "druga asercja");
        softAssert.assertAll();
        driver.quit();
    }
}

