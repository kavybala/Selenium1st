import org.testng.annotations.*;

public class Demo_AnnotationOrder {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite fired....");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("Before class fired...");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test fired...");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method fired...");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("After method fired...");
    }
    @AfterTest
    void afterTest(){
        System.out.println("After Test fired...");
    }
    @AfterClass
    void afterClass(){
        System.out.println("After class fired...");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite fired...");
    }
    @Test
    void testOne(){
        System.out.println("Test one fired...");
    }
    @Test
    void testTwo(){
        System.out.println("Test two fired...");
    }
}
