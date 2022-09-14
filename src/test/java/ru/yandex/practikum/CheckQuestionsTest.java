package ru.yandex.practikum;

import org.junit.Assert;
import org.junit.Test;


public class CheckQuestionsTest extends BaseUITest {

    @Test
    public void question1ShouldOpenAnswer1() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question1);
        mainPage.clickOnQuestion(mainPage.question1);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question1);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question2ShouldOpenAnswer2() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question2);
        mainPage.clickOnQuestion(mainPage.question2);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question2);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question3ShouldOpenAnswer3() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question3);
        mainPage.clickOnQuestion(mainPage.question3);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question3);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question4ShouldOpenAnswer4() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question4);
        mainPage.clickOnQuestion(mainPage.question4);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question4);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question5ShouldOpenAnswer5() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question5);
        mainPage.clickOnQuestion(mainPage.question5);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question5);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question6ShouldOpenAnswer6() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question6);
        mainPage.clickOnQuestion(mainPage.question6);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question6);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question7ShouldOpenAnswer7() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question7);
        mainPage.clickOnQuestion(mainPage.question7);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question7);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }

    @Test
    public void question8ShouldOpenAnswer8() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOnBtnCookieClose();
        mainPage.scrollTo(mainPage.question8);
        mainPage.clickOnQuestion(mainPage.question8);
        boolean isDisplayed = mainPage.checkRightAnswerIsDisplayed(mainPage.question8);
        Assert.assertTrue("Не отображается правильный ответ", isDisplayed);
    }
}
