import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class KlikanieNaElement {



    WebDriver driver;
    @Test
    public void klikanieWElementy(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/");
        driver.manage().window().maximize();

        WebElement podstawowaStrona = driver.findElement(By.linkText("Podstawowa strona testowa"));
        podstawowaStrona.click();


        //pole wyboru
        WebElement selectCar = driver.findElement(By.cssSelector("select")); // pole z listą
        Select cars = new Select(selectCar); // zdefiniowanie selecta (konstruktor)
        cars.selectByIndex(2);// wybór po indexie
        cars.selectByVisibleText("Saab"); //Tekst który jest widoczny dla użytkownika
        cars.selectByValue("volvo");

        //pobieranie opcji
        List<WebElement> options = cars.getOptions();
        for (WebElement option : options){
            System.out.println(option.getText());

        }


        WebElement clicOnMe = driver.findElement(By.id("fname"));
        clicOnMe.sendKeys("MArcin");

        WebElement userName = driver.findElement(By.name("username"));
        userName.clear();
        userName.sendKeys("admin");
        //userName.sendKeys(Keys.ENTER);


        //radiobutton/ chekbox

        WebElement checkBox = driver.findElement(By.cssSelector("[type='checkbox']"));
        checkBox.click();

        WebElement maleBox = driver.findElement(By.cssSelector("[value='male']"));
        maleBox.click();




    }


}
