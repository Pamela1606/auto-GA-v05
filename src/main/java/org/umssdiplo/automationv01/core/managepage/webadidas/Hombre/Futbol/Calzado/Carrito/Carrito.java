package org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Calzado.Carrito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class Carrito extends BasePage {
    @FindBy(css=".name")
    private WebElement tituloTenis;

    @FindBy(css=".cart-widget-block > .cart-widget-value")
    private WebElement precioActual;

    @FindBy(css=".cart-products-ordertotal > .cart-widget-value")
    private WebElement totalActual;

    public String getTitleTenis() {
        return CommonEvents.getTextContent(tituloTenis);
    }

    public String getPrecioActual(){
        return CommonEvents.getTextContent(precioActual);
    }

    public String getTotalActual(){
        return CommonEvents.getTextContent(totalActual);
    }
}

