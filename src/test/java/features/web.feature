Feature: Test Automation Web

  @web
  Scenario: Navigation - Homepage load complete
    Given open web login page
    Then check that website logo displayed
    Then check that navigation link displayed
    Then check that the carousel is displayed
    Then check that list categories is displayed
    Then check that product column is displayed

  @web
  Scenario: Navigation - Navigation bar normal functionality
    Given open web login page
    And user click Contact link on navbar
    Then user see pop up message form
    And user click close message form
    And user click About us link on navbar
    And user click video
    Then user see pop up and play video about us
    And user click close about us pop up
    And user click Cart link on navbar
    Then user see cart product list
    And user click Home link on navbar
    Then user back to homepage

  @web
  Scenario: Contact - Message normal
    Given open web login page
    And user click Contact link on navbar
    And user input contact email "adip@email.com"
    And user input contact name "adip"
    And user input message "thank you for the great product offer"
    And user click Send message button
    Then user see alert "Thanks for the message!!"
    And user click Oke button

#  @web
#  Scenario: Contact - Blank Contact Email message
#    Given open web login page
#    And user click Contact link on navbar
#    And user click Send message button
#    Then user see alert "Please fill out Contact Email"
#    And user click Oke button

  @web
  Scenario: Account - User sign up, log in, log out success
    Given open web login page
    And user click sign up link on navbar
    And user input right username and password
    And user click sign up button
    Then user see alert "Sign up successful."
    And user click Oke button
    And user click Log in link on navbar
    And user input username and password created
    And user click Log in button
    Then user will see right welcome message on navbar
    And user click Log out button
    Then user see Log in button again

  @web
  Scenario: Account - User sign up with existing user
    Given open web login page
    And user click sign up link on navbar
    And user signup username "adip_bala"
    And user signup password "sudip_pasti"
    And user click sign up button
    Then user see alert "This user already exist."
    And user click Oke button

  @web
  Scenario: Account - User sign up with blank username and/or password
    Given open web login page
    And user click sign up link on navbar
    And user signup password "sudip_pasti"
    And user click sign up button
    Then user see alert "Please fill out Username and Password."
    And user click Oke button
    And user clear input password
    And user signup username "adip_beli"
    And user click sign up button
    Then user see alert "Please fill out Username and Password."
    And user click Oke button
    And user clear input username
    And user click sign up button
    Then user see alert "Please fill out Username and Password."

#  @web
#  Scenario: Add to cart - user can not add to cart without log in
#    Given open web login page
#    And user click product no login "Samsung galaxy s7"
#    Then user see product detail
#    And user click Add to cart button
#    Then user see alert "Please log in before add product to cart"

  @web
  Scenario: Cart and Checkout - user add to cart and checkout normal
    Given open web login page
    And user click Log in link on navbar
    And user input username "adip_bala"
    And user input password "sudip_pasti"
    And user click Log in button
    And user click product "Samsung galaxy s7"
    And user click Add to cart button
    Then user see alert "Product added."
    And user click Oke button
    And user click Home link on navbar
    And user click Laptop link on categories
    And user click product "MacBook Pro"
    And user click Add to cart button
    Then user see alert "Product added."
    And user click Oke button
    And user click Cart link on navbar
    Then verify cart item is match 2
    And user click Place order button
    And user fills out order form completely
    And user click button Purchase
    Then user see pop up with message "Thank you for your purchase!"
    Then verify order amount is "1900"

  @web
  Scenario: Add to cart - user add remove from cart normal
    Given open web login page
    And user click Log in link on navbar
    And user input username "adip_bala"
    And user input password "sudip_pasti"
    And user click Log in button
    And user click product "Samsung galaxy s7"
    And user click Add to cart button
    Then user see alert "Product added."
    And user click Oke button
    And user click Home link on navbar
    And user click product "Nokia lumia 1520"
    And user click Add to cart button
    Then user see alert "Product added."
    And user click Oke button
    And user click Home link on navbar
    And user click product "Nexus 6"
    And user click Add to cart button
    Then user see alert "Product added."
    And user click Oke button
    And user click Home link on navbar
    And user click Laptop link on categories
    And user click product "MacBook Pro"
    And user click Add to cart button
    Then user see alert "Product added."
    And user click Oke button
    And user click Cart link on navbar
#    Then verify cart item is match 4
    And user remove item from cart
    And user click Home link on navbar
    And user click Cart link on navbar
    Then verify left cart item is match 3
    And user click Place order button
    And user fills out order form completely
    And user click button Purchase
#  ----------------------------------------------
