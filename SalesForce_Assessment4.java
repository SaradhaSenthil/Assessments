Main Code
package mavenProjecta;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce_Assessment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notification");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println(driver); 
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("India$321");
        driver.findElement(By.id("Login")).click();
        //Implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click on APP Launcher
        driver.findElement(By.className("slds-icon-waffle")).click();
        //Click View All 
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        //Search individuals in view all 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Individuals");
        //click individuals
        driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Click New in individuals page
        driver.findElement(By.xpath("//div[@title='New']")).click();
        driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys("Senthilkumar");
        driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
        
        String surName = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
        Assert.assertEquals(surName, "SS");
        System.out.println(surName);
        
        driver.findElement(By.xpath("//div[@title='Edit']")).click();
        
        driver.findElement(By.xpath("//a[@class='select']")).click();
        driver.findElement(By.xpath("//a[@title='Mrs.']")).click();
        driver.findElement(By.xpath("//input[contains(@class,'firstName compoundBorderBottom')]")).sendKeys("Saradha");
        driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
        
        String nameSal = driver.findElement(By.xpath("//span[text()='Mrs. Saradha Senthilkumar']")).getText();
         Assert.assertEquals(nameSal, "Mrs. Saradha Senthilkumar");
         System.out.println(nameSal);
        
        driver.close();
        
    }
       
           
        
	}


