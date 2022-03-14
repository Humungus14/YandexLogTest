# Yandex authorization testing

Testing the authorization on Yandex with existing input data using Selenium 
___
##Author data 
___
Used software: JDK v.16.0.2, Selenium Server (Grid) v.4.1.2, Webdriver for Chrome v.99.0.4844.51, ChroPath v.6.1.12,
IntelliJ IDEA v.2021.3.2. OS: Windows 10 Pro

This simple autotest serves to imitate user activity: 
1. Opening [Yandex authorization page](https://passport.yandex.ru/auth) in Chrome 
2. Inputing positive and existing data
3. Switching to user profile menu (user icon) and loging out

This autotest is written as a Maven project, uses TestNG annotations. 
There are three Java classes: LoginTest, LoginPage, ProfPage. See their description below.

## Java classes

| Name        | Description                                                                                                                                                                                        |
|:------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `LoginPage` | Contains `@FindBy` annotations that provide search of element (login and password fields, login button) by XPath.<br/> Describes methods `inputLogin`, `inputPassword`,`clickButton`               |
| `ProfPage`  | Contains `@FindBy` annotations that provide search of element (user profile menu, logout button) by XPath.<br/>Describes methods `entryMenu`,`userLogout`                                          |
| `LoginTest` | Contains `@Test`,`@BeforeClass` and `@AfterClass` annotations. The `@BeforeClass` sets chromedriver, launches Chrome <br/>and after preparing the window switches to the Yandex authorization page |

###Chrome Snapshot
![alt-text](../snap.png) "Сhrome browser is controlled by automated test software"


##File set
1. Java classes. Links: [LoginPage class](../src/test/java/LoginPage.java), [LoginTest class](../src/test/java/LoginTest.java),<br/> [ProfPage class](../src/test/java/ProfPage.java)
2. Chromedriver.exe. Link: [Selenium webdriver for Chrome](../chromedriver.exe)
3. POM xml file with added dependencies. Link: [Project Object Model xml file](../pom.xml)