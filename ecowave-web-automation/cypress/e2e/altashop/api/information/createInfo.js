import { faker } from '@faker-js/faker';

export const postNewInformation = (infoName, status) =>{
    cy.getCookie('token').then($cookie => {
        cy.fixture('mouse.jpg', 'binary').then( image => {
            var formData = new FormData();
            const blob = Cypress.Blob.binaryStringToBlob(image, 'image/jpg');
    
            formData.append('Title', infoName);
            formData.append('Status', status);
            formData.append('Content', '<p><strong>Ini adalah informasi yang </strong><u>dihasilkan </u><strong>dari <em>automation</em></strong></p><ol><li>Pengujian</li></ol><ul><li>Testing</li></ul>');
            formData.append('PhotoContentUrl', blob, 'mouse.jpg');

            cy.request({
                method: 'POST',
                url: 'https://ecowave-h64wmjjkza-uc.a.run.app/admin/informations',
                body: formData,
                headers: {
                    'content-type': 'multipart/form-data',
                    'authorization': 'Bearer '+ $cookie.value
                }, 
            }).then($request => {
                expect($request.status).to.be.eq(201);
            });
        });
    })
}