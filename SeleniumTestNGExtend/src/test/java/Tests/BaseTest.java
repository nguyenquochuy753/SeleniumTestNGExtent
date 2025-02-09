package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    public static WebDriver driver;
    protected static ExtentReports extentReports;
    public static ExtentTest extentTest;
    public static ExtentReports extent = new ExtentReports();

    @BeforeTest
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../ExecImages/" + System.currentTimeMillis() + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile,Dest);
        return errflpath;
    }

    @AfterTest
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

