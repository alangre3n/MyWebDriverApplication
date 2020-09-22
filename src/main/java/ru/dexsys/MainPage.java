package ru.dexsys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private final WebDriver webDriver;
    private final WebDriverWait driverWait;
    private final String URL = "https://www.guru99.com/live-testing-project.html";

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        webDriver.get(URL);
        driverWait = new WebDriverWait(webDriver,30);
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//span[text()='Home']")
    private WebElement home;

    public void clickToHomeTitle () {
        home.click();
    }

    public void exit() {
        webDriver.close();
    }
}
