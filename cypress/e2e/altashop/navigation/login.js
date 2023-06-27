import LoginPage from "../pageObjects/login";


class LoginPageNavigation{

    constructor(){
        this.pageUrl= "https://classy-alpaca-96036e.netlify.app/login";
        this.loginPageObject = new LoginPage;
        this.email;
        this.password;
    }

    setEmail(email){
        this.email=email;
    }

    setPassword(password){
        this.password=password;
    }

    inputEmailField(email){
        this.loginPageObject.getEmailForm().type(email);
    }

    inputPasswordField(password){
        this.loginPageObject.getPasswordForm().type(password);
    }

    clickSubmitLoginButton(){
        this.loginPageObject.getSubmitLoginButton().click({force:true});
    }

    openLoginPage(){
        cy.visit(this.pageUrl);
    }

    checkEmailErrorMessage(){
        this.loginPageObject.getEmailErrorMessage().should('contain.text', 'Email Tidak Valid');
    }
}

export default LoginPageNavigation;