@FlipkartProject
Feature: Flipkart Testing Program
#Background:
#Given Enter the URL
#And Login to Flipkart

	@GaminLaptops
	Scenario: Finding low price gaming laptop and add to cart
	
	Given Enter the URL "https://www.flipkart.com/"
	And Login to Flipkart
	When Move to Electronics
	And Move to Laptop and Desktop
	And Move to GamingLaptops and Click
	And Click the Lowest Price Laptop
	And Click Add to Cart
	Then Validte the Place order page

@MiTV
  Scenario: Finding low price mi tv and add to cart
    When Click the Appliances
    And Move to Tv and Appliances
    And Click the Mi Tv
    And Click the low price MiTv
    And Click add to cart
    Then Validate the Place order page

  @Sofas
  Scenario: Finding  High price sofa and add to cart
    When Click the Appliances
    And Move to Home and Furniture
    And Click the Sofa
    And Click the High price sofa
    And Click add to cart
    Then Validate the place order page

  @CoffeeMugs
  Scenario: Adding  High price sofa to cart
    When Click the Appliances
    And Move to Home and Furniture
    And Click the Coffee Mugs
    And Click the Low price Coffee Mugs
    And Click add to cart
    Then Validate the place order page