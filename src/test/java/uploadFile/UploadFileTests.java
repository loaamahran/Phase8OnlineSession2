package uploadFile;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Paths;

import static org.testng.AssertJUnit.assertEquals;

public class UploadFileTests extends BaseTests {
@Test
    void testUploadFile(){
    driver.findElement(By.linkText("File Upload")).click();
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\dell\\Desktop\\WhatsApp Image 2024-04-01 at 05.53.26_c5f3d1ea.jpg");
    driver.findElement(By.id("file-submit")).click();
String expectedResult="WhatsApp Image 2024-04-01 at 05.53.26_c5f3d1ea.jpg";
    String actualResult=driver.findElement(By.id("uploaded-files")).getText();

    assertEquals(expectedResult,actualResult);
    //driver.findElement(By.id("file-upload")).click();

    /*File file = new File("");}
*/
}
    }


