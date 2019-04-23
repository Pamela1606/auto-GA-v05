package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.webadidas.Home;
import org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Calzado.Carrito.Carrito;
import org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Calzado.Calzado;
import org.umssdiplo.automationv01.core.managepage.webadidas.Hombre.Futbol.Futbol;
import org.umssdiplo.automationv01.core.utils.LoadPage;


public class StepsDefinitionAdidas {

    private Home home;
    private Futbol futbolPage;
    private Calzado calzadoPage;
    private Carrito carritoPage;

    @Given("^go Home pagina cargada$")
    public void loadPageHome() throws Throwable {
       home = LoadPage.cargaPagina();
    }

    @And("^Hover Men link Header$")
    public void hoverMenLinkHeader() throws Throwable {
        home.hoverMenLink();
    }

    @And("^Click fubtbol link Calzado column$")
    public void clickFubtbolLinkCalzadoColum() throws Throwable {
        futbolPage = home.clickFutbol();
    }

    @And("^Obetener valores del primer calzado de futbol$")
    public void obtenerValores() throws Throwable {
        futbolPage.obtenerValores();
    }

    @And("^Click Calzado de Fútbol X 18.3 TF$")
    public void clickCalzadoDeFútbolXTF() throws Throwable {
        calzadoPage = futbolPage.clickCalzado();
    }

    @And("^seleccionar talla MX 9.5$")
    public void seleccionarTalla() throws Throwable {
        calzadoPage.selectTalla();
    }

    @And("^Click añadir a carrito button$")
    public void clickAñadirACarritoButton() throws Throwable {
        calzadoPage.clickAniadirCarrito();
    }

    @And("^Verify cantidad \"([^\"]*)\"$")
    public void verificarCantidadCantidad(String arg0) throws Throwable {
        String actual = calzadoPage.getCantidadTenis();
        String esperado = arg0;
        Assert.assertEquals(esperado,actual);
    }

    @And("^Click ver carrito link$")
    public void clickVerCarritoLink() {
        carritoPage = calzadoPage.clickVerCarrito();
    }

    @And("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String arg0) throws Throwable {
        String esperado = arg0;
        String actual = carritoPage.getTitleTenis();
        Assert.assertEquals(esperado,actual);
    }

    @And("^Price should be \"([^\"]*)\"$")
    public void priceShouldBe(String arg0) throws Throwable {
        String esperado = arg0;
        String actual = carritoPage.getPrecioActual();
        Assert.assertEquals(esperado,actual);
    }

    @And("^Total should be \"([^\"]*)\"$")
    public void totalShouldBe(String arg0) throws Throwable {
        String esperado = arg0;
        String actual = carritoPage.getTotalActual();
        Assert.assertEquals(esperado,actual);
    }
}
