import NavbarPage from "../pageObjects/navbar";


class NavBarSectionNavigation{

    constructor(){
        this.navBarPageObject = new NavbarPage();
    }

    checkNavbarExist(){
        this.navBarPageObject.getNavbar().should('be.visible');
    }

    clickDataIndukButton(){
        this.navBarPageObject.getDataIndukButton().should('be.visible').click();
    }

    clickPesananButton(){
        this.navBarPageObject.getPesananButton().should('be.visible').click();
    }

    clickProductButton(){
        this.navBarPageObject.getProdukButton().should('be.visible').click();
    }

    clickInformationButton(){
        this.navBarPageObject.getInformationButton().should('be.visible').click();
    }

    clickOpsiPengirimanButton(){
        this.navBarPageObject.getOpsiPengirimanButton().should('be.visible').click();
    }
}

export default NavBarSectionNavigation;