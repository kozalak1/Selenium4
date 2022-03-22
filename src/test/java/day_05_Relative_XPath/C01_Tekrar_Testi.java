package day_05_Relative_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar_Testi {
    public static void main(String[] args) {
        //Asagidaki testi text’leri kullanarak locate edin

        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.navigate().to("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualPageTitle  = driver.getTitle();
        if (actualPageTitle.contains("Spend less")) {
            System.out.println("sayfa baslıgının istenen ifadeyi içermesi testi PASS"); // sayfa baslıgının istenen ifadeyi içermesi testi PASS
            }
        else {
            System.out.println("sayfa baslıgının istenen ifadeyi içermesi testi FAILED");
        }

        //6- Gift Cards sekmesine basin
        WebElement giftCardElement = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        giftCardElement.click();
        //driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();  // ----bu sekilde de yazılabilir

        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']")).click();

        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();

        //9- Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("//button[@value='25.00']")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement fiyatElementi=driver.findElement(By.xpath("//span[@class='a-color-price a-text-bold']"));
        String expectedFiyat="$25.00";
        String actualFiyat=fiyatElementi.getText();

        if (expectedFiyat.equals(actualFiyat)){
            System.out.println("Fiyat testi PASSED"); // Fiyat testi PASSED
        }else {
            System.out.println("Fiyat testi FAILED");
        }
        //10-Sayfayi kapatin
        driver.close();

    }
}
