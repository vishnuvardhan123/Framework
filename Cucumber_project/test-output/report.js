$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Loginvalidate.feature");
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
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca class\u003d\"nav-link\" href\u003d\"/logout\"\u003e...\u003c/a\u003e is not clickable at point (1160, 28). Other element would receive the click: \u003cdiv id\u003d\"ajaxBusy\" style\u003d\"display: block;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d99.0.4844.84)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027NISL-TEST4\u0027, ip: \u0027192.168.1.17\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_301\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.84, chrome: {chromedriverVersion: 98.0.4758.80 (7f0488e8ba0d8..., userDataDir: C:\\Users\\TESTLA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51261}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c1a33e6995739c8a6a41a82ea8ee4445\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat pages.LoginPage.logout(LoginPage.java:59)\r\n\tat stepdefinations.LoginTest.validating_the_loginpage(LoginTest.java:58)\r\n\tat ✽.validating the loginpage(file:///C:/Users/Testlaptop4/eclipse-workspace/Cucumber_project/./Features/Loginvalidate.feature:15)\r\n",
  "status": "failed"
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