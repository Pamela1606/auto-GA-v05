package org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Calzado;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Calzado.Carrito.Carrito;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Calzado extends BasePage {
    @FindBy(xpath="(//button[@type='button'])[2]")
    private WebElement selectTallaCalzado;

    @FindBy(css =".gl-menu__item:nth-child(9) > .gl-menu__element")
    private WebElement talla;

    @FindBy(css=".row > .gl-cta--primary")
    private WebElement aniadirCarrito;

    @FindBy(css="span:nth-child(5)")
    private WebElement cantidadObtenida;

    @FindBy(css=".gl-cta:nth-child(7)")
    private WebElement carritoBoton;

    public Calzado selectTalla() {
        CommonEvents.jsClickElement(selectTallaCalzado);
        CommonEvents.jsClickElement(talla);
        return this;
    }

    public Calzado clickAniadirCarrito() {
        CommonEvents.jsClickElement(aniadirCarrito);
        return this;
    }

    public String getCantidadTenis() {
        return CommonEvents.getTextContent(cantidadObtenida);
    }

    public Carrito clickVerCarrito() {
        CommonEvents.clickButton(carritoBoton);
        return new Carrito();
    }
}
