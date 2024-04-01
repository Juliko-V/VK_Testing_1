package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class VKpage {
    public final SelenideElement Checking = $(By.xpath("//a[@data-l='t,userMain']"));
    public final SelenideElement Music = $(By.xpath("//div[@class='toolbar_music-container']"));
    public final SelenideElement Messages = $(By.xpath("//li[@data-l='t,messages']"));
    public final SelenideElement FirstExitButton = $(By.xpath("//a[@data-l='t,logout']"));
    public final SelenideElement SecondExitButton = $(By.xpath("//input[@data-l='t,logout']"));
    public final SelenideElement Panel = $(By.xpath("//span[@class='ucard-mini_cnt']"));
    public void ToClickMusicIcon(){
        Music.click();
    }
    public void ToClickMessages(){
        Messages.click();
    }
    public void exit(){
        Panel.click();
        FirstExitButton.isDisplayed();
        FirstExitButton.click();
        SecondExitButton.isDisplayed();
        SecondExitButton.click();

    }
}
