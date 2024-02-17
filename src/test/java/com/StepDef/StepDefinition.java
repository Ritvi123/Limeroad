package com.StepDef;

import com.Base.Baseclass;
import com.Pom.LoginPage;
import com.Pom.Paymentpage;
import com.Pom.Productpage;
import com.Pom.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass {
	 LoginPage lp;
	 Searchpage sp;
	 Productpage pp;
	 Paymentpage p;
	 
	@Given("user able to view homepage")
	public void user_able_to_view_homepage() {
	    setUp("chrome");
	    launchUrl("https://www.limeroad.com/");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	     lp = new LoginPage();
	     lp.clicklogin();
	}
	@When("user enter mobile number as {string}")
	public void user_enter_mobile_number(String String) {
	    lp.entermobilenumber(String);
	}

	@When("user click next button")
	public void user_click_next_button() {
	    lp.clicknext();
	}

	@When("user enter otp")
	public void user_enter_otp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can view home page")
	public void user_can_view_home_page() {
	    
		
	}

	@Given("user view the homepage")
	public void user_view_the_homepage() {
	    if(gettitle().equals("")) {
	    	System.out.println("user is in homepage");
	    	
	    }
	}

	@When("user mouseover on kids and click on dresses&frocks")
	public void user_mouseover_on_kids_and_click_on_dresses_frocks() {
	     sp=new Searchpage();
	    sp.selectdress();
	    
	}

	@Then("user view related products")
	public void user_view_related_products() {
	    sp.clickHighprice();
	}

	@Given("user click on the product")
	public void user_click_on_the_product() {
	    
		 pp=new Productpage();
		pp.clickproduct();
	}

	@When("user has to select size of the product")
	public void user_has_to_select_size_of_the_product() {
	   pp.clicksize();
	}

	@When("user click on addtocart button")
	public void user_click_on_addtocart_button() {
	    pp.addtocart();
	}

	@Then("user click on buynow button")
	public void user_click_on_buynow_button() {
	    pp.clickbuy();
	}

	@Given("user has to enter delivery details")
	public void user_has_to_enter_delivery_details() {
	     p =new Paymentpage();
	    
	}

	@When("user enter pincode as {string}")
	public void user_enter_pincode(String pin) {
	    p.enterpincode(pin);
	}

	@When("user enter fullname as {string}")
	public void user_enter_fullname(String string) {
	    p.enterName(string);
	}

	@When("user enter housenumber as\"{int}-{int}\"")
	public void user_enter_housenumber(String string) {
	   p.enterhousenumber(string);
	}

	@When("user enter landmark as {string}")
	public void user_enter_landmark(String string) {
	    p.enterlandmark(string);
	}

	@When("user enter city as {string}")
	public void user_eneter_city(String string) {
		p.entercity(string);
	    	}

	@When("user enter state as {string}")
	public void user_enter_state(String string) {
	   p.enterstate(string);
	}

	@When("user click on office")
	public void user_click_on_office() {
	   p.selectoffice();
	}

	@When("user select creditcard option")
	public void user_select_creditcard_option() {
	    p.clickcreditcard();
	}

	@When("user enter card number as {string}")
	public void user_enter_card_number(String cardnum) {
	    p.entercardnumber(cardnum);
	}

	@When("user enter card name as {string}")
	public void user_enter_card_name(String cardname) {
	    p.entercardname(cardname);
	}

	@When("user enter expirydate,expirymonth and cvv as {string}")
	public void user_enter_expirydate_expirymonth_and_cvv() {
	   
	}

	@Then("user click on confirmorder")
	public void user_click_on_confirmorder() {
	   p.clickconfirm();
	}
}


