package Tests;

import Pages.HomePage;
import Pages.ProductsPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class ProductsTest extends BaseTest{

    @Test(priority = 1)
    public void validateNavigationToOnlineProducts() throws InterruptedException {
        HomePage.click_hamburger_menu();
        HomePage.click_onlineProducts_link();
    }

    @Test(priority = 2)
    void validateTitle() throws IOException {
        extentTest = extent.createTest("Validate Shoe Title On Products Page", "This test validates that the different shoetypes are correct on Products Page");
        ProductsPage.formalShoes_getTitle();
        ProductsPage.sportShoes_getTitle();
        ProductsPage.sneakers_getTitle();
        extent.flush();
    }

    @Test(priority = 3)
    void validateFirstFormalShoes() throws InterruptedException {
        extentTest = extent.createTest("Validate First Formal Shoe Name", "This test validates that the first formal shoe name on products page");
        ProductsPage.formalShoes_firstShoe_verify();
        extent.flush();
    }

    @Test(priority = 4)
    void validateFirstSportsShoes() throws InterruptedException {
        extentTest = extent.createTest("Validate First Sports Shoe Name", "This test validates that the first sports shoe name on products page");
        ProductsPage.sportShoes_firstShoe_verify();
        extent.flush();
    }

    @Test(priority = 5)
    void validateFirstSneakers() throws InterruptedException {
        extentTest = extent.createTest("Validate First Sneaker Name", "This test validates that the first sneaker name on products page");
        ProductsPage.sneakers_firstShoe_verify();
        extent.flush();
    }

}
