package A_Practice_Homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q_08 {



        // ...Exercise5...
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        // Click on  Calculate under Micro Apps
        //    Type any number in the first input
        //    Type any number in the second input
        // Click on Calculate
        // Get the result
        // Print the result

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
            driver.findElement(By.id("calculatetest")).click();
            WebElement firstBox = driver.findElement(By.id("number1"));
            WebElement secondBox = driver.findElement(By.id("number2"));
            firstBox.sendKeys("25");
            secondBox.sendKeys("60");
            WebElement calculate = driver.findElement(By.id("calculate"));
            calculate.click();
            String answer = driver.findElement(By.id("answer")).getText();
            System.out.println("answer = " + answer);


        }
    }


}
