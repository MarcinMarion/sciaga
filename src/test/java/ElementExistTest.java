import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementExistTest {
    //element który jest dostępny w strókturze html
    WebDriver driver;

    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/basics.html");
//        System.out.println(elementExist(By.tagName("p")));  //druga metoda nzawa elementExistSecond
//        System.out.println(elementExist(By.id("topSecret"))); ////druga metoda nzawa elementExistSecond
//        driver.findElement(By.tagName("p"));
//        driver.findElement(By.id("topSecret"));

        System.out.println(driver.findElement(By.tagName("p")).isDisplayed()); //zwraca true gdy widoczny
        WebElement chetBox = driver.findElement(By.cssSelector("[type='checkbox']"));
        chetBox.click();
        System.out.println(chetBox.isSelected());
    }

    public boolean elementExist(By locator) {

        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }


    }
    // druga metoda - czy element istnieje na stronie - z wykorzystanie, listy
//    public boolean elementExistSecond(By locator) {
//        return driver.findElements(locator).size() > 0;
}

  //      System.out.println(driver.findElement(By.tagName("p")).isEnabled()); //zwraca true gdy edytowalny
//
