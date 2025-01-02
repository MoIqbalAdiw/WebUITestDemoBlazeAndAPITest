package stepDef;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {
    WebPage webPage;
    Logger logger;

    public WebStep() {
        this.webPage = new WebPage();
    }
    @Given("open web login page")
    public void openWebLoginPage() {
        webPage.openBrowser();
    }
    @Then("check that website logo displayed")
    public void checkThatWebsiteLogoDisplayed() {
        webPage.cekLogo();
    }
    @Then("check that navigation link displayed")
    public void checkThatNavigationLinkDisplayed() {
        webPage.cekNavbar();
    }
    @Then("check that the carousel is displayed")
    public void checkThatTheCarouselIsDisplayed() {
        webPage.cekCarousel();
    }
    @Then("check that list categories is displayed")
    public void checkThatListCategoriesIsDisplayed() {
        webPage.cekListCat();
    }
    @Then("check that product column is displayed")
    public void checkThatProductColumnIsDisplayed() {
        webPage.cekListPro();
    }
    @And("user click Home link on navbar")
    public void userClickHomeLinkOnNavbar() {
        webPage.clickHome();
    }
    @And("user click Contact link on navbar")
    public void userClickContactLinkOnNavbar() {
        webPage.clickContact();
    }
    @Then("user see pop up message form")
    public void userSeePopUpMessageForm() {
        webPage.popUpContact();
    }
    @And("user click close message form")
    public void userClickCloseMessageForm() {
        webPage.closePopUp();
    }
    @And("user click About us link on navbar")
    public void userClickAboutUsLinkOnNavbar() {
        webPage.clickAbout();
    }
    @And("user click video")
    public void userClickVideo() {
        webPage.clickVideo();
    }
    @Then("user see pop up and play video about us")
    public void userSeePopUpVideoAboutUs() {
        webPage.popUpVideo();
    }
    @And("user click close about us pop up")
    public void userClickCloseAboutUsPopUp() {
        webPage.closeVideo();
    }
    @And("user click Cart link on navbar")
    public void userClickCartLinkOnNavbar() {
        webPage.clickCart();
    }
    @Then("user see cart product list")
    public void userSeeCartProductList() {
        webPage.tableProducts();
    }
    @Then("user back to homepage")
    public void userBackToHomepage() {
        webPage.cekCarousel();
    }
    @And("user input contact email {string}")
    public void userInputContactEmail(String userEmail) {
        webPage.inputEmail(userEmail);
    }
    @And("user input contact name {string}")
    public void userInputContactName(String userNama) {
        webPage.inputName(userNama);
    }
    @And("user input message {string}")
    public void userInputMessage(String typeText) {
        webPage.emailContent(typeText);
    }
    @And("user click Send message button")
    public void userClickSendMessageButton() {
        webPage.clickSend();
    }
    @Then("user see alert {string}")
    public void userSeePopUpAlert(String alertText) {
        webPage.verifyAlertText(alertText);
    }
    @And("user click Oke button")
    public void userClickOkeButton() {
        webPage.acceptAllert();
    }
    @And("user click sign up link on navbar")
    public void userClickSignUpLinkOnNavbar() {
        webPage.clickSignUp();
    }
    @And("user input right username and password")
    public void userInputRightUsernameAndPassword() {
        webPage.createAndFill();
    }
    @And("user input username and password created")
    public void userInputUsernameAndPasswordCreated() {
        webPage.userNameNew();
        webPage.passWordNew();
    }
    @And("user signup username {string}")
    public void userSignupUsername(String nama) {
        webPage.userNameSU(nama);
    }
    @And("user signup password {string}")
    public void userSignupPassword(String pass) {
        webPage.userPassSU(pass);
    }
    @And("user input username {string}")
    public void userInputUsername(String nama) {
        webPage.userName(nama);
    }
    @And("user input password {string}")
    public void userInputPassword(String pswd) {
        webPage.passWord(pswd);
    }
    @And("user clear input password")
    public void userClearInputPassword() {
        webPage.clearPassWord();
    }
    @And("user clear input username")
    public void userClearInputUsername() {
        webPage.clearUserName();
    }
    @And("user click sign up button")
    public void userClickSignUpButton() {
        webPage.clickSignButton();
    }
    @And("user click Log in link on navbar")
    public void userClickLogInLinkOnNavbar() {
        webPage.clickLogIn();
    }
    @And("user click Log in button")
    public void userClickLogInButton() {
        webPage.clickLogInButton();
    }
    @Then("user will see right welcome message on navbar")
    public void userWillSeeRightWelcomeMessageOnNavbar() {
        webPage.verifWelcoming();
    }
    @And("user click Log out button")
    public void userClickLogOutButton() {
        webPage.clickLogOut();
    }

    @Then("user see Log in button again")
    public void userSeeLogInButtonAgain() {
        webPage.seeLoginLink();
    }

    @And("user click product {string}")
    public void userClickProduct(String productName) {
        webPage.clickProduct(productName);
    }
    @And("user click product no login {string}")
    public void userClickProductNoLogin(String nama) {
        webPage.clickProductNoLogin(nama);
    }

    @Then("user see product detail")
    public void userSeeProductDetail() {
        webPage.verifProdDetail();
    }

    @And("user click Add to cart button")
    public void userClickAddToCartButton() {
        webPage.clickAddCartButton();
    }

    @And("user click Laptop link on categories")
    public void userClickLaptopLinkOnCategories() {
        webPage.clickCatLaptop();
    }

    @Then("verify cart item is match {int}")
    public void verifyCartItemIsMatch(int qtty) {
        webPage.verifItemQtty(qtty);
    }

    @And("user click Place order button")
    public void userClickPlaceOrderButton() {
        webPage.clickOrder();
    }

    @And("user fills out order form completely")
    public void userFillsOutOrderFormCompletely() {
        webPage.inputNameOrder();
        webPage.inputCountryOrder();
        webPage.inputCityOrder();
        webPage.inputCardOrder();
        webPage.inputMonthOrder();
        webPage.inputYearOrder();
    }

    @And("user click button Purchase")
    public void userClickButtonPurchase() {
        webPage.clickPurchaseBttn();
    }

    @Then("user see pop up with message {string}")
    public void userSeePopUpWithMessage(String text) {
        webPage.seePopUpThanks(text);
    }

    @Then("verify order amount is {string}")
    public void verifyOrderAmountIs(String price) {
        webPage.verifyAmountPurch(price);
    }

    @And("user remove item from cart")
    public void userRemoveItemFromCart() {
        webPage.deleteItemCart();
    }

    @Then("verify left cart item is match {int}")
    public void verifyLeftCartItemIsMatch(int qtty) {
        webPage.verifLeftItemQtty(qtty);
    }

}


// ------------------------------------------------------------------------