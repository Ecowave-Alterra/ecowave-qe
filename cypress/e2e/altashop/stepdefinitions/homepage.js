/// <reference types="Cypress" />

import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import { should } from "chai";
import LandingPageNavigation from "../navigation/landing";

const landingPageNav= new LandingPageNavigation();

Given("I open altashop homepage", ()=>{
    landingPageNav.openPage();
})
When("I open ecoshop homepage", ()=>{
    landingPageNav.openPage();
})

Then("I will see Ecowave header information", ()=>{
    landingPageNav.checkHeaderExist();
})

When("I select Fitur Kami button", ()=>{
    landingPageNav.clickFiturKamiButton();
})

Then("I will be directed to feature list section", ()=>{
    landingPageNav.checkFeatureListTitleExist();
})

When("I select FAQ section", ()=>{
    landingPageNav.clickFAQButton();
})

Then("I will be directed to FAQ section", ()=>{
    landingPageNav.checkFAQSectionTitle();
})

When("I press FAQ dropdown", ()=>{
    landingPageNav.clickFAQExpandables();
})

Then("I will see the expanded section for FAQ", ()=>{
    landingPageNav.checkCollapsableContentShown();
})

Then("I will see the expanded section as hidden", ()=>{
    landingPageNav.checkCollapsableContentHidden();
})

