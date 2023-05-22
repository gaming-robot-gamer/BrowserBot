package gamingrobotgamer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BrowserBot {
    static WebDriver driver = new ChromeDriver();

    public void find(String name, String elementType) {
        // Find a single element
        // return driver.findElement(By.elementType(name));
    }

    public void findAll(String name, String elementType) {
        // Find all elements of a specified type
        // return driver.findElements(By.elementType(name));
    }

    public void wait(int seconds) {
        // Wait the specified amount of seconds
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) throws Exception {
        // Open new tab
        driver.get("https://google.com");
    }
}