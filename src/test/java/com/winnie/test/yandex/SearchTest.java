package com.winnie.test.yandex;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchTest {

    public static RemoteWebDriver wd;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }

    @Test
    public void testSearch() {
        wd.get("https://yandex.ru");


    }

    @AfterClass
    public static void endTest() {
        wd.close();
    }
}
