import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import InformationCreateNavigation from "../navigation/informationCreate";
import { faker } from "@faker-js/faker";

const infoCreateNav= new InformationCreateNavigation();


And("I enter valid values on the information form", () => {
    infoCreateNav.fillTitleForm('INFO-AUT-' + faker.number.int({min:1, max:100000}));
    infoCreateNav.fillContentForm();
    infoCreateNav.fillImageForm();
    infoCreateNav.clickSubmitInfoButtonTwo();
    infoCreateNav.clickConfirmButton();
})

Then("I will see success create information message", () => {
    infoCreateNav.checkSuccessAddMessage();
})

And("I enter invalid empty value on {} information form", (emptyField) => {
    infoCreateNav.fillFormWithEmptyValue(emptyField);
})

Then("I will see submit button as inactive", () => {
    infoCreateNav.checkAddButtonAsDisabled();
})

And("I enter valid values on the information form as a draft", () => {
    infoCreateNav.fillTitleForm('INFO-AUT-' + faker.number.int({min:1, max:100000}));
    infoCreateNav.fillContentForm();
    infoCreateNav.fillImageForm();
    infoCreateNav.clickSubmitAsDraft();
})

Then("I will see success create information message as draft", () => {
    infoCreateNav.checkSuccessSaveAsDraft();
})