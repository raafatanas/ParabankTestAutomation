import base.BaseTest;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Basarili kullanici girisi kontrolu")
    public void LoginSuccesfulControl(){

        loginPage.fillUserName(userName)
                 .fillPassword(password)
                 .clickLogin();

        homePage.accountControl("Welcome " + userName);
    }

    @Test(description = "Basarisiz kullanici girisi kontrolu")
    public void LoginUnuccesfulControl(){

        loginPage.fillUserName(userName)
                .fillPassword("12345")
                .clickLogin();

        //mainPage.errorControlMessage("The username ..");
    }

    @Test(description = "Required kontrolu")
    public void LoginRequiredControl(){

        loginPage.fillUserName("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");


        loginPage.fillUserName(userName)
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUserName(userName)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome " + userName);
    }
}
