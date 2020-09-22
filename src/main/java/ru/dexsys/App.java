package ru.dexsys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) {
        WebDriver driver = new ChromeDriver();
        MainPage page = new MainPage(driver);
        page.clickToHomeTitle();
        page.exit();
    }
}
