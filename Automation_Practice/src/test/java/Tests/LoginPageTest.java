package Tests;

import TestBase.TestBase;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    @Test
    public void loginDetails()
    {
        pageFactory.getLogInPage().loginPage();
        pageFactory.getLogInPage().verifyLogin();
    }
}
