class LandingPage{
    getHeaderText(){
        return cy.get("#beranda > .flex-col > .text-p1")
    }

    getFiturKamiButton(){
        return cy.get('[href="#fitur"]');
    }

    getFeatureListSectionTitle(){
        return cy.get('.max-w-7xl > .font-bold')
    }

    getFAQButton(){
        return cy.get('[href="#faq"]');
    }

    getFAQDropdowns(){
        return cy.get('[data-testid="flowbite-accordion"] > :nth-child(1)');
    }

    getFAQCollapsableContent(){
        return cy.get('[data-testid="flowbite-accordion"] > :nth-child(2)');
    }

    getFAQSectionTitle(){
        return cy.get('.max-w-7xl > .text-center > .text-h4');
    }
}
export default LandingPage;