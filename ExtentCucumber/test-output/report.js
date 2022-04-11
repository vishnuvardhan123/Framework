$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Homepage.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "backround steps",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_can_view_Dashboad()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_Add_new_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "backround steps",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_can_view_Dashboad()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by EMailID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer EMail",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.enter_customer_EMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Email in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_should_found_Email_in_the_Search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "backround steps",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_enters_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Dashboad",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_can_view_Dashboad()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Customer by Name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_customers_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer FirstName",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.enter_customer_FirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter customer LastName",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.enter_customer_LastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should found Name in the Search table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.user_should_found_Name_in_the_Search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.HomepageTest.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/Features/Loginvalidate.feature");
formatter.feature({
  "name": "Login validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating applicaion login with vaild details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "when user opens chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.LoginTest.when_user_opens_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_opens_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating the loginpage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.LoginTest.validating_the_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Datadriven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "when user opens chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters email as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.step({
  "name": "validating the loginpage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin1"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Datadriven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "when user opens chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.LoginTest.when_user_opens_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_opens_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating the loginpage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.LoginTest.validating_the_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Datadriven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "when user opens chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.LoginTest.when_user_opens_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_opens_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"admin@yourstore.com\" and password as \"admin1\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating the loginpage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.LoginTest.validating_the_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Datadriven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "when user opens chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinations.LoginTest.when_user_opens_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_opens_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"admin@yourstore.com\" and password as \"admin2\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinations.LoginTest.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validating the loginpage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinations.LoginTest.validating_the_loginpage()"
});
formatter.result({
  "status": "passed"
});
});