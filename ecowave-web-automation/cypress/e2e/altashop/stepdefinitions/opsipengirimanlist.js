import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import NavBarSectionNavigation from "../navigation/navbar";
import OpsiPengirimanListNavigation from "../navigation/opsiPengirimanList";

const navPageNav= new NavBarSectionNavigation();

const opsiPengirimanListNav= new OpsiPengirimanListNavigation();


When("I navigate to opsi pengiriman list page from navigation bar", ()=>{
    navPageNav.clickDataIndukButton();
    navPageNav.clickOpsiPengirimanButton();
})

Then("I will see opsi pengiriman page title", ()=>{
    opsiPengirimanListNav.checkOpsiPengirimanPageTitle();
})

And("I will see the correct columns shown on the opsi pengiriman data table", ()=>{
    opsiPengirimanListNav.checkCorrectColumnValues();
})
