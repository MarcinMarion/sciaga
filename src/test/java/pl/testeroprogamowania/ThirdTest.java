package pl.testeroprogamowania;

import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{
    @Test(priority = 2)
    public void firstTest(){
        System.out.println("I am First test");
    }
    @Test(priority = 0)
    public void secondTest(){
        System.out.println("I am second test");
    }
    @Test(priority = 1)
    public void third(){
        System.out.println("I am third test");
    }
}
