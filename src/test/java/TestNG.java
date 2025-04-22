import Pages.Login;
import Pages.homePage;
import org.example.Excelread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.example.excelReader;

import java.io.IOException;
import java.time.Duration;

public class TestNG {
    WebDriver driver;

    homePage HomePage;
    Login login;

    //*[@id="cartModal"]/div/div/div[2]/p[2]/a/u
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "E:\\Atos\\automation\\firstselenium\\drivers\\chromedriver-win64\\chromedriver.exe   ");
        driver=new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }
    @Test(priority = 1)
    public void homePage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(100));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(dr))
        String actualTitle = driver.getTitle();
        String expectedTitle="Automation Exercise";
        Assert.assertEquals(actualTitle  , expectedTitle , "home page is not visible");
    }
    @Test(priority = 2)
    public void verifySignUp(){
        HomePage = new homePage(driver);
        login = new Login(driver);
        HomePage.clickSignup();
        //driver.findElement(By.linkText("Signup / Login")).click();
        WebElement text = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"));
        Assert.assertTrue(text.isDisplayed() , "text is not visible");
    }
    @Test(priority = 3)
    public void verifyEnterAccount() throws IOException {
        String email = Excelread.getCellData("E:\\Atos\\automation\\FirstSeleniumScript\\data.xlsx" , "test" , 1 , 0);
        String username = Excelread.getCellData("E:\\Atos\\automation\\FirstSeleniumScript\\Data.xlsx" , "test" , 1 , 1);

        login = new Login(driver);
        login.EnterName(username);
        login.enterEmail(email);
        /*login.click();
        //driver.findElement(By.name("name")).sendKeys("lamis");

        //driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='email']")).sendKeys("laallaa@gmail.com");
        //driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        WebElement accountInfo = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/h2/b"));
        Assert.assertTrue(accountInfo.isDisplayed() ,"account info is not displayed");*/
    }
    /*@Test(priority = 4)
    public void verifyAccountCreation(){
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys("12345678");

        driver.findElement(By.xpath("//*[@id=\"days\"]/option[29]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[7]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[18]")).click();

        Actions Action = new Actions(driver);
        Action.scrollByAmount(0 , 500).perform();

        driver.findElement(By.xpath("//label[contains(text(), 'Sign up for our newsletter!')]")).click();
        driver.findElement(By.xpath("//label[contains(text(), 'Receive special offers from our partners!')]")).click();

        driver.findElement(By.id("first_name")).sendKeys("Lamis");
        driver.findElement(By.id("last_name")).sendKeys("Test");
        driver.findElement(By.id("company")).sendKeys("depi");
        driver.findElement(By.id("address1")).sendKeys("ismailia");
        driver.findElement(By.id("address2")).sendKeys("ismailia2");
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[4]")).click();
        driver.findElement(By.id("state")).sendKeys("australia");
        driver.findElement(By.id("city")).sendKeys("Los Angeles");
        driver.findElement(By.id("zipcode")).sendKeys("90001");
        driver.findElement(By.id("mobile_number")).sendKeys("01205274925");

        driver.findElement(By.xpath("//button[text()='Create Account']")).click();
        WebElement successMessage = driver.findElement(By.xpath("//h2[@class='title text-center']/b"));
        Assert.assertTrue(successMessage.isDisplayed(), "Account creation was not successful");
    }

    @Test(priority = 5)
    public void verifyLogging(){
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
        WebElement loggedInText = driver.findElement(By.xpath("//li/a[contains(text(), 'Logged in as')]"));
        Assert.assertTrue(loggedInText.isDisplayed(), "The 'Logged in as' text is not visible");
    }
    @Test(priority = 6)
    public void verifyAccountDeletion(){
        driver.findElement(By.xpath("//li/a[contains(text(), 'Delete Account')]")).click();
        WebElement w=driver.findElement(By.xpath("//div/h2[@class='title text-center']/b[contains(text(), 'Account Deleted!')]"));
        Assert.assertTrue(w.isDisplayed(), "Account deletion was not successful");
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
    }

    @AfterTest
    public void close() {
        driver.close();

    }*/

    public void insert(){

    }


}
