package day_04_XPath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_X_Path {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()) {
            System.out.println("delete butonu gorunuyor testi PASS");
        }
        else {

            System.out.println("delete butonu gorunuyor testi FAILED");
        }
        //4- Delete tusuna basin
        deleteButton.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addYazisiElementi = driver.findElement(By.xpath("//h3")); // istersek xPath'de tek bileşenle de aratabiliriz
        WebElement addYazisiElementi2 = driver.findElement(By.tagName("h3")); // tagName den de ulaşabiliriz

        if (addYazisiElementi.isDisplayed()) {
            System.out.println("add yazisi  gorunuyor testi PASS");
        }else System.out.println("add yazisi gorunuyor testi FAILED");

        driver.close();

    }
}
