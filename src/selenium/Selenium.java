package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium {
    public static void main(String[] args) {

        WebDriver driver = initChrome("browsers\\chromedriver.exe", "https://www.joecolantonio.com/SeleniumTestPage.html");
        WebElement header = testTitle(driver);
        clickAlertDialog(header);
        fillInput(driver);
        WebElement content21 = driver.findElement(By.id("content-2-1"));
        clickDropDown(content21);
        clickRadioBtn(driver);

    }

    private static void clickRadioBtn(WebDriver driver) {
        WebElement radioBtn = driver.findElement(By.cssSelector("#content-1 > p:nth-child(4) > input[type=\"radio\"]"));
        radioBtn.isSelected();
        System.out.println("Is c# selected?" + "" + radioBtn.isSelected());
        if (radioBtn.isSelected() == false) {
            radioBtn.click();
        }
        System.out.println("Is c# selected?" + "" + radioBtn.isSelected());
    }

    private static void clickDropDown(WebElement content21) {  //Test 4 drop down

        WebElement dropdown = content21.findElement(By.tagName("select"));
        dropdown.click();
        List<WebElement> options = dropdown.findElements(By.tagName("option"));
        for (WebElement element : options) {
            if (element.getText().equalsIgnoreCase("browser")) {
                element.click();
                String text = element.findElement(By.tagName("textarea")).getText();
            }
            System.out.println(element.getText());
        }

    }

    private static WebElement fillInput(WebDriver driver) { //Test 3 input field

        WebElement content21 = driver.findElement(By.id("content-2-1"));
        WebElement inputFirstName = content21.findElement(By.name("fname"));
        inputFirstName.sendKeys("Pyrvoto mi ime");
        return content21;
    }

    private static void clickAlertDialog(WebElement header) { //Test 2 click Alert Dialog

        WebElement alertDialog = header.findElement(By.tagName("h2"));
        alertDialog.click();
    }

    private static WebElement testTitle(WebDriver driver) { //Test 1 - find Title

        WebElement header = driver.findElement(By.cssSelector("#header"));
        WebElement h1 = header.findElement(By.tagName("h1"));
        String title = h1.getText();
        System.out.println(title);
        return header;

    }

    public static WebDriver initChrome(String browser, String url) {

        //System.setProperty("webdriver.chrome.driver", browser);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        return driver;
    }
}
