import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class UploadFile {
    @Test
    public void uploadFile() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        int randomNumber = (int) (Math.random()*1000); //generowanie randomowego numeru
        driver.navigate().to("https://testeroprogramowania.github.io/selenium/fileupload.html");
        WebElement input = driver.findElement(By.id("myFile"));
        input.sendKeys("C:\\Users\\marci\\Desktop\\Page\\marcin.docx");
        //alternatywna metoda sikulix - sikuli file upload

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile  = screenshot.getScreenshotAs(OutputType.FILE); //dodanie nazwy pliku (srcFile)
        String fileName = "beforeUpload" + randomNumber + ".png"; // stworzenie stringa który będzie dodadany w screenshot
        try {
            FileUtils.copyFile(srcFile, new File("src/test/resources/" + fileName));//kliknięcie show context i opakowanie try/catch wyjątkiem
       //pisząc kod wprowadzam tylko tą linikę - "src/test/resources/"(określenie ścieżki + fileName(dodanie Stringa)
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        //actions.contextClick().perform();  //klikanie prawym przyciskiem myszy
        actions.contextClick(input).perform();
    }
}
