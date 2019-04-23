package org.umssdiplo.automationv01.core.managepage.webadidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Futbol;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {

    @FindBy(linkText = "HOMBRE")
    private WebElement linkHombre;

    @FindBy(xpath = " //li/a[contains(text(),'Fútbol')]")
    private WebElement linkFutbol;

    public Home hoverMenLink() {
        CommonEvents.hoverOnElement(linkHombre);
        return this;
    }

    public Futbol clickFutbol() {
        CommonEvents.clickButton(linkFutbol);
        return new Futbol();
    }
}
