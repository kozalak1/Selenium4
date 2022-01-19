package day_03_WebElementsAndLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// 1. Bir class oluşturun: LoginTest

//2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//	a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

//	b. Sign in butonuna basin
        WebElement signInButton = driver.findElement(By.id("sign-in"));
        signInButton.click();

//	c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButon = driver.findElement(By.name("commit"));
//	d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//		i. Username : testtechproed@gmail.com
//		ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        //Thread.sleep(3000);
        signInButon.click();

//	e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        // bu task in amacı; dogru adrese girdiğimizi kanıtlayacak bir elementi alıp bize getirmesi
        WebElement girisYazisiElementi= driver.findElement(By.tagName("h1"));
        System.out.println(girisYazisiElementi.getText()); // Output : Welcome to Address Book

        String actualGirisYazisi = girisYazisiElementi.getText();
        String expectedGirisYazisi = "Welcome to Address Book";

        if (actualGirisYazisi.equals(expectedGirisYazisi)) {

            System.out.println("Sayfaya Giris Testi PASSED"); // Output :Sayfaya Giris Testi PASSED
        }
        else {
            System.out.println("Sayfaya Giris Testi FAILED");
        }

//	f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressWebElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutWebElementi = driver.findElement(By.linkText("Sign out"));
        System.out.println(adressWebElementi.isDisplayed()); // boolean sonuc döndürür; Output : true

        if (adressWebElementi.isDisplayed()) {
            System.out.println("Adres Web Elementi Görüntülenme Testi PASS"); // Adres Web Elementi Görüntülenme Testi PASS
        }
        else {
            System.out.println("Adres Web Elementi Görüntülenme Testi FAILED");
        }
//3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Sayfada : " + linklerListesi.size() + " adet link vardır"); // Sayfada : 3 adet link vardır

        driver.close();
    }
}
