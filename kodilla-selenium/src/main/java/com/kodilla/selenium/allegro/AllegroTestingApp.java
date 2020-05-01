package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c://selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");


        while (!driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).isDisplayed()) {
        }
        driver.findElement(By.xpath(
                "//*[@data-box-name=\"allegro.rodoConsentModal\"]/div/div/div/button")).click();

        WebElement inputField = driver.findElement(By.xpath(
                "//input"));
        inputField.sendKeys("Mavic mini");


        WebElement selectElectronics = driver.findElement(
                By.xpath(("//select")));
        Select yearSelect = new Select(selectElectronics);
        yearSelect.selectByIndex(3);
    }
}
