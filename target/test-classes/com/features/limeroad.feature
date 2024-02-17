Feature: limeroad functionality

Background: login funtionality
Given user able to view homepage


@SmokeTest
Scenario: login funtionality
Given user able to view homepage
#When user click the login button 
#And user enter mobile number as "9515182858"
#And user click next button
#And user enter otp
#Then user can view home page

@RegressionTest
Scenario: Search functionality
Given user view the homepage
When user mouseover on kids and click on dresses&frocks
Then user view related products


Scenario: Product functionality
Given user click on the product
When user has to select size of the product
And user click on addtocart button
Then user click on buynow button


Scenario: Payment functionality
Given user has to enter delivery details
When user enter pincode as "524126"
And user enter fullname as "Roopasree"
And user enter housenumber as"7-471"
And user enter landmark as "Rs waterplant"
And user enter city as "Tirupathi"
And user enter state as "AndhraPradesh"
And user click on office
And user select creditcard option
And user enter card number as "5011054488597827	"
And user enter card name as "Ram" 
And user enter expirydate,expirymonth and cvv as "12,2026 and 123"
Then user click on confirmorder
