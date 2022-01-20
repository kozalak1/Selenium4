package day_04_XPath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_X_Path_Text {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("delete butonu gorunuyor testi PASS"); // delete butonu gorunuyor testi PASS
        }
        else {

            System.out.println("delete butonu gorunuyor testi FAILED");
        }
        //4- Delete tusuna basin
        deleteButton.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addYazisiElementi = driver.findElement(By.xpath("//h3[text()='Add/Remove Elements']"));


        if (addYazisiElementi.isDisplayed()) {
            System.out.println("add yazisi  gorunuyor testi PASS"); // add yazisi  gorunuyor testi PASS
        }else System.out.println("add yazisi gorunuyor testi FAİLDE");

        driver.close();

    }
}
