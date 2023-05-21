import org.testng.annotations.BeforeClass;

public class BaseTestClass {
    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }
}