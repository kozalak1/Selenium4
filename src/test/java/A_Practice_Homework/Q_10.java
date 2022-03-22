package A_Practice_Homework;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q_10 {


        /*
          // ...Exercise5...
          // Navigate to website  https://testpages.herokuapp.com/styled/index.html
          // Under the  ORIGINAL CONTENTS
          // click on Alerts
          // print the URL
          // navigate back
          // print the URL
          // Click on Basic Ajax
          // print the URL
          // enter value-> 20 and Enter
          // and then verify Submitted Values is displayed open page
          // close driver

           */
        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            // Navigate to website  https://testpages.herokuapp.com/styled/index.html
            driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

            // Under the  ORIGINAL CONTENTS
            // click on Alerts
            WebElement alert=driver.findElement(By.id("alerts"));
            alert.click();

            // print the URL
            String alertUrl= driver.getCurrentUrl();
            System.out.println("alertUrl = " + alertUrl);

            // navigate back
            driver.navigate().back();

            // print the URL
            String homeUrl=driver.getCurrentUrl();
            System.out.println("homeUrl = " + homeUrl);

            // Click on Basic Ajax
            WebElement basicAjax=driver.findElement(By.id("basicajax"));
            basicAjax.click();

            // print the URL
            String basicAjaxUrl=driver.getCurrentUrl();
            System.out.println("basicAjaxUrl = " + basicAjaxUrl);

            // enter value-> 20 and Enter
            Thread.sleep(1500);
            driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);

            // and then verify Submitted Values is displayed open page
            boolean verify=driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed();
            System.out.println( verify ? "Verify test PASS" : "Verify test FAİLED" );

            // close driver
            driver.close();
        }
    }
}
