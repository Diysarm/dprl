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

WebUI.navigateToUrl('http://10.2.62.229:8080/')

WebUI.delay(20)

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/Menu Aplikasi Pendukung'), 0)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/Menu Aplikasi Pendukung'))

WebUI.verifyElementVisible(findTestObject('Page_Welcome to BUKIWEB/Menu Ecomitte DPRL'))

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/Menu Ecomitte DPRL'), 0)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/Menu Ecomitte DPRL'))

WebUI.verifyElementVisible(findTestObject('Page_Welcome to BUKIWEB/Menu Input PO,PORSP'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/Menu Input PO,PORSP'), 0)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/Menu Input PO,PORSP'))

WebUI.verifyElementVisible(findTestObject('Page_Welcome to BUKIWEB/Menu Input PO'))

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/Menu Input PO'), 0)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/Menu Input PO'))

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputNoKartu'), InputNoKartu)

CustomKeywords.'upload.tesupload.uploadFile'(findTestObject('Page_Welcome to BUKIWEB/Button_upload'), 'D:\\tes katalon\\test.pdf')

WebUI.delay(2)

WebUI.verifyTextPresent('VISA PLATINUM', false)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputNamaDebitur'), InputNamaDebitur)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputOpencard'), '12/04/2022')

WebUI.selectOptionByValue(findTestObject('Page_Welcome to BUKIWEB/Input Bucket'), InputBucket, false)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputCreditLimit'), InputCreditLimit)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/InputNamaDebitur'))

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputMinPayment'), InputMinPayment)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputPOBalance'), InputPOBalance)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputTotalPembayaran'), InputTotalPembayaran)

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/InputCreditLimit'), 0)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/button_Hitung'))

WebUI.selectOptionByValue(findTestObject('Page_Welcome to BUKIWEB/Leveljabatan'), 'DIR', false)

WebUI.selectOptionByValue(findTestObject('Page_Welcome to BUKIWEB/Alasan'), 'CH MENINGGAL', false)

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/Leveljabatan'), 0)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputCharge'), InputCharge)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputInterest'), InputInterest)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputRetail'), InputRetail)

WebUI.setText(findTestObject('Page_Welcome to BUKIWEB/InputCash'), InputCash)

WebUI.scrollToElement(findTestObject('Page_Welcome to BUKIWEB/InputCash'), 0)

WebUI.click(findTestObject('Page_Welcome to BUKIWEB/button_Save'))

