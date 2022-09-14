package ru.yandex.practikum;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    private final By btnCookieClose = By.xpath("//*[@id=\"rcc-confirm-button\"]");// кнопка куки
    protected final By question1 = By.xpath("//*[@id=\"accordion__heading-0\"]");//вопрос о важном 1

    protected final By question2 = By.xpath("//*[@id=\"accordion__heading-1\"]");//вопрос о важном 2
    protected final By question3 = By.xpath("//*[@id=\"accordion__heading-2\"]");//вопрос о важном 3
    protected final By question4 = By.xpath("//*[@id=\"accordion__heading-3\"]");//вопрос о важном 4
    protected final By question5 = By.xpath("//*[@id=\"accordion__heading-4\"]");//вопрос о важном 5
    protected final By question6 = By.xpath("//*[@id=\"accordion__heading-5\"]");//вопрос о важном 6
    protected final By question7 = By.xpath("//*[@id=\"accordion__heading-6\"]");//вопрос о важном 7
    protected final By question8 = By.xpath("//*[@id=\"accordion__heading-7\"]");//вопрос о важном 8
    protected final By btnOrder = By.xpath(".//button[text()='Заказать']"); //кнопка Заказать 1
    protected MainPage (WebDriver webDriver) {
        super(webDriver) ;
    }


    //метод открывает сайт
    public void open() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    // метод закрывает куки-окно
    public void clickOnBtnCookieClose() {
        webDriver.findElement(btnCookieClose).click();
    }

    //метод скролит до нужного элемента
    public void scrollTo(By field) {
        WebElement element = webDriver.findElement(field);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    // метод нажимает на вопрос
    public void clickOnQuestion(By field) {
        webDriver.findElement(field).click();
    }

    //метод проверяет отображение ответа
    public boolean checkRightAnswerIsDisplayed(By field) {
        new WebDriverWait(webDriver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(field));
        return webDriver.findElement(field).isDisplayed();
    }

    // метод нажимает на кнопку Заказать
    public void clickOnBtnOrder() {
        webDriver.findElement(btnOrder).click();
    }
}




