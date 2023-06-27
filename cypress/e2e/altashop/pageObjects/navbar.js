class NavbarPage{
    getNavbar(){
        return cy.get("#navigation");
    }

    getDataIndukButton(){
        return cy.get("#navigation").contains("Data Induk");
    }

    getPesananButton(){
        return cy.get("#navigation").contains("Pesanan");
    }

    getProdukButton(){
        return cy.get("#navigation").contains("Produk");
    }

    getInformationButton(){
        return cy.get("#navigation").contains("Informasi");
    }

    getOpsiPengirimanButton(){
        return cy.get("#navigation").contains("Opsi Pengiriman");
    }
}

export default NavbarPage;