package A_Practice_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q_01 {
    /*
            Question1
            1.https://www.youtube.com sayfasına gidin
            2.Title i consolda yazdirin
            3.Title “YouTube” a eşitse “correct title” yazdirin değilse “incorrect title yzdirin”
            4.Sayfayi kapatin
            5.Tum sayfalari kapatin
            6.Consola “Test completed” yazdirin

             */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.youtube.com");
        System.out.println(driver.getTitle()); // YouTube

        String actualTitle=driver.getTitle();
        String expectedTitle="YouTube";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("correct title"); // correct title
        }
        else {
            System.out.println("incorrect title");
        }
        driver.close();
        driver.quit();
        System.out.println("Test completed"); // Test completed

    }





}
