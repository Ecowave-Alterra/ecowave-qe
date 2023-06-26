import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import ProductCreateNavigation from "../navigation/productCreate";
import ProductListNavigation from "../navigation/productList";
import { faker } from '@faker-js/faker';

const productCreateNav = new ProductCreateNavigation();
const productListNav = new ProductListNavigation();

let newProductName;

And("I enter valid value on edit product form", () => {
    newProductName = 'AUT-'+ faker.number.int({min:1, max:10000}).toString();
    productCreateNav.fillNameForm(newProductName);
    productCreateNav.fillCategoryForm();
    productCreateNav.clickSubmitCreateButton();
})

Then("I will be able to search the edited product on search form", () => {
    productListNav.fillSearchField(newProductName);
    productListNav.clickSubmitSearchButton();
    productListNav.checkNthProductTitle(1, newProductName);
})

