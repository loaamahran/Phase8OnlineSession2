package statusCode;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class StatusCodesTests extends BaseTests {
@Test
    void testStatuscode200() {
    driver.findElement(By.linkText("Status Codes")).click();
    driver.findElement(By.linkText("200")).click();
    String expectedResult = ("This page returned a 200 status code.");
    String actualResult = driver.findElement(By.tagName("p")).getText();
    assertTrue(actualResult.contains(expectedResult));
}
    @Test
    void testStatuscode301() {
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("301")).click();
        String expectedResult = ("This page returned a 301 status code.");
        String actualResult = driver.findElement(By.tagName("p")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    void testStatuscode404(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("404")).click();
        String expectedResult=("This page returned a 404 status code.");
        String actualResult = driver.findElement(By.tagName("p")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }


    @Test
    void testStatuscode500(){
        driver.findElement(By.linkText("Status Codes")).click();
        driver.findElement(By.linkText("500")).click();
        String expectedResult=("This page returned a 500 status code.");
        String actualResult = driver.findElement(By.tagName("p")).getText();
        assertTrue(actualResult.contains(expectedResult));
    }

}
