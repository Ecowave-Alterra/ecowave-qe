class PesananListObject{
    getSearchBar(){
        return cy.get('#search-input');
    }

    getNthTransactionID(nth){
        return cy.get(`tr:nth-of-type(${nth}) td:nth-of-type(2)`)
    }

    getNthTransactionStatus(nth){
        return cy.get(`tr:nth-of-type(${nth}) td:nth-of-type(7)`)
    }
}

export default PesananListObject;