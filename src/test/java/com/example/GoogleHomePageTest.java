package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTest {

    @Test
    public void testGoogleHomePage() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the Google homepage
        driver.get("https://www.google.com");

        // Verify the title contains "Google"
        String pageTitle = driver.getTitle();
        Assert.assertTrue("Page title should contain 'Google'", pageTitle.contains("Google"));

        // Check if the search box is displayed
        WebElement searchBox = driver.findElement(By.name("q"));
        Assert.assertTrue("Search box should be displayed", searchBox.isDisplayed());

        // Close the browser
        driver.quit();
    }
}

