package Pages;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;

import static Tests.BaseTest.*;

public class ProductsPage {

    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportShoes_xpath = "/html/body/div[3]/center/h2";
    public static String sneakers_xpath = "/html/body/div[4]/center/h2";
    public static String formalShoesDrpDown_xpath = "/html/body/div[2]/center/div/i[1]";
    public static String sportShoesDrpDown_xpath = "/html/body/div[3]/center/div/i[1]";
    public static String sneakersDrpDown_xpath = "/html/body/div[4]/center/div/i[1]";
    public static String formalShoes_firstShoeName = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportShoes_firstShoeName = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String sneakers_firstShoeName = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

    public static void formalShoes_getTitle() throws IOException {
        String expectedTitle = "Formal Shoes";
        String actualTitle = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        if(actualTitle.equals(expectedTitle)){
            extentTest.log(Status.PASS,"Test passed for verification of Formal Shoes title");
            extentTest.log(Status.PASS,extentTest.addScreenCaptureFromPath(capture(driver)) + "Test Passed");
        }else{
            extentTest.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public static void formalShoes_firstShoe_verify() throws InterruptedException {
        String expectedFirstFormalShoe = "Classic Cheltenham";
        Thread.sleep(1000);
        driver.findElement(By.xpath(formalShoesDrpDown_xpath)).click();
        String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_firstShoeName)).getText().trim();
        Assert.assertEquals(actualFirstFormalShoe,expectedFirstFormalShoe);
    }

    public static void sportShoes_getTitle() throws IOException {
        String expectedTitle = "Sports Shoes";
        String actualTitle = driver.findElement(By.xpath(sportShoes_xpath)).getText();
        if(actualTitle.equals(expectedTitle)){
            extentTest.log(Status.PASS,"Test passed for verification of Sports Shoes title");
            extentTest.log(Status.PASS,extentTest.addScreenCaptureFromPath(capture(driver)) + "Test Passed");
        }else{
            extentTest.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public static void sportShoes_firstShoe_verify() throws InterruptedException {
        Thread.sleep(1000);
        String expectedFirstSportsShoe = "Ultimate";
        driver.findElement(By.xpath(sportShoesDrpDown_xpath)).click();
        String actualFirstSportsShoe = driver.findElement(By.xpath(sportShoes_firstShoeName)).getText().trim();
        Assert.assertEquals(actualFirstSportsShoe,expectedFirstSportsShoe);
    }

    public static void sneakers_getTitle() throws IOException {
        String expectedTitle = "Sneakers";
        String actualTitle = driver.findElement(By.xpath(sneakers_xpath)).getText();
        if(actualTitle.equals(expectedTitle)){
            extentTest.log(Status.PASS,"Test passed for verification of Sneakers title");
            extentTest.log(Status.PASS,extentTest.addScreenCaptureFromPath(capture(driver)) + "Test Passed");
        }else{
            extentTest.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        }
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public static void sneakers_firstShoe_verify() throws InterruptedException {
        Thread.sleep(1000);
        String expectedFirstSneakers = "Archivo";
        driver.findElement(By.xpath(sneakersDrpDown_xpath)).click();
        String actualFirstSneakers = driver.findElement(By.xpath(sneakers_firstShoeName)).getText().trim();
        Assert.assertEquals(actualFirstSneakers,expectedFirstSneakers);
    }

}
