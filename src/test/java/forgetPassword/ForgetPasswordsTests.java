package forgetPassword;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ForgetPasswordsTests extends BaseTests {
@Test
    void testForgetPassword(){
    driver.findElement(By.linkText("Forgot Password")).click();
    driver.findElement(By.id("email")).sendKeys("loaametwaly@gmail.com");
    driver.findElement(By.id("form_submit")).click();
    String expectedResult="Internal Server Error";
    String actualResult=driver.findElement(By.xpath("/html/body/h1")).getText();
    assertTrue(actualResult.contains(expectedResult));}
}
