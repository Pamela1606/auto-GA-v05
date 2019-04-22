package org.umssdiplo.automationv01.core.managepage.webadidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {

    @FindBy(id = "home-hombre")
    private WebElement homeOption;

    @FindBy(id = "futbol")
    private WebElement futbolOption;


    public void navigateToHome() {
        CommonEvents.clickButton(homeOption);
    }

    public void navigateToShoes() {
        CommonEvents.clickButton(futbolOption);
    }
}
