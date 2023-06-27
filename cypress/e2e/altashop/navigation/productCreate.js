import ProductCreatePage from "../pageObjects/productCreate";
import { faker } from '@faker-js/faker';


class ProductCreateNavigation{

    constructor(){
        this.productCreateObject = new ProductCreatePage();
    }

    fillNameForm(productName){
        if(productName!==undefined){
            this.productCreateObject.getProductNameField().type(productName).toString();
        }
        else{
            this.productCreateObject.getProductNameField().type(`AUT-`+faker.number.int({min:1, max:10000}).toString());
        }
    }

    fillFormGivenEmptyValue(field){
        field!=="name" && this.productCreateObject.getProductNameField().type(`AUT-`+faker.number.int({min:1, max:10000}).toString());
        field!=='price' && this.productCreateObject.getProductPriceField().type(faker.number.int({min:10000, max:500000}));
        field!=='weight' && this.productCreateObject.getProductWeightField().type(faker.number.int({min:1, max:50}));
        field!=='stock' && this.productCreateObject.getProductStockField().type(faker.number.int({min:1, max:50}));
        field!=='category' && this.productCreateObject.getProductCategoryDropdown().select(1);
        field!=='image' && this.productCreateObject.getDropContainer().selectFile('cypress/fixtures/mouse.jpg');
        field!=='deskripsi' && this.productCreateObject.getDeskripsiForm().type('Coba coba');
    }

    fillFormGivenInvalidValue(field){
        this.productCreateObject.getProductNameField().type(`Aut-`+faker.number.int({min:1, max:10000}).toString());
        this.productCreateObject.getProductCategoryDropdown().select(1);
        this.productCreateObject.getDropContainer().selectFile('cypress/fixtures/mouse.jpg');
        this.productCreateObject.getDeskripsiForm().type('Coba coba');

        this.productCreateObject.getProductPriceField().type(field==='price'? 'dua ribu' : faker.number.int({min:10000, max:500000}));
        this.productCreateObject.getProductWeightField().type(field==='weight' ? 'dua' : faker.number.int({min:1, max:50}));
        this.productCreateObject.getProductStockField().type(field==='stock' ? 'dua' : faker.number.int({min:1, max:50}));
    }

    checkErrorMessage(field){
        switch (field){
            case "price":
                this.productCreateObject.getFieldErrorMessage().should('contain.text', 'tidak Boleh Kosong');
                break;
            case "name":
            case "weight":
            case "stock":
            case "deskripsi":
                this.productCreateObject.getFieldErrorMessage().should('contain.text', 'Tidak Boleh Kosong');
                break;
            case "category":
                this.productCreateObject.getFieldErrorMessage().should('contain.text', 'Pilih Salah Satu Kategori');
                break;
            case "image":
                this.productCreateObject.getProductCreateConfirmButton().click();
                this.productCreateObject.getNoImageError().should('contain.text', 'Field/gambar tidak boleh kosong')
        }
    }

    checkErrorMessageInvalidInput(){
        this.productCreateObject.getFieldErrorMessage().should('contain.text', 'Data yang diisi harus Angka')
    }
    
    fillCategoryForm(){
        this.productCreateObject.getProductCategoryDropdown().select(1);
    }

    fillWeightForm(){
        this.productCreateObject.getProductWeightField().type(faker.number.int({min:1, max:50}));
    }

    fillPriceForm(){
        this.productCreateObject.getProductPriceField().type(faker.number.int({min:10000, max:500000}));
    }

    fillStockForm(){
        this.productCreateObject.getProductStockField().type(faker.number.int({min:1, max:50}));
    }

    fillProductImageForm(){
        this.productCreateObject.getDropContainer().selectFile('cypress/fixtures/mouse.jpg');
    }

    clickSubmitCreateButton(){
        this.productCreateObject.getSubmitCreateButton().click();
    }
    
    checkSuccessAddProduct(){
        this.productCreateObject.getSuccessAddProduct().should('contain.text', 'Anda berhasil menambahkan produk')
    }

    fillDeskripsiForm(){
        this.productCreateObject.getDeskripsiForm().type("coba- coba")
    }

    clickConfirmCreateButton(){
        this.productCreateObject.getProductCreateConfirmButton().click();
    }
}

export default ProductCreateNavigation;