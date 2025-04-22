package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
 WebDriver driver;
 private By signupTitle =  By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
 private By NameField =  By.name("name");
 private By EmailField = By.xpath("//div[@class='signup-form']//input[@name='email']");
 private By signupButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    //constructor
    public Login(WebDriver driver){
        this.driver=driver;
    }
    public void getTitle(){
        driver.findElement(signupTitle).getText();
    }
    public void EnterName(String Name){
        driver.findElement(NameField).sendKeys(Name);
    }
    public void enterEmail(String Email){
        driver.findElement(EmailField).sendKeys(Email);
    }
    public void click(){
        driver.findElement(signupButton).click();
    }
}
