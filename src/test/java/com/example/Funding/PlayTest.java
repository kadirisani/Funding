package com.example.Funding;

import org.fluentlenium.adapter.junit.FluentTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

public class PlayTest extends FluentTest {

    static {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "C:\\Development\\Funding\\src\\test\\drivers\\chromedriver.exe");
    }

    // Overrides the default driver
    @Override
    public WebDriver newWebDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-application-cache");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=600,5000");
        return new ChromeDriver(options);
    }

    @Test
    public void duck_duck_test() {
        goTo("https://duckduckgo.com");
        $("#search_form_input_homepage").fill().with("FluentLenium");
        $("#search_button_homepage").submit();
        assertThat(window().title()).contains("FluentLenium");
    }

    @Test
    public void title_of_bing_should_contain_search_query_name() {
        goTo("http://www.bing.com");
        $("#sb_form_q").fill().with("Teotti");
        $("#sb_form_go").submit();
        assertThat(window().title()).contains("Teotti");
    }
}
