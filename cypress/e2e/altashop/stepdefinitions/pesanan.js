import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import { postRegistration } from "../api/registration/userRegistration";
import { faker } from "@faker-js/faker";
import { postLogin } from "../api/login/userLogin";
import { postAddress } from "../api/address/createAddress";
import { getAddress } from "../api/address/getAddress";
import { getVoucher } from "../api/voucher/getVoucher";
import { getProduct } from "../api/product/getProduct";
import { postPesanan } from "../api/pesanan/createPesanan";
import NavBarSectionNavigation from "../navigation/navbar";
import PesananNavigation from "../navigation/pesananList";

let pesananId; 

const navPageNav= new NavBarSectionNavigation();

const pesananListNav = new PesananNavigation();

And("I navigate to pesanan list page from navigation bar", ()=>{
    navPageNav.clickPesananButton();
})

When('I create a transaction using API flow', ()=> {
    const test = postRegistration();
    let token;
    let addressId; 
    let voucherId; 
    let productData; 

    postLogin(test['email'], test['password'])
    .then($token => {
        token = $token;
        postAddress($token);
    })
    .then(() => {
        getAddress(token);
    })
    .then($addressId => {
        addressId = $addressId;
        getVoucher(token);
    })
    .then($voucherId => {
        voucherId = $voucherId;
        getProduct(token);
    })
    .then($productData=> {
        productData = $productData;
        postPesanan(addressId, voucherId, productData, token);
    })
    .then($pesananData => {
        pesananId = $pesananData;
        cy.log(pesananId);
    })
})

And("I search for the newly created transaction ID", ()=>{
    pesananListNav.fillSearchField(pesananId);
})

Then("I will see the transaction ID in the result", ()=>{
    pesananListNav.checkNthPesananTitle(1, pesananId);
})

And("status shown will be {}", (status)=>{
    pesananListNav.checkNthPesananStatus(1, status);
})
