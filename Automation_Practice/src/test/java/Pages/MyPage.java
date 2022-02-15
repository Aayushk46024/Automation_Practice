package Pages;

import TestBase.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class MyPage extends TestBase {
    WebDriver driver;

    @FindBy(xpath = "(//*[@id='block_top_menu']/ul/li[3]/a")
    WebElement tShirtSection;
    @FindBy(id = "ul_layered_id_attribute_group_1")
    WebElement verifySelectTshirt;
    @FindBy(id = "layered_id_attribute_group_1")
    WebElement selectSize;
    @FindBy(id ="layered_id_attribute_group_13")
    WebElement selectColor;
    @FindBy(className = "replace-2x img-responsive")
    WebElement selectedTshirt;
    @FindBy(linkText = "In stock")
    WebElement inStock;


    public MyPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void tShirtClick()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        System.out.println("Hello");
        tShirtSection.click();
    }

    public void verifySize()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        for(int i=0; i<3; i++)
        {
            verifySelectTshirt.click();
            System.out.println(verifySelectTshirt.isSelected());
        }
    }

    public void selectTshirtSize()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        selectSize.click();
    }

    public void selectTshirtColor()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        selectColor.click();
    }

    public void verifyItemIsInStock()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        Assert.assertEquals(selectedTshirt, inStock);
    }
}
