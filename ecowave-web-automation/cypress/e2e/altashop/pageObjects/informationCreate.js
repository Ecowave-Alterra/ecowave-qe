class InformationCreateObject{
    getTitleForm(){
        return cy.get('#judul');
    }

    getContentInfoForm(){
        return cy.get('#konten');
    }

    getSubmitFormButton(){
        return cy.get('#button-terbit-submit');
    }

    getSubmitFormButtonTwo(){
        return cy.get('#button_terbit_submit');
    }

    getSaveAsDraftButton(){
        return cy.get('#button_draft_submit');
    }

    getConfirmSubmit(){
        return cy.get('#btn_confirm');
    }

    getBlockMessage(){
        return cy.get('.block');
    }

    getAddImage(){
        return cy.get('#image');
    }
}

export default InformationCreateObject;