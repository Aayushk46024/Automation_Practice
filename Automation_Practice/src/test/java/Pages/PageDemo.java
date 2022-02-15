package Pages;

import org.openqa.selenium.WebDriver;

public class PageDemo {
    WebDriver driver;

    private SignInPage signInPage;
    private LogInPage logInPage;
    private MyPage myPage;

    public PageDemo(WebDriver driver)
    {
        this.driver = driver;
    }

    public SignInPage getSignInPage() {
        if(signInPage == null) {
            signInPage = new SignInPage(driver);
        }
        return signInPage;
    }

    public LogInPage getLogInPage() {
        if(logInPage == null) {
            logInPage = new LogInPage(driver);
        }
        return logInPage;
    }

    public MyPage getHomePage() {
        if(myPage == null){
            myPage = new MyPage(driver);
        }
        return myPage;
    }

}
