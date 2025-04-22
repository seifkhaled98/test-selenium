package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homePage {
    WebDriver driver;
    private By signupButton = By.linkText("Signup / Login");
    //constructor
    public homePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickSignup(){
        driver.findElement(signupButton).click();
    }

}
