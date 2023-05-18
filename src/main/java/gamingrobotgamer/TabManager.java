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

    }

    public void saveTabGroup(String[] urls) {

    }

    public void openTabGroup(String[] groupName, int index) {

    }

    public void closeTab(String url) {

    }

    public void closeTabGroup(String[] groupName) {

    }

    public void reload() {

    }

    public void reload(boolean spam) {
        if (spam) {
            while (true) {
                reload();
            }
        } else {
            reload();
        }
    }

    public void reload(int times) {
        for (int i = 0; i < times; i++) {
            reload();
        }
    }

    public static void main(String[] args) throws Exception {

    }
}