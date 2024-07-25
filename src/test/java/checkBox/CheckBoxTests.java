package checkBox;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CheckBoxTests extends BaseTests {
@Test
    public void testCheckboxCheck(){
     driver.findElement(By.linkText("Checkboxes")).click();
    WebElement checkbox1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
    WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

if(checkbox1.isSelected()==false){
    checkbox1.click();

}
    Assert.assertTrue(checkbox1.isSelected());
    if(checkbox2.isSelected()==true){
        checkbox2.click();

    }
    Assert.assertFalse(checkbox2.isSelected());}


}

