import { faker } from '@faker-js/faker';

export function postRegistration () {

    const email = 'testingmanautomation-' + faker.number.int({min:1, max:10000000}).toString() + '@gmail.com';
    const password = 'Testing123';
    const name = 'testingman-' + faker.number.int({min:1, max:10000000}).toString();
    const phone = '0871273625142';
    const username = 'testing man';
    cy.request({
        method: 'POST',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/user/register',
        body: {
            name: name,
            email: email,
            password: password,
            phone: phone,
            username: username
        },
        headers: {
            'content-type': 'application/json',
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(200);
    });
    var obj =  {
        'name': name,
        'email': email,
        'password': password,
        'phone': phone,
        'username': username
    }
    return obj;
}