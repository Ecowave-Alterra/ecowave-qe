import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import NavBarSectionNavigation from "../navigation/navbar";
import ProductListNavigation from "../navigation/productList";
import { postNewProduct } from "../api/product/createProduct";
import { faker } from '@faker-js/faker';
import ProductCreateNavigation from "../navigation/productCreate";


const navPageNav= new NavBarSectionNavigation();

const productListNav= new ProductListNavigation();

const productCreateNav= new ProductCreateNavigation();

let productName;

When("I navigate to product list page from navigation bar", () => {
    navPageNav.clickDataIndukButton();
    navPageNav.clickProductButton();
})

Then("I will see product page title", () => {
    productListNav.checkProductTitleShown();
})

And("I will see the correct columns shown on the product data table", () => {
    productListNav.checkContainsCorrectColumnTitles();
})

And("I will see the current page as {}", (pageNum) => {
    productListNav.checkCurrentPage(pageNum);
})

When("I create a new product using API call", () => {
    productName = 'Aut-'+ faker.number.int({min:1, max:10000}).toString();
    postNewProduct(productName);
})

And("I search the product from search field", () => {
    productListNav.fillSearchField(productName);
    productListNav.clickSubmitSearchButton();
})

Then("I will see the correct data displayed on table", () => {
    productListNav.checkNthProductTitle(1, productName);
})

And("I press create new product button", () => {
    productListNav.clickCreateProductButton();
})

And("I press delete button for the product", () => {
    productListNav.clickDeleteProductButton();
    productCreateNav.clickConfirmCreateButton();
})

Then("I will see success delete product message", () => {
    productListNav.checkSuccessDeleteProduct();
})

And("I search for an existing product", () => {
    productListNav.fillSearchField(productName);
    productListNav.clickSubmitSearchButton();
})

And("I press edit button for the product", () => {
    productListNav.clickEditProductButton();
})