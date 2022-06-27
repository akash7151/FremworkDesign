package com.cjc.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.utilitiy.Common;

public class AddToCard {
public AddToCard(WebDriver driver) {
	Common.driver=driver;
}
@FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a")
WebElement dress1;
@FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
WebElement dress2;
@FindBy(xpath = "//*[@id=\"add_to_cart\"]")
WebElement addcard1;
public void clickDress() throws InterruptedException {
	dress1.click();
	Thread.sleep(2000);
	dress2.click();
Thread.sleep(2000);
	addcard1.click();

}
}
