class ProductCreatePage{
    getProductNameField(){
        return cy.get('#productName');
    }

    getProductCategoryDropdown(){
        return cy.get('#category');
    }

    getProductWeightField(){
        return cy.get('#weight');
    }

    getProductPriceField(){
        return cy.get('#price');
    }

    getProductStockField(){
        return cy.get('#stock');
    }

    getDropContainer(){
        return cy.get('#dropContainer');
    }

    getSubmitCreateButton(){
        return cy.get('button').contains('Tambah');
    }

    getSuccessAddProduct(){
        return cy.get('.block');
    }

    getDeskripsiForm(){
        return cy.get('.ql-editor');
    }

    getFieldErrorMessage(){
        return cy.get('.text-error-500.text-p4');
    }

    getNoImageError(){
        return cy.get('.block');
    }

    getProductCreateConfirmButton(){
        return cy.get('#btn_confirm');
    }
}

export default ProductCreatePage;