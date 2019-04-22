package org.umssdiplo.automationv01.core.managepage.store.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.store.domain.Brand;

import static org.umssdiplo.automationv01.core.utils.CommonEvents.*;


public class BrandCreate extends BasePage {

    @FindBy(id = "addBrand")
    private WebElement addBrandButton;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "createBrand")
    private WebElement createBrandButton;

    public void openBrandForm() {
        clickButton(addBrandButton);
    }

    public void fillBrandForm(Brand brand) {
        setInputField(nameField, brand.getName());
    }

    public void submitBrandsForm() { clickButton(createBrandButton); }

    public WebElement getElement(String name) {
        return findByXPath(("//td[contains(text(), '" + name + "')]"));
    }
}
