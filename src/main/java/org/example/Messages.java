package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

class Messages {
    private SelenideElement inputField = $x("//msg-input[@data-tsid='write_msg_input']");
    private SelenideElement sendButton = $x("//button[@data-l='t,sendButton']");
    private SelenideElement messageText = $x("//span[@data-tsid='message_text' and @data-ref='112195474058969103']");

    public void sendMessage(String message) {
        inputField.setValue(message);
        sendButton.pressEnter();
    }

    public String isMessageDisplayed(String message) {
        return messageText.getText();
    }
}

