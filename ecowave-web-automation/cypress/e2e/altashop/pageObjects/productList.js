class ProductListPage{
    getProductListPageTitle(){
        return cy.get(".text-h4");
    }

    getTableColumnTitles(){
        return cy.get("th")
    }

    getPageNumeration(){
        return cy.get(".font-normal").contains("Halaman");
    }

    getSearchField(){
        return cy.get("#search-input");
    }

    getSubmitSearchButton(){
        return cy.get("#btn-input-search");
    }

    getNthProductName(nthProduct){
        return cy.get(`tr:nth-child(${nthProduct})`).get("td:nth-child(3)");
    }

    getProductCreateButton(){
        return cy.get('button').contains('Tambah Produk');
    }

    getProductDeleteButton(){
        return cy.get('tbody > tr button:nth-child(3)');
    }

    getAcceptAlert(){
        return cy.get(':nth-child(2) > button');
    }

    getSuccessDeleteProduct(){
        return cy.get('.block');
    }

    getEditButton(){
        return cy.get('tbody > tr button:nth-child(2)')
    }
}

export default ProductListPage;