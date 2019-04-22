package org.umssdiplo.automationv01.core.managepage.webadidas.CalzadoFutbol;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

public class Calzado extends BasePage {

    @FindBy(id = "app")
    private WebElement appOption;


    public void openCalzado() {
        click(appOption);
    }


}
