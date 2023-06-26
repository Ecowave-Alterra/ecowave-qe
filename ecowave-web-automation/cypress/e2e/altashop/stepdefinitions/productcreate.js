import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import ProductCreateNavigation from "../navigation/productCreate";

const productCreateNav= new ProductCreateNavigation();

And('I enter valid values on the product form', ()=>{
    productCreateNav.fillNameForm();
    productCreateNav.fillCategoryForm();
    productCreateNav.fillPriceForm();
    productCreateNav.fillWeightForm();
    productCreateNav.fillStockForm();
    productCreateNav.fillProductImageForm();
    productCreateNav.fillDeskripsiForm();
})

And('I press submit create button for success', ()=>{
    productCreateNav.clickSubmitCreateButton();
    productCreateNav.clickConfirmCreateButton();
})

And('I press submit create button for fail', ()=>{
    productCreateNav.clickSubmitCreateButton();
})

Then('I will see success create product message', ()=>{
    productCreateNav.checkSuccessAddProduct();
})

And('I enter invalid empty value on {} form', (emptyField)=>{
    productCreateNav.fillFormGivenEmptyValue(emptyField);
})

Then('I will see error message on {} form', (emptyField) => {
    productCreateNav.checkErrorMessage(emptyField);
})

And('I enter invalid format value on {} form', (invalidField)=>{
    productCreateNav.fillFormGivenInvalidValue(invalidField);
})

Then('I will see invalid format message on {} form', (invalidField)=>{
    productCreateNav.checkErrorMessageInvalidInput(invalidField);
})

