import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("")

WebUI.maximizeWindow()

WebUI.navigateToUrl("https://www.amazon.in/")

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Search item'))

WebUI.setText(findTestObject('Object Repository/Item Add to Cart/Search item'), "shoes for men")

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Click search'))

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Select deliver day'))

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Select shoe brand'))

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Select all discounts'))

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Select top brands'))

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Select size'))

WebUI.click(findTestObject('Object Repository/Item Add to Cart/Select color'))

//WebUI.click(findTestObject('Object Repository/Item Add to Cart/Click on available shoe'))

//WebUI.click(findTestObject('Object Repository/Item Add to Cart/Click on Add to Cart'))

//WebUI.closeBrowser()
	
