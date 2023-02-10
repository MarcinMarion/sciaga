import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectCheck {
//napisz metode która przyjmuje string jako pamametr i zwraca boolen
    //metoda sprawdza czy parametr String jest jedną z opcji
    public boolean checkOption(String optionText, WebElement element) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for(WebElement option : options) {
            if(option.getText().equals(optionText))
            return true;

        }
        return false;
     }
    }






