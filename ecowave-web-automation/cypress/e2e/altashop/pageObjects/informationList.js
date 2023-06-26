class InformationListPage{
    getInformationPageTitle(){
        return cy.get('.text-h4').contains('Informasi');
    }

    getTableColumnTitles(){
        return cy.get("th")
    }

    getSearchField(){
        return cy.get("#search-input");
    }

    getSubmitSearchButton(){
        return cy.get("#btn-input-search");
    }

    getNthInfoName(nthInfo){
        return cy.get(`tr:nth-child(${nthInfo})`).get("td:nth-child(3)");
    }

    getEditButton(){
        return cy.get('tbody > tr button:nth-child(2)')
    }

    getCreateButton(){
        return cy.get('#btn_to_tambahInformasi')
    }

    getStatusButton(status){
        return cy.get('button').contains(status);
    }

    getAllCardStatuses(){
        return cy.get('tr td:nth-of-type(3)');
    }

    getDeleteButton(){
        return cy.get('tbody > tr button:nth-child(3)')
    }

    getBlockMessage(){
        return cy.get('.block');
    }

    getConfirmButton(){
        return cy.get('#btn_confirm');
    }
}

export default InformationListPage;