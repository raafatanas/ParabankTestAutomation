package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest
{

    @Step("Kullanici adi alani doldur")
    public LoginPage fillUserName(String text){
        driver.findElement(By.name("username")).sendKeys(text);
        return this;
    }

    @Step("Password alani doldur")
    public LoginPage fillPassword(String text){
        driver.findElement(By.name("password")).sendKeys(text);
        return this;
    }

    @Step("Login butona tiklanir")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[value='Log In']")).click();
        screenshot();
        return this;
    }

    @Step("Register butona tiklanir")
    public LoginPage clickRegister(){
        driver.findElement(By.cssSelector("[href*='register.htm']")).click();
        return this;
    }



}
