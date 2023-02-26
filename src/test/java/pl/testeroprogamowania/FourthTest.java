package pl.testeroprogamowania;

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
}
