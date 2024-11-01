package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("FirstName alani doldur")
    public RegisterPage fillFirstName(String text){
        driver.findElement(By.id("customer.firstName")).sendKeys(text);
        return this;
    }

    @Step("LastName alani doldur")
    public RegisterPage fillLastName(String text){
        driver.findElement(By.id("customer.lastName")).sendKeys(text);
        return this;
    }

    @Step("Street Adress alani doldur")
    public RegisterPage fillStreetAdress(String text){
        driver.findElement(By.id("customer.address.street")).sendKeys(text);
        return this;
    }

    @Step("City Address alani doldur")
    public RegisterPage fillCityAdress(String text){
        driver.findElement(By.id("customer.address.city")).sendKeys(text);
        return this;
    }

    @Step("State Adress alani doldur")
    public RegisterPage fillStateAdress(String text){
        driver.findElement(By.id("customer.address.state")).sendKeys(text);
        return this;
    }

    @Step("Zipcode alani doldur")
    public RegisterPage fillAdressZipcode(String text){
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(text);
        return this;
    }

    @Step("PhoneNumber alani doldur")
    public RegisterPage fillPhoneNumber(String text){
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(text);
        return this;
    }

    @Step("SSN alani doldur")
    public RegisterPage fillSSN(String text){
        driver.findElement(By.id("customer.ssn")).sendKeys(text);
        return this;
    }

    @Step("UserName alani doldur")
    public RegisterPage fillUsername(String text){
        driver.findElement(By.id("customer.username")).sendKeys(text);
        return this;
    }

    @Step("Password alani doldur")
    public RegisterPage fillPassword(String text){
        driver.findElement(By.id("customer.password")).sendKeys("test123");
        return this;
    }

    @Step("RepeatedPassword alani doldur")
    public RegisterPage fillRepeatedPassword(String text){
        driver.findElement(By.id("repeatedPassword")).sendKeys("test123");
        screenshot();
        return this;
    }

    @Step("Register butonu tiklanir")
    public RegisterPage registerClick(){
        driver.findElement(By.cssSelector("[value='Register']")).click();
        return this;
    }

}
