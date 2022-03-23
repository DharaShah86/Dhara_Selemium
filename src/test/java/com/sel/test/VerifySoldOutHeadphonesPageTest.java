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
public class VerifySoldOutHeadphonesPageTest {
    
    public VerifySoldOutHeadphonesPageTest() {
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
     public void testVerifySoldOutHeadphonePage() throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.advantageonlineshopping.com/#/category/Headphone/2");
     driver.findElement(By.linkText("Bose SoundLink Around-ear Wireless Headphones II")).click();
     driver.get("https://www.advantageonlineshopping.com/#/product/13");
     driver.findElement(By.xpath("//div[@id='Description']/h2/span")).click();
     driver.findElement(By.xpath("//div[@id='productProperties']/div/e-sec-plus-minus")).click();
     driver.findElement(By.name("save_to_cart")).click();
     }
}

