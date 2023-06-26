import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import InformationCreateNavigation from "../navigation/informationCreate";
import { faker } from "@faker-js/faker";

const infoCreateNav= new InformationCreateNavigation();

And('I enter valid value on edit information form', ()=>{
    infoCreateNav.fillTitleForm('INFO-AUT-' + faker.number.int({min:1, max:100000}));
    infoCreateNav.fillContentForm();
    infoCreateNav.clickSubmitInfoButton();
    infoCreateNav.clickConfirmButton();
})

Then('I will be able to see success edit product message', ()=>{
    infoCreateNav.checkSuccessEditMessage();
})

