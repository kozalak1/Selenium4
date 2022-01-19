package day_01_;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class day_1_C01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // biz driver objesi olusturdugumuzda bos bir chrome browser acilir

        driver.get("https://www.amazon.com");
        // driver.get method'u driver'a gidecegi web adresini girmemizi saglar

        Thread.sleep(3000);

        driver.close();
        // driver'i kapatir
    }
}
