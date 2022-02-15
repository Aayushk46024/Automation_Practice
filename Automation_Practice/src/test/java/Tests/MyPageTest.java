package Tests;

import TestBase.TestBase;
import org.testng.annotations.Test;

public class MyPageTest extends TestBase {

    @Test
    public void homePageDetails() {
        pageFactory.getLogInPage().loginPage();
        pageFactory.getLogInPage().verifyLogin();
        pageFactory.getHomePage().tShirtClick();
        pageFactory.getHomePage().verifySize();
        pageFactory.getHomePage().selectTshirtSize();
        pageFactory.getHomePage().selectTshirtColor();
        pageFactory.getHomePage().verifyItemIsInStock();
    }
}
