import ProductListPage from "../pageObjects/productList";

class ProductListNavigation{

    constructor(){
        this.productListObject = new ProductListPage();
    }

    checkProductTitleShown(){
        this.productListObject.getProductListPageTitle().should('contain.text', 'Produk');
    }

    fillSearchField(searchParameter){
        this.productListObject.getSearchField().type(searchParameter);
    }

    clickSubmitSearchButton(){
        this.productListObject.getSearchField().type('{enter}');
    }

    checkNthProductTitle(nthProduct, expectedProductName){
        this.productListObject.getNthProductName(nthProduct).should('contain.text', expectedProductName);
    }

    checkContainsCorrectColumnTitles(){
        const expectedColumnTitles= ['No.', 'Produk ID', 'Nama Produk', 'Kategori', 'Stok', 'Harga', 'Status', 'Action'];
        var counter = 0;
        this.productListObject.getTableColumnTitles().each((item) => {
            expect(item).to.contains.text(expectedColumnTitles[counter]);
            counter++;
        })
    }

    checkCurrentPage(expectedPage){
        this.productListObject.getPageNumeration().then($value => {
            const actualPage = $value.text();
            expect(actualPage.split(' ')[1].toString()).to.be.eq(String(expectedPage));
        })
    }

    clickCreateProductButton(){
        this.productListObject.getProductCreateButton().click();
    }

    clickDeleteProductButton(){
        this.productListObject.getProductDeleteButton().click();
    }

    clickEditProductButton(){
        this.productListObject.getEditButton().click();
    }

    checkSuccessDeleteProduct(){
        this.productListObject.getSuccessDeleteProduct().should('contain.text', 'Anda berhasil menghapus produk')
    }
}

export default ProductListNavigation;