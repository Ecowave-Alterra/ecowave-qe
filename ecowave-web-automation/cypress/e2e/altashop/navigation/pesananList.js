import PesananListObject from "../pageObjects/pesananlist";

class PesananNavigation{

    constructor(){
        this.pesananListObject = new PesananListObject();
    }

    fillSearchField(input){
        this.pesananListObject.getSearchBar().type(input+'{enter}');
    }

    checkNthPesananTitle(nth, expectedId){
        this.pesananListObject.getNthTransactionID(nth).should('contain.text', expectedId);
    }

    checkNthPesananStatus(nth, expectedStatus){
        this.pesananListObject.getNthTransactionStatus(nth).should('contain.text', expectedStatus);
    }
}

export default PesananNavigation;