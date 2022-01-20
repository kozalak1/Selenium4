package day_04_XPath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar_Testi {
    // 1. Bir class oluşturun : AmazonSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //	a.google web sayfasına gidin. https://www. amazon.com/
    //	b. Search(ara) “city bike”
    //	c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
    //	d. “Shopping” e tıklayın.
    //	e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         // 1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //	a.Amazon web sayfasına gidin. https://www.amazon.com/
            driver.get("https://www.amazon.com/");

        //	b. Search(ara) “city bike”
       WebElement searchElement=driver.findElement(By.id("twotabsearchtextbox"));
       searchElement.sendKeys("city bike" + Keys.ENTER);
       // searchElement.submit(); enter yerine geçer


        //	c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        // WebElement sonucYazisiElementi = driver.findElement(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));

        System.out.println(sonucYazisiElementi.getText()); // 1-16 of 120 results for "city bike"

        //	e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebElement ilkUrunResmi= driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();

        // sadece click yapmak gibi basit bir islemde kullanacagimiz webelementler icin
        // variable olusturmadan direk locate edip, istedigimiz islemi yapabiliriz

        driver.findElement(By.className("s-image")).click();


    }

}
