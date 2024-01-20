package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    /**
     * Напишите автоматизированный тест, который выполнит следующие шаги:
     * 1. Открывает главную страницу Google.
     * 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
     * 3. В результатах поиска ищет ссылку на официальный сайт Selenium
     * (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
     * результатов поиска.
     */

    @Test
    void findSeleniumTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        List<WebElement> searchUrls = driver.findElements(By.cssSelector("div"));

        boolean isFound = false;
        for (WebElement elem : searchUrls) {
            if (elem.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        assertTrue(isFound);
        driver.quit();
    }

//    @Test
//    public void testAuthorization() throws InterruptedException {
//        driver.get("https://www.saucedemo.com/");
//        Thread.sleep(2000); // Let the user actually see something!
//        WebElement loginBox = driver.findElement(By.name("user-name"));
//        WebElement passwordBox = driver.findElement(By.name("password"));
//        WebElement loginButton = driver.findElement(By.name("login-button"));
//        loginBox.sendKeys("standard_user");
//        passwordBox.sendKeys("secret_sauce");
//        loginButton.submit();
//        Thread.sleep(2000); // Let the user actually see something!
//        WebElement productsLabel = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
//// WebElement productsLabel = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));
//        assertEquals("Products", productsLabel.getText());
//        driver.quit();
//    }

}
