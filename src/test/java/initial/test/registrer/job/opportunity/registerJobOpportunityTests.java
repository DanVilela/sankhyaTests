package initial.test.registrer.job.opportunity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Automated tests for registering for vacancies on the Sankhya website")
public class registerJobOpportunityTests {
    @Test
    @DisplayName("Open gupy Sankhya jobs opportunity")
    public void openAndSubscribeJobOpportunity() {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver browser = new ChromeDriver();

        //open sankhya website
        browser.get("https://www.sankhya.com.br/carreira/");
    }
}
