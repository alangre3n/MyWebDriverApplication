package ru.dexsys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //System.setProperty("webdriver.chrome.driver", "C:/Program Files/Web Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        MainPage page = new MainPage(driver);
        page.clickToHomeTitle();
        page.exit();
    }
}
