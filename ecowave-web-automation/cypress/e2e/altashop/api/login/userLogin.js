import { faker } from '@faker-js/faker';

export function postLogin (email, password) {

    return cy.request({
        method: 'POST',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/user/login',
        body: {
            email: email,
            password: password,
        },
        headers: {
            'content-type': 'application/json',
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(200);
        return $request.body['Data']['Token'];
    });

}