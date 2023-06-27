import InformationCreateObject from "../pageObjects/informationCreate";
import { faker } from '@faker-js/faker';


class InformationCreateNavigation{

    constructor(){
        this.informationCreateObject = new InformationCreateObject();
    }

    fillTitleForm(infoTitle){
        this.informationCreateObject.getTitleForm().clear();
        this.informationCreateObject.getTitleForm().type(infoTitle);
    }

    fillFormWithEmptyValue(emptyFields){
        emptyFields!=='title' && this.informationCreateObject.getTitleForm().type('INFO-AUT-' + faker.number.int({min:1, max:100000}));
        emptyFields!=='description' && this.informationCreateObject.getContentInfoForm().type('Coba coba');
        emptyFields!=='image' && this.informationCreateObject.getAddImage().selectFile('cypress/fixtures/mouse.jpg', {force:true});
    }

    checkAddButtonAsDisabled(){
        return this.informationCreateObject.getSubmitFormButtonTwo().should('be.disabled');
    }

    fillContentForm(){
        this.informationCreateObject.getContentInfoForm().clear();
        this.informationCreateObject.getContentInfoForm().type('Coba coba');
    }

    clickSubmitInfoButton(){
        this.informationCreateObject.getSubmitFormButton().click();
    }

    clickSubmitInfoButtonTwo(){
        this.informationCreateObject.getSubmitFormButtonTwo().click();
    }

    clickSubmitAsDraft(){
        this.informationCreateObject.getSaveAsDraftButton().click();
    }

    clickConfirmButton(){
        this.informationCreateObject.getConfirmSubmit().click();
    }

    checkSuccessEditMessage(){
        this.informationCreateObject.getBlockMessage().should('contain.text', 'Anda berhasil mengubah informasi')
    }

    checkSuccessAddMessage(){
        this.informationCreateObject.getBlockMessage().should('contain.text', 'Anda berhasil menerbitkan informasi baru')
    }

    checkSuccessSaveAsDraft(){
        this.informationCreateObject.getBlockMessage().should('contain.text', 'Anda berhasil menambahkan informasi ke dalam draft')
    }

    fillImageForm(){
        this.informationCreateObject.getAddImage().selectFile('cypress/fixtures/mouse.jpg', {force:true});
    }
}

export default InformationCreateNavigation;