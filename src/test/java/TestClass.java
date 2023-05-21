import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class TestClass {
    @Test
    public void firstTest() {
        AddClass addClass = new AddClass();
        int res = addClass.getSum(2, 3);
        Assert.assertEquals(5, res);

    }

    @Test
    public void secondTest() {
        System.out.println("This is second Test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
        System.out.println();
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Inside before method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
}


