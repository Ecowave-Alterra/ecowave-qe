import {Given, When, And, Then} from "cypress-cucumber-preprocessor/steps";
import { should } from "chai";
import LoginPageNavigation from "../navigation/login";
import NavBarSectionNavigation from "../navigation/navbar";


const loginPageNav= new LoginPageNavigation();
const navBarNav= new NavBarSectionNavigation();


Given("I open altashop login page",()=>{
    loginPageNav.openLoginPage();
})

Given("I enter altashop admin page as logged in user", () =>{
    loginPageNav.openLoginPage();
    loginPageNav.inputEmailField("admin@gmail.com");
    loginPageNav.inputPasswordField("admin123");
    loginPageNav.clickSubmitLoginButton();
    navBarNav.checkNavbarExist();
})

When("I enter email as {}", (email)=>{
    loginPageNav.inputEmailField(email);
})

And("I enter password as {}", (password)=>{
    loginPageNav.inputPasswordField(password);
})

And("I press login submit button", ()=>{
    loginPageNav.clickSubmitLoginButton();
})

Then("I will be directed to admin homepage", ()=>{
    navBarNav.checkNavbarExist();
})

Then("I will see error message for invalid email format", ()=>{
    loginPageNav.checkEmailErrorMessage()
})


