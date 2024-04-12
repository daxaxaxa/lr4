package utils;

import org.openqa.selenium.By;

public interface Locators {
    interface HomePage {
        By INDUSTRIES_BUTTON = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30nav']/nav[@id='u30navw1']/ul[@class='u30navul']/li[2]/button[@id='industries1']");
        By PRODUCTS_BUTTON = By.xpath("//*[@id=\"products1\"]");
        By SEARCH_ICON = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30tools']/div[@id='u30search']/button[@id='u30searchBtn']");
        By SEARCH_INPUT = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30tools']/div[@id='u30search']/div[@id='u30searchw1']/div[@id='u30searchw2']/form[@id='u30searchForm']/div[@class='u30s1']/span[@class='u30input']/div[@class='u30inputw1']/input[@id='u30input']");
        By VIEW_ACCOUNTS_BUTTON = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30tools']/div[@id='u30-profile']/button[@id='u30-flyout']");
    }

    interface ProductsPage {
        By ORACLE_INDUSTRY_LAB = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30nav']/nav[@id='u30navw1']/ul[@class='u30navul']/li[2]/div[@id='industries2']/div[@class='u30navw3 four-column-tworow-vertical']/div[@id='industries-nav']/ul[@class='tworow']/li[1]/ul[@id='industry-solutions-resources']/li[1]/a");
        By AI_AND_MACHINE_LEARNING_LINK = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30nav']/nav[@id='u30navw1']/ul[@class='u30navul']/li[1]/div[@id='products2']/div[@class='u30navw3 four-column-tworow-vertical']/div[@id='products-nav']/ul[@class='tworow']/li[1]/ul[@id='cloud-infrastructure']/li[2]/a");
    }

    interface SearchResultsPage {
        By JAVA_DOWNLOADS_TITLE = By.xpath("//h1[contains(text(),'Java Downloads | Oracle')]");
    }

    interface SignInPage {
        By SIGN_IN_BUTTON = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30tools']/div[@id='u30-profile']/div[@id='u30-profilew1']/ul[@class='u30l-out']/li[1]/a[@class='u30darkcta']");
        By EMAIL_INPUT = By.xpath("/html[@class='history hashchange cssgradients rgba no-touch boxshadow hasjs haspushstate retina']/body[@class='f17 f17v2']/div[@class='f17w1']/div[@class='cb41 cb41v0']/div[@class='cb41w1'][1]/form/ul/li[1]/div[@class='cb41w2 cb41focus']/input[@id='sso_username']");
        By PASSWORD_INPUT = By.xpath("/html[@class='history hashchange cssgradients rgba no-touch boxshadow hasjs haspushstate retina']/body[@class='f17 f17v2']/div[@class='f17w1']/div[@class='cb41 cb41v0']/div[@class='cb41w1'][1]/form/ul/li[2]/div[@class='cb41w3']/input[@id='ssopassword']");
        By ACC_SING_IN_BUTTON = By.xpath("/html[@class='history hashchange cssgradients rgba no-touch boxshadow hasjs haspushstate retina']/body[@class='f17 f17v2']/div[@class='f17w1']/div[@class='cb41 cb41v0']/div[@class='cb41w1'][1]/form/div[@class='cb41w4']/span/input[@id='signin_button']");
        By MY_ACC_BUTTON = By.xpath("/html[@class='js w11ready']/body[@class='rwtheme-oci f20 f20v0 ready']/div[@id='__next']/div[@class='f20w1']/section[@id='u30']/div[@id='u30w1']/div[@id='u30tools']/div[@id='u30-profile']/div[@id='u30-profilew1']/ul[@class='u30l-in']/li[1]/a");

    }
}
