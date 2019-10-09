package Noppcommerce2;

import org.openqa.selenium.By;

public class AppleMacBookPage extends HomePage {

    private By _emailAFriendLink = (By.xpath("//input[@value=\"Email a friend\"]"));

    public void clickOnEmailFriend(){
        clickElement(_emailAFriendLink);
    }

}
