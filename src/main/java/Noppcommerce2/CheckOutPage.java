package Noppcommerce2;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutPage extends Utils {

    private By _orderConfirmLink = By.linkText("Your order has been successfully processed!");

    public void orderHasBeenPlacedSuccessfully() {

        assertURL("checkout");

    }
}