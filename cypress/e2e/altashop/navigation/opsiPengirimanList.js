import OpsiPengirimanListObject from "../pageObjects/opsiPengirimanList";


class OpsiPengirimanListNavigation{
    
    constructor(){
        this.opsiPengirimanListObject = new OpsiPengirimanListObject();
    }

    checkOpsiPengirimanPageTitle(){
        this.opsiPengirimanListObject.getPageTitle().should('contain.text', 'Opsi Pengiriman');
    }

    checkCorrectColumnValues(){
        const expectedColumnTitles= ['No.', 'Opsi Pengiriman', 'Status'];
        var counter = 0;
        this.opsiPengirimanListObject.getTableColumnTitles().each($column=>{
            expect($column.text()).to.be.eq(expectedColumnTitles[counter]);
            counter++
        })
    }
}

export default OpsiPengirimanListNavigation;