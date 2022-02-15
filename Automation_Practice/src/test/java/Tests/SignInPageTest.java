package Tests;

import TestBase.TestBase;
import org.testng.annotations.Test;


public class SignInPageTest extends TestBase {
    @Test
    public void signIndetails()
    {
        pageFactory.getSignInPage().signinPage();
    }
}
