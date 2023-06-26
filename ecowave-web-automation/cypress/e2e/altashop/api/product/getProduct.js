
export function getProduct(token) {
    cy.request({
        method: 'GET',
        url: 'https://ecowave-h64wmjjkza-uc.a.run.app/admin/products/search?&filter=Tersedia&page=1',
        headers: {
            'Authorization': `Bearer ${token}`
        }, 
    }).then($request => {
        expect($request.status).to.be.eq(200);
        return {
            id: $request.body['Products'][0]['ProductId'],
            name: $request.body['Products'][0]['Name'],
            price: $request.body['Products'][0]['Price']
        }
    });
}