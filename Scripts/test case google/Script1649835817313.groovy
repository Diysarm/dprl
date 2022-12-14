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

WebUI.openBrowser('Saucedemo.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('SauceDemo_Object/Page_Swag Labs/username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('SauceDemo_Object/Page_Swag Labs/password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('SauceDemo_Object/Page_Swag Labs/login_btn'))

WebUI.click(findTestObject('Object Repository/SauceDemo_Object/Produk/button_Add to cart_sauce lab backpack'))

WebUI.click(findTestObject('Object Repository/SauceDemo_Object/Produk/button_Add to cart_ sauce lab bike light'))

WebUI.click(findTestObject('SauceDemo_Object/Produk/shopping_cart'))

WebUI.click(findTestObject('SauceDemo_Object/Cart/button_Checkout'))

WebUI.setText(findTestObject('SauceDemo_Object/Cekot_information/input_Checkout Your Information_firstName'), 'anajai')

WebUI.setText(findTestObject('SauceDemo_Object/Cekot_information/input_Checkout Your Information_lastName'), 'ase')

WebUI.setText(findTestObject('SauceDemo_Object/Cekot_information/input_Checkout Your Information_postalCode'), '123332')

WebUI.click(findTestObject('SauceDemo_Object/Cekot_information/Continue_btn_cekotinformation'))

WebUI.click(findTestObject('SauceDemo_Object/cekot overview/button_Finish'))

WebUI.closeBrowser()

