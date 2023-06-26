import LandingPage from "../pageObjects/landing";


class LandingPageNavigation{

    constructor(){
        this.pageUrl= "https://classy-alpaca-96036e.netlify.app/";
        this.landingPageObject = new LandingPage();
    }

    openPage() {
        cy.visit(this.pageUrl);
    }

    checkHeaderExist() {
        this.landingPageObject.getHeaderText().should('be.visible');
    }

    clickFiturKamiButton() {
        this.landingPageObject.getFiturKamiButton().click();
    }

    clickFAQButton() {
        this.landingPageObject.getFAQButton().click();
    }

    clickFAQExpandables() {
        this.landingPageObject.getFAQDropdowns().click({force:true});
    }

    checkFeatureListTitleExist(){
        this.landingPageObject.getFeatureListSectionTitle().should('be.visible');
    }

    checkCollapsableContentShown(){
        this.landingPageObject.getFAQCollapsableContent().should('be.visible');
    }

    checkCollapsableContentHidden(){
        this.landingPageObject.getFAQCollapsableContent().should('be.hidden');
    }
    
    checkFAQSectionTitle(){
        this.landingPageObject.getFAQSectionTitle().should('contain.text','Frequently Asked Questions')
    }
}
export default LandingPageNavigation;