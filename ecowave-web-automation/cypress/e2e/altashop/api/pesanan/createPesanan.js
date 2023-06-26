

import { faker } from '@faker-js/faker';

export function postPesanan(addressId, voucherId, productData, token) {
    const shipperPrice = faker.number.int({min: 1000, max:10000})
    cy.request({
        method: 'POST',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/user/transaction',
        body: {
            AddressId: addressId,
            VoucherId: voucherId,
            TotalShippingPrice: shipperPrice,
            ExpeditionName: 'JNE',
            EstimationDay: '3-6',
            Discount: 0,
            TransactionDetails: [
                {
                    ProductId: productData['id'],
                    ProductName: productData['name'],
                    Qty: 1,
                    SubTotalPrice: productData['price']
                }
            ]
        },
        headers: {
            'content-type': 'application/json',
            'Authorization': `Bearer ${token}`
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(200);
        return $request.body['Transaction_Id'];
    });
}