# Yandex authorization testing

Testing the authorization on Yandex with existing input data using Selenium 

## Test Environment: used software

JDK v.16.0.2, Selenium Server (Grid) v.4.1.2, Webdriver for Chrome v.99.0.4844.51, ChroPath v.6.1.12,
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

### Chrome Snapshot
![alt-text](https://github.com/egkulikova/YandexLogTest/blob/6ea6576710da521a53a4df122d8991f9d7da2f8f/snap.png) "Сhrome browser is controlled by automated test software"

### Video
![alt-text](https://github.com/egkulikova/YandexLogTest/blob/cdc5156c38869ee0e9dd075c9285b6eb3ec1e820/test_run.mp4) "Autotest running"

## File set
1. Java classes. Links: [LoginPage class](https://github.com/egkulikova/YandexLogTest/blob/6ea6576710da521a53a4df122d8991f9d7da2f8f/src/test/java/LoginPage.java), [LoginTest class](https://github.com/egkulikova/YandexLogTest/blob/6ea6576710da521a53a4df122d8991f9d7da2f8f/src/test/java/LoginTest.java),<br/> [ProfPage class](https://github.com/egkulikova/YandexLogTest/blob/6ea6576710da521a53a4df122d8991f9d7da2f8f/src/test/java/ProfPage.java)
2. Chromedriver.exe. Link: [Selenium webdriver for Chrome](https://github.com/egkulikova/YandexLogTest/blob/6ea6576710da521a53a4df122d8991f9d7da2f8f/chromedriver.exe)
3. POM xml file with added dependencies. Link: [Project Object Model xml file](https://github.com/egkulikova/YandexLogTest/blob/6ea6576710da521a53a4df122d8991f9d7da2f8f/pom.xml)
