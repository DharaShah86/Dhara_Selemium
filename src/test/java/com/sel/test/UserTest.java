/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author shahs
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
  public void testUser() throws Exception {
    // public void hello() {}
     WebDriverManager.chromedriver().setup();
      WebDriver driver =new ChromeDriver();
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Thread.sleep(10000);
    driver.get("https://nlilaramani.github.io/frame.html");
    driver.switchTo().frame(0);
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.id("fname")).click();
    driver.findElement(By.id("fname")).clear();
    driver.findElement(By.id("fname")).sendKeys("Dhara");
    driver.findElement(By.name("lname")).click();
    driver.findElement(By.name("lname")).clear();
    driver.findElement(By.name("lname")).sendKeys("Shah");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("shah.dhara");
    driver.findElement(By.xpath("//form[@action='success.html']")).click();
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("Shah200!");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Educational Qualification:'])[1]/following::select[1]")).click();
    new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Educational Qualification:'])[1]/following::select[1]"))).selectByVisibleText("Masters");
    //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Educational Qualification:'])[1]/following::select[1]")).SelectByVisibleText("Masters");
  
  }  
    
    
    
    
}
