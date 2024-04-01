package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ForLogin {
    private SelenideElement login = $(By.xpath("//input[@id='field_email']"));
    private SelenideElement PasswordField = $(By.xpath("//input[@id='field_password']"));
    private SelenideElement button = $(By.xpath("//input[@value='Войти в Одноклассники']"));

    public ForLogin(String url) {
        open(url);
        login.shouldBe(visible);
        PasswordField.shouldBe(visible);
        button.shouldBe(visible);
    }

    public void enterLogin(String loginValue) {
        login.setValue(loginValue);
    }
    public void enterPassword(String password) {

        PasswordField.setValue(password);
    }

    public void clickLoginButton() {
        button.click();
    }
}
