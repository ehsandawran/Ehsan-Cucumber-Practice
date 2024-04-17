package com.ehsan.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ehsan.utils.Hooks;

public class PracticePage extends Hooks {

	@FindBy(id = "bmwradio")
	WebElement bmwRadio;

	@FindBy(id = "benzradio")
	WebElement benzRadio;

	@FindBy(id = "hondaradio")
	WebElement hondaRadio;

	@FindBy(id = "bmwcheck")
	WebElement bmwCheck;

	@FindBy(id = "benzcheck")
	WebElement benzCheck;

	@FindBy(id = "hondacheck")
	WebElement hondaCheck;

	@FindBy(id = "openwindow")
	WebElement openWindow;

	@FindBy(id = "opentab")
	WebElement openTab;

	@FindBy(id = "carselect")
	WebElement carSelect;

	@FindBy(id = "multiple-select-example")
	WebElement multipleSelect;

	@FindBy(id = "autosuggest")
	WebElement textFiled1;

	@FindBy(id = "disabled-button")
	WebElement disableText2;

	@FindBy(id = "enabled-button")
	WebElement enableText2;

	@FindBy(id = "enabled-example-input")
	WebElement textField2;

	@FindBy(id = "hide-textbox")
	WebElement hideTextField3;

	@FindBy(id = "show-textbox")
	WebElement showTextField3;

	@FindBy(id = "displayed-text")
	WebElement textField3;

	@FindBy(id = "name")
	WebElement textField4;

	@FindBy(id = "alertbtn")
	WebElement alertButton1;

	@FindBy(id = "confirmbtn")
	WebElement alertButton2;

	@FindBy(id = "mousehover")
	WebElement mouseHover;

	public PracticePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickRadios() {
		bmwRadio.click();
		benzRadio.click();
		hondaRadio.click();
	}

	public void clickCheks() {
		bmwCheck.click();
		benzCheck.click();
		hondaCheck.click();
	}

	public void openWindow() throws InterruptedException {
		String mainWindowHandle = driver.getWindowHandle();
		openWindow.click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			// Switch to the new window
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		driver.switchTo().window(mainWindowHandle);
	}

	public void openTab() throws InterruptedException {
		String mainWindowHandle = driver.getWindowHandle();
		openTab.click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String handle : allWindowHandles) {
			// Switch to the new window
			if (!handle.equals(mainWindowHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		driver.switchTo().window(mainWindowHandle);
	}

	public void selectCar(String model) {
		Select s = new Select(carSelect);
		s.selectByVisibleText(model);
	}

	public void selectAllFruits() {
		Select s = new Select(multipleSelect);
		s.selectByVisibleText("Apple");
		s.selectByVisibleText("Orange");
		s.selectByVisibleText("Peach");
	}

	public void sendText1(String text) {
		textFiled1.sendKeys(text);
	}

	public void enableDisable(String text) {
		disableText2.click();
		enableText2.click();
		textField2.sendKeys(text);
	}

	public void shoeHide(String text) {
		hideTextField3.click();
		showTextField3.click();
		textField3.sendKeys(text);

	}

	public void alert(String text) throws InterruptedException {
		textField4.sendKeys(text);
		Thread.sleep(2000);
		alertButton1.click();
		driver.switchTo().alert().accept();
		alertButton2.click();
		driver.switchTo().alert().dismiss();
	}

	public void mouseHover() {
		Actions a = new Actions(driver);
		a.moveToElement(mouseHover);
	}

}
