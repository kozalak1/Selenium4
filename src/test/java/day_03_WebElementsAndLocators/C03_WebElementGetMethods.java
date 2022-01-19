package day_03_WebElementsAndLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementGetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.

        driver.navigate().to("http://a.testaddressbook.com"); // bu code da aynı işi görür : driver.get("http://a.testaddressbook.com");

        // signIn linkini locate edelim

        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        System.out.println("size :" + signInLinki.getSize());
        System.out.println("aria role :" + signInLinki.getAriaRole());
        System.out.println("accessible name :" + signInLinki.getAccessibleName());
        System.out.println("id attribute value :" + signInLinki.getAttribute("id"));
        System.out.println("location :" + signInLinki.getLocation());
        System.out.println("genislik :" + signInLinki.getRect().width);
        System.out.println("rengi :" + signInLinki.getCssValue("color"));
        //size :(64, 40)
        //aria role :link
        //accessible name :Sign in
        //id attribute value :sign-in
        //location :(74, 8)
        //genislik :64
        //rengi     :rgba(0, 0, 0, 0.5)


        driver.close();
    }


}
