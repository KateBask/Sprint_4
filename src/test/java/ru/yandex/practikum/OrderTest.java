package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest extends BaseUITest {

    @Test
    public void orderShouldBeDone() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.clickOnBtnOrder();

        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.setNameFaild("Катя");
        orderPage.setSurnameFaild("Катина");
        orderPage.setAddressFaild("ул.Красивая, д.5");
        orderPage.clickOfSubwayFaild();
        orderPage.clickSubwayListField(orderPage.subwayStation1);
        orderPage.setPhoneFaild("+79633453546");
        orderPage.clickOnBtnNext();
        orderPage.clickOfWhenToDeliveryFaild();
        orderPage.clickDeliveryDateCalendar(orderPage.deliveryDateCalendar1);
        orderPage.clickTenancyFaild();
        orderPage.clickTenacyList(orderPage.listTenancy1);
        orderPage.chooseCheckbox(orderPage.checkboxBlack);
        orderPage.setCommentFaild("Не звонить");
        orderPage.clickBtnOrder();
        orderPage.clickOrderYesBtn();
        boolean isDisplayed = orderPage.checkOrderCompletePopUpIsDisplayed();
        Assert.assertTrue("Окно подтверждения заказа не выбрано", isDisplayed);
    }

    @Test
    public void orderShouldBeDone2() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.clickOnBtnOrder();

        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.setNameFaild("Оля");
        orderPage.setSurnameFaild("Олина");
        orderPage.setAddressFaild("ул.Нарядная, 11");
        orderPage.clickOfSubwayFaild();
        orderPage.clickSubwayListField(orderPage.subwayStation2);
        orderPage.setPhoneFaild("89213456789");
        orderPage.clickOnBtnNext();
        orderPage.clickOfWhenToDeliveryFaild();
        orderPage.clickDeliveryDateCalendar(orderPage.deliveryDateCalendar2);
        orderPage.clickTenancyFaild();
        orderPage.clickTenacyList(orderPage.listTenancy2);
        orderPage.chooseCheckbox(orderPage.checkboxGray);
        orderPage.setCommentFaild("Жду");
        orderPage.clickBtnOrder();
        orderPage.clickOrderYesBtn();
        boolean isDisplayed = orderPage.checkOrderCompletePopUpIsDisplayed();
        Assert.assertTrue("Окно подтверждения заказа не выбрано", isDisplayed);
    }
    }

