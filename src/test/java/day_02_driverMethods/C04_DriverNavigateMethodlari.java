package day_02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        // driver.get ile ayni islemi yapar ancak daha hizlidir

        driver.navigate().to("https://www.techproeducation.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

    }
}