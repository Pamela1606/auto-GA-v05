package org.umssdiplo.automationv01.stepdefinitionproject;

import com.sun.tools.javac.util.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.umssdiplo.automationv01.core.managepage.store.domain.Brand;
import org.umssdiplo.automationv01.core.managepage.store.web.BrandCreate;
import org.umssdiplo.automationv01.core.managepage.store.web.BrandDelete;
import org.umssdiplo.automationv01.core.utils.store.Store;

import java.util.List;

public class StepsDefinitionStore {

    private BrandCreate brandCreate;
    private BrandDelete brandDelete;

    @Given("^'Store' page is loaded$")
    public void storePageIsLoaded() throws Throwable {
        Store manager = Store.init();
        brandCreate = manager.getBrandCreate();
        brandDelete = manager.getBrandDelete();

    }

    @And("^click 'Create an brand' menu item in 'Brands menu'$")
    public void openBrandsForm() throws Throwable {
        brandCreate.openBrandsForm();
    }

    /**
     * Commons
     */

    @Then("^verify brand item with name \"([^\"]*)\" exist in 'Brands list'$")
    public void verifyBrandItemWithNameExistInBrandList(String name) throws Throwable {
        WebElement element = brandCreate.getElement(name);
        if (null == element) {
            Assert.error("Verification Exception: Brand with name: " + name + " not exists in Brand list.");
        }
    }

    /**
     * Creation
     */
    @And("^Fill 'Brand form' information$")
    public void enterBrandsFormInformation(List<Brand> brand) throws Throwable {
        brandCreate.fillBrandsForm(brand.get(0));
    }


    @And("^click 'create' button in 'Brand menu'$")
    public void submitBrandsForm() throws Throwable {
        brandCreate.submitBrandsForm();
    }

    /**
     * Deletion
     */
    @Given("^click 'Remove a brand' button in element with name \"([^\"]*)\" of 'Brands list'$")
    public void showDeleteModalSpecificElement(String name) throws Throwable {
        brandDelete.showDeleteModalSpecificElement(name);
    }

    @And("^click 'Ok' button from deletion modal$")
    public void deleteBrand() throws Throwable {
        brandDelete.deleteBrand();
    }

    @And("^click 'Cancel' button from deletion modal$")
    public void cancelBrand() throws Throwable {
        brandDelete.cancelBrand();
    }

    @Then("^verify brand item with name \"([^\"]*)\" has been deleted of 'Brands list'$")
    public void verifyBrandDeleted(String name) {
        WebElement element = brandDelete.verifyBrandDeleted(name);
        if (null != element) {
            Assert.error("[" + BrandDelete.class + "]: Verification Exception: Incident has not been removed from in incident list.");
        }
    }
}
