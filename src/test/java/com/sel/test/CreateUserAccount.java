/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sel.test;

import static com.github.dockerjava.transport.DomainSocket.get;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
/*import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author shahs
 */
public class CreateUserAccount {
    
    public CreateUserAccount() {
    }
    
    //@BeforeAll
    public static void setUpClass() {
    }
    
    //@AfterAll
    public static void tearDownClass() {
    }
    
    //@BeforeEach
    public void setUp() {
    }
    
    //@AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
   public void testCreateUser() throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
    driver.get("https://www.advantageonlineshopping.com/#/login");
    driver.findElement(By.id("registration_btnundefined")).click();
    driver.get("https://www.advantageonlineshopping.com/#/register");
    driver.findElement(By.name("usernameRegisterPage")).click();
    driver.findElement(By.name("usernameRegisterPage")).clear();
    driver.findElement(By.name("usernameRegisterPage")).sendKeys("shaurya");
    driver.findElement(By.name("passwordRegisterPage")).click();
    driver.findElement(By.name("passwordRegisterPage")).clear();
    driver.findElement(By.name("passwordRegisterPage")).sendKeys("Shah200!");
    driver.findElement(By.xpath("//div[@id='formCover']/div/div[2]/sec-view[2]/div/label")).click();
    driver.findElement(By.name("confirm_passwordRegisterPage")).clear();
    driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Shah200!");
    driver.findElement(By.name("emailRegisterPage")).click();
    driver.findElement(By.name("emailRegisterPage")).clear();
    driver.findElement(By.name("emailRegisterPage")).sendKeys("shauryashah@gmail.com");
    driver.findElement(By.name("first_nameRegisterPage")).click();
    driver.findElement(By.name("first_nameRegisterPage")).clear();
    driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Shaurya");
    driver.findElement(By.xpath("//div[@id='formCover']/div[2]/div/sec-view[2]/div/label")).click();
    driver.findElement(By.name("last_nameRegisterPage")).clear();
    driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Shah");
    driver.findElement(By.name("phone_numberRegisterPage")).click();
    driver.findElement(By.name("phone_numberRegisterPage")).clear();
    driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("8567654564");
    driver.findElement(By.name("countryListboxRegisterPage")).click();
    new Select(driver.findElement(By.name("countryListboxRegisterPage"))).selectByVisibleText("United States");
    driver.findElement(By.name("addressRegisterPage")).click();
    driver.findElement(By.name("addressRegisterPage")).clear();
    driver.findElement(By.name("addressRegisterPage")).sendKeys("37");
    driver.findElement(By.name("cityRegisterPage")).clear();
    driver.findElement(By.name("cityRegisterPage")).sendKeys("Aurora");
    driver.findElement(By.name("state_/_province_/_regionRegisterPage")).clear();
    driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Il");
    driver.findElement(By.name("postal_codeRegisterPage")).clear();
    driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("60504");
    driver.findElement(By.name("i_agree")).click();
    driver.findElement(By.id("register_btnundefined")).click();
    
    
  }
}