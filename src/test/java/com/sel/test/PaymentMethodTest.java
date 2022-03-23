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
public class PaymentMethodTest {
    
    public PaymentMethodTest() {
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
  
    public void testPaymentMethod() throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
    driver.get("https://www.advantageonlineshopping.com/#/orderPayment");
    driver.findElement(By.id("next_btn")).click();
    driver.findElement(By.name("masterCredit")).click();
    driver.findElement(By.xpath("//div[@id='paymentMethod']/div/div[4]/sec-form/div/sec-view/div/label")).click();
    driver.findElement(By.id("creditCard")).clear();
    driver.findElement(By.id("creditCard")).sendKeys("8765 4327 5342");
    driver.findElement(By.xpath("//div[@id='paymentMethod']/div/div[4]/sec-form/div/sec-view[2]/div/label")).click();
    driver.findElement(By.name("cvv_number")).clear();
    driver.findElement(By.name("cvv_number")).sendKeys("550");
    driver.findElement(By.name("cardholder_name")).click();
    driver.findElement(By.name("cardholder_name")).clear();
    driver.findElement(By.name("cardholder_name")).sendKeys("Shaurya Shah");
    driver.findElement(By.id("pay_now_btn_ManualPayment")).click();
  }



}

