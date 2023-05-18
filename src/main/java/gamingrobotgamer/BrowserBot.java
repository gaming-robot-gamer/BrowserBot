package gamingrobotgamer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import java.util.Scanner;

public class BrowserBot {
    // Find a Single Element
    public void find(String name, String type) {
        return driver.findElement(By.type(name));
    }

    // Find all elements
    public void findAll(String name, String type) {
        return driver.findElements(By.type(name));
    }

    // Main
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        // Open new tab
        driver.get("https://google.com");
    }
}