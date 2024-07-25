package login;

import base.BaseTests;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTests {


    public static void main(String[]args)
    {

    }
    @org.testng.annotations.Test
    public void testValidLogin(){
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualResult=driver.findElement(By.id("flash")).getText();
        String expectedResult="You logged into a secure area!";
        assertTrue(actualResult.contains(expectedResult));


    }
    @org.testng.annotations.Test
    public void testInvalidUserName(){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmit");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        String actualResult=driver.findElement(By.id("flash")).getText();
        String expectedResult="Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));}

    @org.testng.annotations.Test
    public void testInvalidPassword(){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!!");
        driver.findElement(By.className("radius")).click();
        String actualResult=driver.findElement(By.id("flash")).getText();
        String expectedResult="Your password is invalid!";

        assertTrue(actualResult.contains(expectedResult));}
}
