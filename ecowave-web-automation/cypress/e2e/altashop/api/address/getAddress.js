
export function getAddress(token) {
    cy.request({
        method: 'GET',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/user/address',
        headers: {
            'Authorization': `Bearer ${token}`
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(200);
        return $request.body['Data'][0]['Id'];
    });
}