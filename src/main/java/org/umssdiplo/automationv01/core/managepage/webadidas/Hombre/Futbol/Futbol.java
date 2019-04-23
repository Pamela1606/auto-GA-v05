package org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Calzado.Calzado;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Futbol extends BasePage {
    private String nombreCalzado;

    private String priceCalzado;

    @FindBy(css = ".col-s-6:nth-child(2) .gl-product-card__name")
    private WebElement calzadoName;

    @FindBy(css = ".gl-price__value--sale")
    private WebElement calzadoPrice;

    public String getCalzadoName() {
        return CommonEvents.getTextContent(calzadoName);
    }

    public String getCalzadoPrice(){
        return CommonEvents.getTextContent(calzadoPrice);
    }

    public Futbol obtenerValores() {
        nombreCalzado=getCalzadoName();
        priceCalzado=getCalzadoPrice();
        return this;
    }

    public Calzado clickCalzado() {
        CommonEvents.clickButton(calzadoName);
        return new Calzado();
    }
}
