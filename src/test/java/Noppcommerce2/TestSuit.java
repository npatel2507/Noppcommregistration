package Noppcommerce2;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailAFriendResultsPage emailAFriendResultsPage = new EmailAFriendResultsPage();
    UnRegisteredEmailAFriendPage unRegisteredEmailAFriendPage = new UnRegisteredEmailAFriendPage();
    BooksPage booksPage = new BooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ShoppingCartResult shoppingCartResult = new ShoppingCartResult();
    CheckOutShippingAddressPage checkOutShippingAddressPage = new CheckOutShippingAddressPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();

    @Test

    public void userShouldBeAbleToRegisterSuccessfully(){

        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.userIsSuccessfullyRegistered();
    }

    @Test

    public void registeredUserShouldBeAbleToReferAProductToAFriend(){
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.userIsSuccessfullyRegistered();
        homepage.clickOnNoppCommereceLogo();
        homepage.clickOnAppleMacBookProduct();
        appleMacBookPage.clickOnEmailFriend();
        emailAFriendPage.allDetailstoEmailAFriend();
        emailAFriendResultsPage.userIsAbleToReferAProductToFriend();
    }
    @Test

    public void unregisterdUsershouldNotAbleToReferProductToAFriend(){

        homepage.clickOnAppleMacBookProduct();
        appleMacBookPage.clickOnEmailFriend();
        unRegisteredEmailAFriendPage.allDetailsToEmailFriendForUnregistered();
        unRegisteredEmailAFriendPage.referAProductToFriendFails();
    }
    @Test

    public void registeredUsershouldBeAbleToBuyProductSuccessfully(){

        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.userIsSuccessfullyRegistered();
        homepage.clickOnNoppCommereceLogo();
        homepage.clickOnBooks();
        booksPage.userIsOnBooksPage();
        booksPage.clickOnprideAndPrejudiceAddToCartButton();
        booksPage.clickShoppingCartButton();
        shoppingCartPage.checkOnTheShoppingCartPage();
        shoppingCartPage.clickOnCheckoutButton();
        checkOutShippingAddressPage.checkOutAssertion();
        checkOutShippingAddressPage.checkOutShippingAddressDetails();
        checkOutShippingAddressPage.clickContinueOnShippingMethod();
        checkOutShippingAddressPage.clickOnCreditCard();
        checkOutShippingAddressPage.paymentInformationDetails();
        checkOutShippingAddressPage.clickOnCheckOutConfirmation();
        checkOutPage.orderHasBeenPlacedSuccessfully();
    }
    @Test
    public void guestUserShouldBeAbleToCheckoutAsGuest(){

        homepage.clickOnBooks();
        booksPage.userIsOnBooksPage();
        booksPage.clickOnprideAndPrejudiceAddToCartButton();
        booksPage.clickShoppingCartButton();
        shoppingCartPage.checkOnTheShoppingCartPage();
        shoppingCartPage.clickOnCheckoutButton();
        checkOutAsGuestPage.guestCheckoutPageAssertion();
        checkOutAsGuestPage.clickOnCheckOutAsAGuest();
        checkOutShippingAddressPage.checkOutAssertion();
        checkOutAsGuestPage.checkOutPersonalDetail();
        checkOutShippingAddressPage.checkOutShippingAddressDetails();
        checkOutShippingAddressPage.clickContinueOnShippingMethod();
        checkOutShippingAddressPage.clickOnCreditCard();
        checkOutShippingAddressPage.paymentInformationDetails();
        checkOutShippingAddressPage.clickOnCheckOutConfirmation();
        checkOutPage.orderHasBeenPlacedSuccessfully();


    }



}


