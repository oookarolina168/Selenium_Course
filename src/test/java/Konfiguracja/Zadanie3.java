package Konfiguracja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().forward();
    }
}
