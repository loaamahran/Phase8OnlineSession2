package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    protected WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setUp() {
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");


    }

   @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }

}
