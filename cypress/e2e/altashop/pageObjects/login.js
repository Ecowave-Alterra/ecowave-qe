class LoginPage{
    getEmailForm(){
        return cy.get("#email")
    }

    getPasswordForm(){
        return cy.get("#passWord")
    }

    getSubmitLoginButton(){
        return cy.get(".mb-12 > .text-p3");
    }
    
    getEmailErrorMessage(){
        return cy.get(".text-error-500.text-p4");
    }
}

export default LoginPage;