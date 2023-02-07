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


        WebElement fullPath = driver.findElement(By.xpath("/html/body/div/ul")); // /html/body/div/button Podstawowa ścieżka lokalizacji
        WebElement shortPath = driver.findElement(By.xpath("//ul")); //listy
        WebElement buttonID = driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        WebElement firstName = driver.findElement(By.xpath("//input[@name='fname']"));
        WebElement paraHidden = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement input = driver.findElement(By.xpath("//input"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        WebElement partialLink = driver.findElement(By.xpath("//a[contains(text(),'Visit')]"));//zawiera teskst

        //$x("(//input)[]") w nawiasie kwadratowym numer elementu
        //$x("//*[@name]") wszystkie elementy które mają name
        //$x("//*[@id]")
        //$x("//button[@id]")

        WebElement allXpath = driver.findElement(By.xpath("//*"));//całość
        WebElement secondElement = driver.findElement(By.xpath("(//input)[2]"));//drugi element
        WebElement lastElement = driver.findElement(By.xpath("(//input)[last()]"));
        WebElement elementWithAttr = driver.findElement(By.xpath("//*[@name]"));













    }
}
