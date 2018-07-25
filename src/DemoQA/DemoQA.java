package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Selenium;

public class DemoQA extends Selenium {

    private static WebElement inputFirstName;
    private static WebElement inputLastName;
    private static WebElement selectHobby;
    private static WebElement enterMobilePhone;
    private static WebElement enterUsername;
    private static WebElement enterEmailAddress;
    private static WebElement enterPassword;
    private static WebElement enterConfirmedPassword;
    private static WebElement clickSubmitBtn;

    public static void main(String[] args) {

        WebDriver driver = initChrome("browsers\\chromedriver.exe", "http://demoqa.com/registration/");

        inputFirstName = inputFirstName(driver);
        inputLastName = inputLastName(driver);
        selectHobby = selectHobby(driver);
        enterMobilePhone = enterMobilePhone(driver);
        enterUsername = enterUsername(driver);
        enterEmailAddress = enterEmailAddress(driver);
        enterPassword = enterPassword(driver);
        enterConfirmedPassword = enterConfirmedPassword(driver);
        clickSubmitBtn = clickSubmitBtn(driver);


//        WebElement inputFirstName = driver.findElement(By.id("name_3_firstname"));
//        System.out.println("First name field is selected " + "" + inputFirstName.isDisplayed());
//        inputFirstName.sendKeys("Charlie");
//
//        WebElement inputLastName = driver.findElement(By.id("name_3_lastname"));
//        System.out.println("Last name field is selected " + inputLastName.isDisplayed());
//        inputLastName.sendKeys("Chaplin");
//
//        WebElement selectHobby = driver.findElement(By.name("checkbox_5[]"));
//        selectHobby.click();
//        System.out.println("Hobby is selected " + "" + selectHobby.isSelected());
//
//        WebElement enterMobilePhone = driver.findElement(By.id("phone_9"));
//        enterMobilePhone.sendKeys("0897654321");
//        System.out.println("Phone number is entered " + "" + enterMobilePhone.isDisplayed());
//
//        WebElement username = driver.findElement(By.cssSelector("#username"));
//        username.sendKeys("charlie");
//        System.out.println("Username is entered " + username.isDisplayed());
//
//        WebElement emailAddress = driver.findElement(By.cssSelector("#email_1"));
//        emailAddress.sendKeys("charlie@gmail.com");
//        System.out.println("Email address is entered " + emailAddress.isDisplayed());
//
//        WebElement password = driver.findElement(By.cssSelector("#password_2"));
//        password.sendKeys("charlie90");
//        System.out.println("Password is entered " + password.isDisplayed());
//
//        WebElement confirmPassword = driver.findElement(By.cssSelector("#confirm_password_password_2"));
//        confirmPassword.sendKeys("charlie90");
//        System.out.println("Password is confirmed " + confirmPassword.isDisplayed());
//
//        WebElement submitBtn = driver.findElement(By.cssSelector("#pie_register > li:nth-child(14) > div > input[type=\"submit\"]"));
//        submitBtn.click();
//        System.out.println("Submit button is clicked " + submitBtn.isDisplayed());

    }


    private static WebElement inputFirstName(WebDriver driver) { //First Name field

        WebElement fName = driver.findElement(By.id("name_3_firstname"));
        System.out.println("First name field is selected " + fName.isDisplayed());
        fName.click();
        fName.sendKeys("Charlie");
        System.out.println("First name is entered" + fName.isDisplayed());
        return fName;
    }

    private static WebElement inputLastName(WebDriver driver) {
        WebElement lastName = driver.findElement(By.id("name_3_lastname"));
        lastName.click();
        System.out.println("Last name field is selected " + lastName.isDisplayed());
        lastName.sendKeys("Chaplin");
        System.out.println("Username is entered" + lastName.isDisplayed());
        return lastName;
    }

    private static WebElement selectHobby (WebDriver driver) {
        WebElement hobby = driver.findElement(By.name("checkbox_5[]"));
        hobby.click();
        System.out.println("Hobby is selected " + "" + hobby.isSelected());
        return hobby;
    }

    private static WebElement enterMobilePhone(WebDriver driver) {
        WebElement mobilePhone = driver.findElement(By.id("phone_9"));
        mobilePhone.sendKeys("0897654321");
        System.out.println("Phone number is entered " + mobilePhone.isDisplayed());
        return mobilePhone;
    }

    private static WebElement enterUsername(WebDriver driver) {
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("charlie");
        System.out.println("Username is entered " + username.isDisplayed());
        return username;
    }

    private static WebElement enterEmailAddress(WebDriver driver) {
        WebElement emailAddress = driver.findElement(By.cssSelector("#email_1"));
        emailAddress.sendKeys("charlie@gmail.com");
        System.out.println("Email address is entered " + emailAddress.isDisplayed());
        return emailAddress;
    }

    private static WebElement enterPassword(WebDriver driver) {
        WebElement password = driver.findElement(By.cssSelector("#password_2"));
        password.sendKeys("charlie90");
        System.out.println("Password is entered " + password.isDisplayed());
        return password;
    }

    private static WebElement enterConfirmedPassword(WebDriver driver) {
        WebElement confirmPassword = driver.findElement(By.cssSelector("#confirm_password_password_2"));
        confirmPassword.sendKeys("charlie90");
        System.out.println("Password is confirmed " + confirmPassword.isDisplayed());
        return confirmPassword;
    }

    private static WebElement clickSubmitBtn(WebDriver driver) {
        WebElement submitBtn = driver.findElement(By.cssSelector("#pie_register > li:nth-child(14) > div > input[type=\"submit\"]"));
        submitBtn.click();
        System.out.println("Submit button is clicked " + submitBtn.isDisplayed());
        return submitBtn;
    }


}

