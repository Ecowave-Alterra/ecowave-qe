

import { faker } from '@faker-js/faker';

export function postAddress(token) {

    const recepient = 'Bapak ' + faker.name.lastName();
    const phone = faker.phone.number('08##########');
    const provinceId = '1';
    const provinceName = 'Bali';
    const cityId = '17';
    const cityName = 'Badung';
    const address = 'Bantul';
    const note = 'Note';
    const mark = 'Kantor';
    const isPrimary = true;
    cy.request({
        method: 'POST',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/user/address',
        body: {
            Recipient: recepient,
            Phone: phone,
            ProvinceId: provinceId,
            ProvinceName: provinceName,
            CityId: cityId,
            CityName: cityName,
            Address: address,
            Note: note,
            Mark: mark,
            IsPrimary: isPrimary
        },
        headers: {
            'content-type': 'application/json',
            'Authorization': `Bearer ${token}`
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(201);
        return $request.status;
    });
}