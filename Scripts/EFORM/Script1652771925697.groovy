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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://10.2.62.243:8080/E-Form_Public/web_eform/home')

WebUI.delay(2)

WebUI.click(findTestObject('Page_e-Form  PT. Bank KB Bukopin Tbk/Layanan Teller'))

WebUI.click(findTestObject('Page_e-Form  PT. Bank KB Bukopin Tbk/a_Tarik Tunai'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_e-Form  PT. Bank KB Bukopin Tbk/span_--Pilih Jenis Rekening--'))

WebUI.setText(findTestObject('Page_e-Form  PT. Bank KB Bukopin Tbk/span_TABUNGAN'), 'Tabungan')

WebUI.sendKeys(findTestObject('Page_e-Form  PT. Bank KB Bukopin Tbk/span_TABUNGAN'), Keys.chord(Keys.ENTER))

