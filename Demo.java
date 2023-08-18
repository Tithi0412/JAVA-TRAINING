package com.ey.gst.dao.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

 

public class Demo {

 

    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver", "path/to/AYAN PAL\\Downloads\\chromedriver_win32/chromedriver"); // Set the path to chromedriver executable

        System.setProperty("webdriver.edge.driver", "C:\\data\\db\\msedgedriver.exe");

        EdgeDriver driver = new EdgeDriver();

 

        try {
            driver.get("https://www.justdial.com/Kolkata/Marriage-Function-Halls/nct-10035861");

 

            // Wait for the page to load and JavaScript to execute
            Thread.sleep(5000); // Adjust the sleep time as needed

 

            WebElement markerElement = driver.findElement(By.id("like_dislike_rstlpge"));
            boolean stopScraping = false;

 

            while (!stopScraping) {
                WebElement titleElement =  driver.findElement(By.cssSelector("h2.resultbox_title"));
                String title = titleElement.getAttribute("title");
                System.out.println("Title: " + title);

 

                if (titleElement.equals(markerElement)) {
                    stopScraping = true;
                }

 

                // Scroll to the next element
                driver.executeScript("arguments[0].scrollIntoView();", titleElement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
             driver.quit();
        }
    }
}