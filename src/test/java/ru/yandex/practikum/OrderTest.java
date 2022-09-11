package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;

public class OrderTest extends BaseUITest {
    @Test
    public void orderShouldBeDone(){
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
        orderPage.setcommentFaild("Не звонить");
        orderPage.clickBtnOrder();
        orderPage.clickOrderYesBtn();
        boolean isDisplayed = orderPage.checkOrderCompletePopUpIsDisplayed();
        Assert.assertTrue("Окно подтверждения заказа не выбрано", isDisplayed);
    }
    }

