package org.selenide.examples.google.selenide_page_object;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class GooglePage {
    @Test
    public void testSelenide() {
        System.setProperty("selenide.browser", "Chrome");
        open("https;//www.google.com.ua");
        $(By.name("q")).setValue("main academy").pressEnter();
    }
}