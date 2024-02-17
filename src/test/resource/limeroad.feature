Feature: limeroad functionality

Scenario: login funtionality
Given user able to view homepage
When user click the login button 
And user enter mobile number
And user click next button
And user enter otp
Then user can view home page

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
When user enter pincode
And user enter fullname
And user enter housenumber
And user enter landmark
And user enter city
And user enter state
And user click on office
And user select creditcard option
And user enter card number
And user enter card name
And user enter expirydate,expirymonth and cvv
Then user click on confirmorder
