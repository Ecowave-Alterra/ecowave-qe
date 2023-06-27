import InformationListPage from "../pageObjects/informationList";

class InformationListNavigation{
    
    constructor(){
        this.informationListObject = new InformationListPage();
    }

    checkInformationPageTitle(){
        this.informationListObject.getInformationPageTitle().should('be.visible');
    }

    checkContainsCorrectColumnTitles(){
        const expectedColumnTitles= ['No.', 'Id', 'Judul', 'Status', 'Action'];
        var counter = 0;
        this.informationListObject.getTableColumnTitles().each((item) => {
            expect(item).to.contains.text(expectedColumnTitles[counter]);
            counter++;
        })
    }

    fillSearchField(searchParameter){
        this.informationListObject.getSearchField().type(searchParameter);
    }

    clickSubmitSearchButton(){
        this.informationListObject.getSearchField().type('{enter}');
    }

    checkNthInfoTitle(nthInfo, expectedInfoName){
        this.informationListObject.getNthInfoName(nthInfo).should('contain.text', expectedInfoName);
    }

    clickEditProductButton(){
        this.informationListObject.getEditButton().click();
    }

    clickEditProductButton(){
        this.informationListObject.getEditButton().click();
    }

    clickDeleteProductButton(){
        this.informationListObject.getDeleteButton().click();
        this.informationListObject.getConfirmButton().click();
    }

    checkSuccessDeleteMessage(){
        this.informationListObject.getBlockMessage().should('contain.text', 'Anda berhasil menghapus informasi')
    }
    
    clickAddInformationButton(){
        this.informationListObject.getCreateButton().click();
    }

    clickStatusTabButton(status){
        this.informationListObject.getStatusButton(status).click();
    }

    checkAllDataStatus(status){
        this.informationListObject.getAllCardStatuses().each($element => {
            expect($element.text()).to.be.eq(status);
        });
    }
}

export default InformationListNavigation;