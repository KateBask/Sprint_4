package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OrderPage extends BasePage {
    //Поле Имя
    private final By nameFaild = By.xpath(".//div[2]/div[1]/input");
    // Поле Фамилия
    private final By surnameFaild = By.xpath(".//div[2]/div[2]/input");
    // Поле Адрес
    private final By addressFaild = By.xpath(".//div[2]/div[3]/input");
    // Поле Станция метро
    protected final By subwayFaild = By.xpath(".//input[@class='select-search__input']");
    // Элемент выпадающего списка
    protected final By subwayStation1 = By.xpath("//div[@class='select-search__select']/ul/li[1]");
    protected final By subwayStation2 = By.xpath("//div[@class='select-search__select']/ul/li[23]");
    // Поле Номер телефона
    private final By phoneFaild = By.xpath(".//div[2]/div[5]/input");
    // Кнопка Далее
    private final By btnNext = By.xpath("//button[text() = 'Далее']");
    // Поле Когда привезти самокат
    private final By whenToDeliveryFaild = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    // Календарь
    protected final By deliveryDateCalendar1 = By.xpath("//div[@class='react-datepicker__month']/div[3]/div[last()]");
    protected final By deliveryDateCalendar2 = By.xpath("//div[@class='react-datepicker__month']/div[4]/div[1]");
    // Поле Срок аренды
    private final By tenancyFaild = By.className("Dropdown-placeholder");
    // Выпадающий список
    protected final By listTenancy1 = By.xpath("//div[@class='Dropdown-menu']/div[1]");
    protected final By listTenancy2 = By.xpath("//div[@class='Dropdown-menu']/div[last()]");
    // Чекбокс Черный
    protected final By checkboxBlack = By.id("black");
    // Чекбокс Серый
    protected final By checkboxGray = By.id("grey");
    // Поле комментарий
    private final By commentFaild = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка Заказать
    private final By btnOrder = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    // Кнопка Заказать ДА
    private final By orderYesBtn = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    //Поп-ап об успешном заказе
    private final By popUpOrderComplete = By.xpath("//div[@class='Order_ModalHeader__3FDaJ']");

    protected OrderPage(WebDriver webDriver) {
        super(webDriver);
    }

    //метод заполняет поле Имя
    public void setNameFaild(String name) {
        webDriver.findElement(nameFaild).sendKeys(name);
    }

    //метод заполняет поле Фамилия
    public void setSurnameFaild(String surmame) {
        webDriver.findElement(surnameFaild).sendKeys(surmame);
    }

    //метод заполняет поле Адрес
    public void setAddressFaild(String address) {
        webDriver.findElement(addressFaild).sendKeys(address);
    }

    // метод нажимает на поле Метро
    public void clickOfSubwayFaild() {
        webDriver.findElement(subwayFaild).click();
    }
    //метод выбирает станцию метро
    public void clickSubwayListField(By subway) {
        webDriver.findElement(subway).click();
    }
    // метод заполняет поле Телефон
    public void setPhoneFaild(String phone) {
        webDriver.findElement(phoneFaild).sendKeys(phone);
    }

    // метод нажимает на кнопку Далее
    public void clickOnBtnNext() {
        webDriver.findElement(btnNext).click();
    }

    // метод нажимает Когда привезти самокат
    public void clickOfWhenToDeliveryFaild() {
        webDriver.findElement(whenToDeliveryFaild).click();
    }
    //метод выбирает дату
    public void clickDeliveryDateCalendar(By date) {
        webDriver.findElement(date).click();
    }

    // метод нажимает на срок аренды
    public void clickTenancyFaild() {
        webDriver.findElement(tenancyFaild).click();
    }
    //метод выбирает срок аренды
    public void clickTenacyList(By time) {
        webDriver.findElement(time).click();
    }
    // метод выбирает цвет чекбокса
    public void chooseCheckbox(By checkbox) {
        webDriver.findElement(checkbox).click();
    }

    // метод заполняет поле Комментарий
    public void setCommentFaild(String comment) {
        webDriver.findElement(commentFaild).sendKeys(comment);
    }

    // метод нажимает на кнопку Заказать
    public void clickBtnOrder() {
        webDriver.findElement(btnOrder).click();
    }

    //метод нажимает на кнопку Заказать ДА
    public void clickOrderYesBtn() {
        webDriver.findElement(orderYesBtn).click();
    }
        // Отображение попапа об успешном заказе
        public boolean checkOrderCompletePopUpIsDisplayed () {
            new WebDriverWait(webDriver, 3)
                    .until(ExpectedConditions.visibilityOfElementLocated(popUpOrderComplete));
            return webDriver.findElement(popUpOrderComplete).isDisplayed();
        }
        //скролл к нужному полю
       public void scrollTo (By field){
            WebElement element = webDriver.findElement(field);
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        }

}
