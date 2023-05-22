package gamingrobotgamer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import java.util.Scanner;

public class TabManager {
    WebDriver driver = new ChromeDriver();

    public void openTab(String url) {
        // Open a specified tab
    }

    public void saveTabGroup(String[] urls) {
        // Save a group of tabs to a json object
    }

    public void openTabGroup(String[] groupName, int index) {
        // Open a group of tabs from a json object
    }

    public void closeTab(String url) {
        // Close a specified tab
    }

    public void closeTabGroup(String[] groupName) {
        // Close a group of tabs from a json object
    }

    public void reload() {
        // Reload the current tab
    }

    public void reload(boolean spam) {
        // Reload the current tab indefinitely
        if (spam) {
            while (true) {
                reload();
            }
        } else {
            reload();
        }
    }

    public void reload(int times) {
        // Reload the current tab a specified amount of times
        for (int i = 0; i < times; i++) {
            reload();
        }
    }

    public static void main(String[] args) throws Exception {

    }
}