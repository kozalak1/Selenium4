package A_Practice_Homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class Q_07 {


        // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        //fill the firstname
        //fill the firstname
        //check the gender
        //check the experience
        //fill the date
        //choose your profession -> Automation Tester
        //choose your tool -> Selenium Webdriver
        //choose your continent -> Antartica
        //choose your command  -> Browser Commands
        //click submit button
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // go to url : https://www.techlistic.com/p/selenium-practice-form.html

            driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@class='cookie-choices-button'][2]")).click();
            driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Oguzhan");
            driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yucedal");
            driver.findElement(By.xpath("//input[@id='sex-0']")).click();
            driver.findElement(By.xpath("//input[@id='exp-6']")).click();
            driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("15.05.2030");
            driver.findElement(By.xpath("//input[@id='profession-1']")).click();
            driver.findElement(By.xpath("//input[@id='tool-2']")).click();
            driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Africa");
            driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();


        }
    }
}
