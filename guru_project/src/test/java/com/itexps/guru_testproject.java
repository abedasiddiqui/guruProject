/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Siraj Siddiqui
 */
public class guru_testproject {
    
    public guru_testproject() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void guru_project() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data1\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.demo.guru99.com/V4/");
    driver.findElement(By.name("uid")).sendKeys("mngr267068");
    driver.findElement(By.name("password")).sendKeys("nezazyt");
    driver.findElement(By.name("btnLogin")).click();
    driver.close();
}
    // public void hello() {}
}
