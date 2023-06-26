import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import NavBarSectionNavigation from "../navigation/navbar";
import InformationListNavigation from "../navigation/informationList";
import { postNewInformation } from "../api/information/createInfo";
import { faker } from "@faker-js/faker";

const navBarNav= new NavBarSectionNavigation();

const informationListNav= new InformationListNavigation();

let informationTitle;

When("I navigate to information list page from navigation bar", () => {
    navBarNav.clickDataIndukButton();
    navBarNav.clickInformationButton();
})

Then("I will see information page title", () => {
    informationListNav.checkInformationPageTitle();
})

And("I will see the correct columns shown on the information data table", () => {
    informationListNav.checkContainsCorrectColumnTitles();
})

When("I create a new information using API call", () => {
    informationTitle = "TITLE_AUT" + faker.number.int({min:1, max:100000});
    postNewInformation(informationTitle, "Terbit");
})

And("I search the information from search field", () => {
    informationListNav.fillSearchField(informationTitle);
    informationListNav.clickSubmitSearchButton();
})

Then("I will see the correct info data displayed on table", () => {
    informationListNav.checkNthInfoTitle(1, informationTitle);
})

And("I press edit button for the information", () => {
    informationListNav.clickEditProductButton();
})

And("I press delete button for the information", () => {
    informationListNav.clickDeleteProductButton();
})

Then("I will be able to see success delete product message", () => {
    informationListNav.checkSuccessDeleteMessage();
})

And("I press create new information button", () => {
    informationListNav.clickAddInformationButton();
})

And("I press {} filter button", (status) => {
    informationListNav.clickStatusTabButton(status);
})

Then("I will see the correct {} on data shown", (status) => {
    informationListNav.checkAllDataStatus(status);
})





