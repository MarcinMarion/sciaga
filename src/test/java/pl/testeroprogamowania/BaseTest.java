package pl.testeroprogamowania;

import org.testng.annotations.*;

public class BaseTest {

  @BeforeSuite
  public void beforeSuite(){
      System.out.println("Before suite");
  }

  @BeforeClass
  public void beforeClass(){

  }


    @BeforeTest
    public void beforeTest() {
        System.out.println("i am running before test");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am running before method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("i am running after test");
    }
    @AfterMethod
    public void  aftereMethod(){
        System.out.println("I am running before method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

}
