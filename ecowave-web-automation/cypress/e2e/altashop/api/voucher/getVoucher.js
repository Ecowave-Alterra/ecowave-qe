
export function getVoucher(token) {
    cy.request({
        method: 'GET',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/user/transaction/voucher?page=1',
        headers: {
            'Authorization': `Bearer ${token}`
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(200);
        return $request.body['Voucher'][0]['Id'];
    });
}