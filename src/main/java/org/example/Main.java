package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAMIS\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.automationexercise.com/");
        driver.findElement(By.linkText("Signup / Login")).click();
        driver.findElement(By.name("name")).sendKeys("lamis");

        // driver.findElement(By.cssSelector("button[class='submit']"));
       // driver.findElements(By.name("email")).get(1).sendKeys("lamis@gmail.com");
        driver.findElement(By.xpath("//div[@class='signup-form']//input[@name='email']")).sendKeys("laaaaaa@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();

    }

}