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

    public WebElement findString(String name) {
        // Find a single element by a partial string
        return driver.findElement(By.partialLinkText(name));
    }

    public List<WebElement> findAllString(String name) {
        // Find all elements of a specified type
        return driver.findElements(By.partialLinkText(name));
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
        driver.get("https://duckduckgo.com");
    }
}