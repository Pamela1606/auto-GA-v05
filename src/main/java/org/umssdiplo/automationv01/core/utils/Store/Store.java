package org.umssdiplo.automationv01.core.utils.store;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.store.web.BrandCreate;
import org.umssdiplo.automationv01.core.managepage.store.web.BrandDelete;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.utils.WebUrls;

public final class Store {
    private BrandCreate brandCreate;
    private BrandDelete brandDelete;

    private Store() {
        brandCreate = new BrandCreate();
        brandDelete = new BrandDelete();
    }

    public static Store init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.Store));
        return new Store();
    }

    public BrandCreate getBrandCreate() { return brandCreate; }

    public BrandDelete getBrandDelete() {
        return brandDelete;
    }
}
