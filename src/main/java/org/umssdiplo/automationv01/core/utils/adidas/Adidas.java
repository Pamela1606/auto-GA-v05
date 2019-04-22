package org.umssdiplo.automationv01.core.utils.adidas;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.webadidas.Home;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;


public final class Adidas {
    private Home home;


    private Adidas() {
        home = new Home();

    }

    public static Adidas init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl());
        return new Adidas();
    }

    public Home getHome() {
        return home;
    }


}
