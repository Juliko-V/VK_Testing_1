package org.example;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class ParentVK {
    @BeforeEach
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize ="1920x1080";
    }
    @BeforeEach
    public void init(){

        setUp();
    }
    @AfterEach
    public void tearDown(){
        new VKPage().exit();
        Selenide.closeWebDriver();
    }
}
