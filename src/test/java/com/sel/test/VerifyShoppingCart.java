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

/**
 *
 * @author shahs
 */
public class VerifyShoppingCart {
    
    public VerifyShoppingCart() {
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
    public void testVerifyShoppingCartPage() throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   
    driver.get("https://www.advantageonlineshopping.com/#/shoppingCart");
    driver.findElement(By.linkText("EDIT")).click();
    driver.get("https://www.advantageonlineshopping.com/#/product/22?color=414141&quantity=1&pageState=edit&warranty=");
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[2]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3] | ]]
    driver.findElement(By.name("save_to_cart")).click();
    driver.get("https://www.advantageonlineshopping.com/#/shoppingCart");
    driver.findElement(By.id("toolTipCart")).click();
    driver.findElement(By.id("toolTipCart")).click();
    driver.findElement(By.xpath("//div[@id='shoppingCart']/table/tbody/tr[2]/td[6]/span/a")).click();
    driver.get("https://www.advantageonlineshopping.com/#/product/15?color=414141&quantity=2&pageState=edit&warranty=");
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.get("https://www.advantageonlineshopping.com/#/shoppingCart");
    driver.findElement(By.linkText("EDIT")).click();
    driver.get("https://www.advantageonlineshopping.com/#/product/22?color=414141&quantity=1&pageState=edit&warranty=");
    driver.findElement(By.xpath("//div[@id='productProperties']/div/div/span[3]")).click();
    driver.findElement(By.xpath("//div[@id='productProperties']/div[2]/e-sec-plus-minus/div/div[3]")).click();
    driver.findElement(By.name("save_to_cart")).click();
    driver.get("https://www.advantageonlineshopping.com/#/shoppingCart");
    driver.findElement(By.id("checkOutButton")).click();
  }
    }
