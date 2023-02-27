package pl.testeroprogamowania;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthTest extends BaseTest{
    @Test(dependsOnMethods = {"third"})
    public void firstTest(){
        System.out.println("I am First test");
    }
    @Test(dependsOnMethods = {"firstTest"})
    public void secondTest(){
        System.out.println("I am second test");
    }
    @Test(dependsOnMethods = {"secondTest"})
    public void third(){
        System.out.println("I am third test");
    }

    @Test(dataProvider = "data")
    public void dpTest(String val){//String zdefunowaniowanie wartości
        System.out.println(val);
    }

    @DataProvider(name = "data") //stosowane podczas duplikacji kodu, aby uruchomic ten same test kilkuktornie zmieniająć wartośc. DP dostarcza dane testowe dla konkretnej medoty testowej
    public Object[][] dataProvider(){
        return new Object[][] {{"I am firts test"}, {"I am second test"} , {"I am third test"}};

    }
}
