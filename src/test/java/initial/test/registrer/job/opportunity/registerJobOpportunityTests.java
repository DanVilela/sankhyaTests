package initial.test.registrer.job.opportunity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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

        //open sankhya website carreiras
        browser.get("https://sankhya.gupy.io/");

        //write and enter the job you want
        browser.findElement(By.id("job-search")).sendKeys("testes");
        browser.findElement(By.id("job-search-button")).click();
        browser.findElement(By.xpath("//*[@id=\"job-listing\"]/ul/li")).click();
    }
}
