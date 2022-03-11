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
public class HotMailCheck {
    
    
    
    
    public HotMailCheck() {
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
     public void testLogin2() throws Exception{
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
     
    driver.get("https://www.google.com/search?q=www.hotmail.com&rlz=1C1CHBF_enUS864US864&oq=&aqs=chrome.2.35i39i362l8.160919j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/a/h3")).click();
    driver.get("https://outlook.live.com/owa/");
    driver.findElement(By.linkText("Sign in")).click();
    driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1645742151&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d216f6039-d5e9-c349-a5d7-936f0708339c&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
    driver.findElement(By.id("i0116")).clear();
    driver.findElement(By.id("i0116")).sendKeys("SelSample@hotmail.com");
    driver.findElement(By.id("idSIButton9")).click();
    
    driver.findElement(By.id("i0118")).clear();
    driver.findElement(By.id("i0118")).sendKeys("Sel@123!");
    driver.findElement(By.id("idSIButton9")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://login.live.com/ppsecure/post.srf?wa=wsignin1.0&rpsnv=13&ct=1645742151&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d216f6039-d5e9-c349-a5d7-936f0708339c&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015&contextid=8C19C07BFA2128C8&bk=1645742151&uaid=90e17491f9a342d8a6c43a7abbf467b3&pid=0");
    driver.findElement(By.id("KmsiCheckboxField")).click();
    driver.findElement(By.id("idSIButton9")).click();
    driver.get("https://outlook.live.com/mail/0/");
    driver.findElement(By.xpath("//img[@alt='SS']")).click();
    driver.findElement(By.id("mectrl_body_signOut")).click();
    driver.get("https://outlook.live.com/owa/logoff.owa");
    driver.get("https://login.live.com/logout.srf?ct=1645742193&rver=7.0.6737.0&id=292841&ru=https:%2F%2Foutlook.live.com%2Fowa%2Fcsignout.aspx%3F%253f%253fumkt%3Den-US%26exch%3D1%26RpsCsrfState%3D216f6039-d5e9-c349-a5d7-936f0708339c");
    driver.get("https://www.msn.com/?ocid=mailsignout&pc=U591");
  }

   }
