package day_03_WebElementsAndLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AgainAndAgain {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.navigate().to("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Youtube title test : PASSED");
        }
        else {
            System.out.println("Youtube title test : FAILED \n Mevcut sayfa basligi :" + actualTitle); // FAILED
        }
                // Output :     Youtube title test : FAILED
                //              Mevcut sayfa basligi :YouTube

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa actual URL'yi yazdırın.

        String ActualUrl = driver.getCurrentUrl();
        if (ActualUrl.contains("youtube")) {
            System.out.println("Youtube URL test PASS"); // Output : Youtube URL test PASS
            }
        else {
            System.out.println("Youtube URL test FAILED \n ActualUrl :" + ActualUrl );
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.

        String actualSayfaBasligi = driver.getTitle();
        if (actualSayfaBasligi.contains("Amazon")) {
            System.out.println("Amazon Page Title Test PASS"); // Output : Amazon Page Title Test PASS
        }

        else {
            System.out.println("Page Title Test FAILED \n Actual Page Title :" + actualSayfaBasligi);
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın,
        // degilse doğru URL'yi yazdırın

        String mevcutUrl = driver.getCurrentUrl();
        if (mevcutUrl.equals("https://www.amazon.com/")) {
            System.out.println("Amazon Url Test PASS"); // Output : Amazon Url Test PASS
        }

        else {
            System.out.println("Amazon Url Test FAILED \n Actual Url :" + mevcutUrl);
        }
        //11.Sayfayi kapatin
        driver.close();
    }
}
