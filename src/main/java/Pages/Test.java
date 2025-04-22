package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    homePage HomePage;
    WebDriver driver;
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "E:\\Atos\\automation\\firstselenium\\drivers\\chromedriver-win64\\chromedriver.exe   ");
        driver=new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
        HomePage = new homePage(driver);
        HomePage.clickSignup();
    }

}
