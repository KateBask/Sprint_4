package ru.yandex.practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseUITest {
    protected WebDriver webDriver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver webDriver;
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");

    }
    @After
    public void tearDown() {
        webDriver.quit();
    }
}
