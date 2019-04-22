package org.umssdiplo.automationv01.core.managepage.store.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;


public class BrandDelete extends BasePage {

    @FindBy(id = "deleteBrand")
    private WebElement deleteBrand;

    @FindBy(id = "modal-cancel")
    private WebElement cancelButton;

    public void deleteBrand() {
        clickButton(deleteBrand);
    }

    public void cancelBrand() {
        clickButton(cancelButton);
    }

    public void showDeleteModalSpecificElement(String name) {
        WebElement element = findByXPath(("//td[contains(text(), '" + name + "')]/parent::tr//button[contains(@class, 'fa-trash')]"));
        clickButton(element);
    }

    public WebElement verifyBrandDeleted(String name) {
        try {
            return findByXPath(("//td[contains(text(), '" + name + "')]"));
        } catch (Exception e) {
            return null;
        }
    }


}
