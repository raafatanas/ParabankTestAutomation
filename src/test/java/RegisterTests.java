import base.BaseTest;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();
    @Test(description = "Kullanici olusturma kontrolu")
    public void LoginSuccesfulControl(){
        String userName = createUserName();
        loginPage.clickRegister();
        registerPage.fillFirstName("test")
                .fillLastName("QA")
                .fillStreetAdress("Ankara")
                .fillCityAdress("Istanbul")
                .fillStateAdress("State")
                .fillAdressZipcode("243323")
                .fillPhoneNumber("24124133")
                .fillSSN("4231")
                .fillUsername(userName)
                .fillPassword("123")
                .fillRepeatedPassword("123")
                .registerClick();

        homePage.registerControl("Welcome " + userName);


    }


}
