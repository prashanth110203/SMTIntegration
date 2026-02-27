package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}