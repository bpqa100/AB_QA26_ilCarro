package com.telran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IlCarroTestRegistration {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @Test
    public void ilCarroTest() throws InterruptedException {
       //open reg Form
        wd.findElement(By.cssSelector("[href=\"/signup\"]")).click();
        wd.findElement(By.id("first_name")).click();
        wd.findElement(By.id("first_name")).clear();
        wd.findElement(By.id("first_name")).sendKeys("Alexey");

       // wd.findElement(By.cssSelector("[href='/search']")).click();
       // wd.findElement(By.cssSelector("[id=first_name]")).click();
        //wd.findElement(By.cssSelector("#first_name")).click();
        //wd.findElement(By.name("address")).click();
        wd.findElement(By.id("second_name")).click();
        wd.findElement(By.id("second_name")).clear();
        wd.findElement(By.id("second_name")).sendKeys("Hi");
        wd.findElement(By.id("email")).click();
        wd.findElement(By.id("email")).clear();
        wd.findElement(By.id("email")).sendKeys("hi@gmail.com");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Ab1234567");
        wd.findElement(By.id("check_policy")).click();
        Thread.sleep(2000);
        wd.findElement(By.cssSelector(".signup__fields [type='submit']")).click();



    }



    @AfterMethod
    public void tearDown(){

    }
}
