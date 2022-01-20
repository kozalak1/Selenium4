package day_04_XPath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class C04_Css_Selector {
    // 1 ) Bir class oluşturun : Locators_css
    //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //	a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //	b. Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("input[id='session_email']")); // xpath : //input[@id='session_email']
                                                                    // "input#session_email" bu kod id aratacaksak daha pratik
        //	c. Locate password textbox

        WebElement passwordTextBox= driver.findElement(By.cssSelector("input[id='session_password']")); // xPath : //input[@id='session_password']

        //	d. Locate signin button

        WebElement signInButonu=driver.findElement(By.cssSelector("input[name='commit']"));// xpath //input[@name='commit']

        //	e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //		i. Username : testtechproed@gmail.com
        //		ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.submit();
        driver.close();

        //NOT: cssSelector kullanarak elementleri locate ediniz.

    }
}
