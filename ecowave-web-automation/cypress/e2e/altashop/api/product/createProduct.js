import { faker } from '@faker-js/faker';

export const postNewProduct = (productName) =>{
    cy.getCookie('token').then($cookie => {
        cy.fixture('mouse.jpg', 'binary').then( image => {
            var formData = new FormData();
            const blob = Cypress.Blob.binaryStringToBlob(image, 'image/jpg');
    
            formData.append('ProductCategoryId', 1);
            formData.append('Name', productName);
            formData.append('Stock', faker.number.int({min:1, max:50}));
            formData.append('Price', faker.number.int({min:1000, max:500000}));
            formData.append('Weight', faker.number.int({min:1, max:50}));
            formData.append('Description', '<h2>coba automation</h2>');
            formData.append('PhotoContentUrl1', blob, 'mouse.jpg');

            cy.request({
                method: 'POST',
                url: 'https://ecowave-h64wmjjkza-uc.a.run.app/admin/products',
                body: formData,
                headers: {
                    'content-type': 'multipart/form-data; boundary=<calculated when request is sent>',
                    'authorization': 'Bearer '+ $cookie.value
                }, 
            }).then($request => {
                expect($request.status).to.be.eq(201);
            });
        });
    })
}