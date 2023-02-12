import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

    @Test
    public void executeJavascript(String s, WebElement basigPageLink) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.manage().window().maximize();
        WebElement pageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()" , pageLink);

        WebElement name =driver.findElement(By.name("fname"));
        executor.executeScript("arguments[0],setAttribute('value','Marcin');", name);
    }
}