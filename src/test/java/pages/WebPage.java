package pages;

import helper.Utility;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static helper.Utility.driver;

public class WebPage {
    public void openBrowser() {
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public boolean cekLogo() {
        boolean logoPresent = driver.findElement(By.xpath
                ("//img[@src='bm.png']")).isDisplayed();
        Assertions.assertThat(true);
        return logoPresent;
    }

    public boolean cekNavbar() {
        boolean navigPresent = driver.findElement(By.id
                ("navbarExample")).isDisplayed();
        Assertions.assertThat(true);
        return navigPresent;
    }

    public boolean cekCarousel() {
        boolean carousPresent = driver.findElement(By.xpath
                ("//img[@class='d-block img-fluid']")).isDisplayed();
        Assertions.assertThat(true);
        return carousPresent;
    }

    public boolean cekListCat() {
        boolean categListPresent = driver.findElement(By.id("cat")).isDisplayed();
        Assertions.assertThat(true);
        return categListPresent;
    }
    By listProduct = By.xpath("//div[@class='card-block']");
    public boolean cekListPro() {
        boolean prodListPresent = driver.findElement(listProduct).isDisplayed();
        Assertions.assertThat(true);
        return prodListPresent;
    }

    public void clickHome() {
        driver.findElement(By.xpath
                ("//a[@class='nav-link'][contains(.,'Home')]")).click();
    }

    public void clickContact() {
        driver.findElement(By.xpath
                ("//a[@class='nav-link'][contains(.,'Contact')]")).click();
    }

    public boolean popUpContact() {
        boolean popUp = driver.findElement(By.xpath
                ("//form[contains(.,'Contact Email:')]")).isDisplayed();
        Assertions.assertThat(true);
        return popUp;
    }

    public void closePopUp() {
        By byLocator = By.xpath("//button[contains(text(),'Close')]");
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(byLocator));
        driver.findElement(byLocator).click();
    }

    public void clickAbout() {
        driver.findElement(By.xpath
                ("//a[@class='nav-link'][contains(.,'About')]")).click();
    }

    public void clickVideo() {
        By byLocator = By.className("vjs-poster");
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.presenceOfElementLocated(byLocator));
        driver.findElement(byLocator).click();
    }

    public void popUpVideo() {
        By byLocator = By.tagName("video");
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.presenceOfElementLocated(byLocator));
        WebElement getElement = driver.findElement(byLocator);
        Assertions.assertThat(getElement.getAttribute("src").contains("blob"));
    }

    public void closeVideo() {
        By byLocator = By.xpath
                ("//div[@id='videoModal']//button[@type='button'][normalize-space()='Close']");
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(byLocator));
        driver.findElement(byLocator).click();
    }

    public void clickCart() {
        By byLocator = By.xpath("//a[@class='nav-link'][contains(.,'Cart')]");
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(byLocator));
        driver.findElement(byLocator).click();
    }

    public boolean tableProducts() {
        boolean table = driver.findElement(By.className("table-responsive")).isDisplayed();
        Assertions.assertThat(true);
        return table;
    }

    public void inputEmail(String email) {
        driver.findElement(By.id("recipient-email")).sendKeys(email);
    }

    public void inputName(String nama) {
        driver.findElement(By.id("recipient-name")).sendKeys(nama);
    }

    public void emailContent(String emailText){
        driver.findElement(By.id("message-text")).sendKeys(emailText);
    }

    public void clickSend(){
        driver.findElement(By.xpath
                ("//button[normalize-space()='Send message']")).click();
    }

    public String getAlertMessage(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.alertIsPresent());
        String alertMssg = driver.switchTo().alert().getText();
        return alertMssg;
    }
    public void verifyAlertText(String alertText){
        String expectedMessage = alertText;
        System.out.println("expected = " + alertText);
        String getMessage = getAlertMessage();
        System.out.println("get = " + getMessage);
        Assertions.assertThat(expectedMessage).isEqualTo(getMessage);
    }
    public void acceptAllert(){
        driver.switchTo().alert().accept();
    }
    By signin = By.id("signin2");
    public void clickSignUp(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(signin));
        driver.findElement(signin).click();
    }
    String username;
    String password;
    public void createAndFill(){
        username = Utility.generateRandomEmail();
        password = Utility.generateRandomPass();
        System.out.println("Username = "+username);
        System.out.println("Password = "+password);
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.presenceOfElementLocated(By.id("sign-username")));
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.id("sign-password")).sendKeys(password);
    }
    public void userNameNew(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(By.id("loginusername")).sendKeys(username);
    }
    public void passWordNew(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(By.id("loginpassword")).sendKeys(password);
    }
    public void userNameSU(String user){
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(signin));
        driver.findElement(By.id("sign-username")).sendKeys(user);
    }
    public void userPassSU(String user){
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(signin));
        driver.findElement(By.id("sign-password")).sendKeys(user);
    }
    public void userName(String user){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(By.id("loginusername")).sendKeys(user);
    }
    public void passWord(String pass){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(By.id("loginpassword")).sendKeys(pass);
    }
    public void clearUserName(){
        driver.findElement(By.id("sign-username")).clear();
    }
    public void clearPassWord(){
        driver.findElement(By.id("sign-password")).clear();
    }
    By signUpButton = By.xpath("//button[normalize-space()='Sign up']");
    public void clickSignButton(){
        driver.findElement(signUpButton).click();
    }
    By logIn = By.id("login2");
    public void clickLogIn(){
        driver.findElement(logIn).click();
    }
    By loginBtn = By.xpath("//button[normalize-space()='Log in']");
    public void clickLogInButton(){
        driver.findElement(loginBtn).click();
    }
    By logOut = By.id("logout2");
    public boolean verifWelcoming(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(logOut));
        String expected = "Welcome "+username;
        String actual = driver.findElement(By.id("nameofuser")).getText();
        Assertions.assertThat(actual).isEqualTo(expected);
        System.out.println("Aktual = "+actual);
        System.out.println("Ekspektasi = "+expected);
        return true;
    }
    public void clickLogOut(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(logOut));
        driver.findElement(logOut).click();
    }
    public boolean seeLoginLink(){
        boolean loginLink = driver.findElement(logIn).isDisplayed();
        Assertions.assertThat(true);
        return loginLink;
    }
    By linkProduct(String productName) {
        return By.xpath
                ("//a[normalize-space()='"
                        +productName+"']");}
    public void clickProductNoLogin(String namaProduk){
        new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(signin));
        driver.findElement(linkProduct(namaProduk)).click();
    }
    public void clickProduct(String namaProduk){
        new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(logOut));
        driver.findElement(linkProduct(namaProduk)).click();
    }
    By productDesc = By.id("myTabContent");
    public boolean verifProdDetail(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.presenceOfElementLocated(productDesc));
        boolean prodDetail = driver.findElement(productDesc).isDisplayed();
        Assertions.assertThat(true);
        return prodDetail;
    }
    By buttonAddCart = By.xpath("//a[normalize-space()='Add to cart']");
    public void clickAddCartButton(){
        driver.findElement(buttonAddCart).click();
    }
    public void clickCatLaptop(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(logOut));
        driver.findElement(By.xpath("(//a[normalize-space()='Laptops'])")).click();
    }
    By itemListCart = By.xpath("//tbody/tr");
    public void verifItemQtty(int qtty){
        int expected = qtty;
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(itemListCart));
        List<WebElement> items = driver.findElements(itemListCart);
        int actual = items.size();
        Assertions.assertThat(expected).isEqualTo(actual);
    }
    public void clickOrder(){
        driver.findElement(By.xpath
                ("//button[normalize-space()='Place Order']")).click();
    }
    By buttonPurchase = By.xpath("//button[normalize-space()='Purchase']");
    By totalOrder = By.id("totalm");
    By nameOrder = By.id("name");
    By countryOrder = By.id("country");
    By cityOrder = By.id("city");
    By cardOrder = By.id("card");
    By monthOrder = By.id("month");
    By yearOrder = By.id("year");

    public void inputNameOrder(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.elementToBeClickable(buttonPurchase));
        driver.findElement(nameOrder).sendKeys("Adip sudip");
    }
    public void inputCountryOrder(){
        driver.findElement(countryOrder).sendKeys("Indonesia");
    }
    public void inputCityOrder(){
        driver.findElement(cityOrder).sendKeys("Surabaya");
    }
    public void inputCardOrder(){
        driver.findElement(cardOrder).sendKeys("45678906533");
    }
    public void inputMonthOrder(){
        driver.findElement(monthOrder).sendKeys("11");
    }
    public void inputYearOrder(){
        driver.findElement(yearOrder).sendKeys("2024");
    }
    public void clickPurchaseBttn(){
        driver.findElement(buttonPurchase).click();
    }
    public void seePopUpThanks(String text){
        String expectText = text;
        String actualText = driver.findElement(By.cssSelector("body > div:nth-child(19) > h2:nth-child(6)")).getText();
        System.out.println("expect: "+expectText);
        System.out.println("actual: "+actualText);
        Assertions.assertThat(actualText).isEqualTo(expectText);
    }
    public void verifyAmountPurch(String price){
        String expectAmount = "Amount: "+price+" USD";
        String getInfo = driver.findElement(By.xpath
                ("//p[contains(@class,'lead text-muted')]")).getText();
        String [] splitData =getInfo.split("\\r?\\n|\\r");
        String actualAmount = splitData[1];
//        String actualNumber = splitData[2];
//        String actualName = splitData[3];
//        String actualDate = splitData[4];
        System.out.println(actualAmount);
//        System.out.println(actualNumber);
//        System.out.println(actualName);
//        System.out.println(actualDate);
        Assertions.assertThat(actualAmount).isEqualTo(expectAmount);
    }

    By deleteItemCarTop = By.xpath("(//a[@href='#'][normalize-space()='Delete'])[1]");
    By deleteItemCar = By.xpath("(//a[@href='#'][normalize-space()='Delete'])");
    public void deleteItemCart(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(deleteItemCar));
        driver.findElement(deleteItemCarTop).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(deleteItemCar));
    }
    public void verifLeftItemQtty(int qtty){
        int expected = qtty;
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(deleteItemCar));
        List<WebElement> items = driver.findElements(deleteItemCar);
        int actual = items.size();
        Assertions.assertThat(expected).isEqualTo(actual);
    }

}
