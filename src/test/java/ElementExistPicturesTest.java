import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementExistPicturesTest {

    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement image = driver.findElement(By.tagName("img"));
        System.out.println(image.getAttribute("naturalHeight")); // zwrawcamy wielkość obrazka jeślo jest obrazek>0 zakładamy że istynieje
    }

    @Test
    public void elementExistTest1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/image.html");

        WebElement image = driver.findElement(By.tagName("img"));
        String heigh = image.getAttribute("naturalHeight");
     //   System.out.println(image.getAttribute("naturalHeight")); //zwróciło 0 zakładamy że obrazek nie wyświetlany
        Assert.assertEquals("0" , heigh);
    }
}
