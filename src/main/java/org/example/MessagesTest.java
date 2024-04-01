package org.example;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessagesTest extends ParentVK {
    @Test
    public void testMessages(){
        open("https://ok.ru/messages/580154676023");
        Messages messages = new Messages();
        messages.sendMessage("Привет");
        String messageText = messages.isMessageDisplayed();
        assertEquals("Привет", messageText, "Сообщение 'Привет' не отображается корректно в чате");
    }
}


