package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TestNGExamPage;

import util.BrowserFactory;

public class TestNgExamTest {

	WebDriver driver ;
	@BeforeMethod
	public void beforetest() {
		driver = BrowserFactory.init();
	}
	@Test
	public void addCategoryTest () {
		
		TestNGExamPage page = PageFactory.initElements(driver, TestNGExamPage.class);
		String categoryInput = "TechfiosBoufa";// input shouldn't be on the category list
	page.addCategory(categoryInput);
	page.clickOnAddCategoryButton();
	page.verifyCategoryadded(categoryInput);
	
	BrowserFactory.teardown();
}
	
	@Test
	public void noDuplicateCategoryTest () {
		System.out.println("hello 1213132");
		
		TestNGExamPage page = PageFactory.initElements(driver, TestNGExamPage.class);
		
	String categoryInput = "TechfiosBoufa2";// input shouldn't be on the category list
	page.addCategory(categoryInput);
	page.clickOnAddCategoryButton();
	page.addCategory(categoryInput);
	page.clickOnAddCategoryButton();
	page.verifyCategorynotduplicated(categoryInput);
	
	
	BrowserFactory.teardown();
}
	@Test
	public void verifyAllMonthsExistOnTheDropListTest () {
		
		TestNGExamPage page = PageFactory.initElements(driver, TestNGExamPage.class);
		page.verifyAllMonthsExistOnTheDropList();
		BrowserFactory.teardown();
	}

}

