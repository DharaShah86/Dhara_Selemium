/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author shahs
 */
public class SampleTest2 {
    
    public SampleTest2() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach //Write 4 lines to prevent repeatation like webdriver/webdriver/driver maximize/implicitily for timr
    public void setUp() {
    }
    
    @AfterEach  //driver.close and drive quit
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testNavigation(){
        WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("http://www.google.com");
          driver.navigate().to("http://www.ibm.com");
          driver.navigate().back();
          driver.navigate().forward();
          driver.navigate().refresh();
          driver.quit();

}
}