package com.telran.ilcarro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindYourCar {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");
    }
    @Test
    public void findYourCar ()  {
       // wd.findElement(By.cssSelector("[name=\"address\"]")).click();
      //  wd.findElement(By.cssSelector("[name=\"address\"]")).clear();
       // wd.findElement(By.cssSelector("[name=\"address\"]")).sendKeys("Mazda");
      // wd.findElement(By.cssSelector("[name=\"startDate\"]")).click();
      //  wd.findElement(By.cssSelector("[name=\"startDate\"]")).clear();
      // wd.findElement(By.cssSelector("[name=\"startDate\"]")).sendKeys("2020.02.11");
       // wd.findElement(By.cssSelector("[name=\"startDate\"]")).click();

      //  Thread.sleep(2000);
       // wd.findElement(By.cssSelector("[name=\"endDate\"]")).click();
      //  wd.findElement(By.cssSelector("[name=\"endDate\"]")).clear();
       // wd.findElement(By.cssSelector("[name=\"endDate\"]")).sendKeys("2020.08.10");
       // wd.findElement(By.cssSelector("[href=\"/search\"]")).click();
        wd.findElement(By.className("[class=\"style_btn_call_action__2V2ZW\"]")).click();



    }
    @AfterMethod
    public void tearDown(){

    }
}
