package ru.yandex.practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;

import java.util.concurrent.TimeUnit;

public abstract class BaseUITest {
    protected static WebDriver webDriver = new ChromeDriver(); //Chrome
    // protected static WebDriver webDriver = new FirefoxDriver(); //Firefox

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @After
    public void clearData(){
        webDriver.manage().deleteAllCookies();
        ((WebStorage)webDriver).getSessionStorage().clear();
        ((WebStorage)webDriver).getLocalStorage().clear();
    }
    @AfterClass
    public static void tearDown() {
        webDriver.quit();
    }
}
