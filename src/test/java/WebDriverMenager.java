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


        //wartośc atrybutów
        WebElement attrEql = driver.findElement(By.xpath("//button[@id='clickOnMe']"));
        WebElement attrNotEql = driver.findElement(By.xpath("//button[@id!='clickOnMe']"));
        WebElement attrContain = driver.findElement(By.xpath("//*[@name, 'ame']"));
        WebElement startsWith = driver.findElement(By.xpath("//*[@starts-with(@name, 'user')]"));

        //dzieci wstępne zstępne/ relacje

        WebElement child = driver.findElement(By.xpath("//div/child::ul"));//zstępni nad tagiem ref
        WebElement desc = driver.findElement(By.xpath("//div/../.."));//bezpośredni rodzic
        WebElement desc1 = driver.findElement(By.xpath("//div/descendant::"));
        WebElement asc = driver.findElement(By.xpath("//div/ancestor::")); // dzieci, wnuki
        WebElement following = driver.findElement(By.xpath("//img/following::")); // dzieci,
        WebElement followingSibling = driver.findElement(By.xpath("//img/following-sibling::")); // dzieci, po tagu ten sam poziom
        WebElement prec = driver.findElement(By.xpath("//img/preceding::")); // elementy przed obrazkiem
        WebElement precSibling = driver.findElement(By.xpath("//img/preceding-sibling::")); // elementy przed obrazkiem ten sam poziom


//$x("//input")


        WebElement divsAndLinks = driver.findElement(By.xpath("//a | //div"));
        WebElement andOp = driver.findElement(By.xpath("//input[@name='fname' and @id='fname']"));
        WebElement orOp = driver.findElement(By.xpath("//input[@name='fname' or @id='fname']"));





















    }
}
