package com.telran.ilcarro.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
    WebDriver wd;
  @BeforeMethod
public void setUp(){
      wd= new ChromeDriver();
      wd.get("https://google.com");
  }
    @Test
public void testRegistration(){

    }

    @AfterMethod
    public  void tearDown(){

    }
}
