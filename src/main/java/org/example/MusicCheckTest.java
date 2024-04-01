package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MusicCheckTest {
    public final SelenideElement Music = $(By.xpath("//div[@class='toolbar_music-container']"));

    public void playFirstTrack() {
        Music.click();
    }
    public void verifyTrackPlaying() {
        Music.should(Condition.disappear);
    }
}
