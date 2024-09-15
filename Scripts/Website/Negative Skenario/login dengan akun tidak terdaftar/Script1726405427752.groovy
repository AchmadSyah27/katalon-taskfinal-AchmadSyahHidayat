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

WebUI.callTestCase(findTestCase('Website/Positive Skenario/AksesHalaman_JuiceShop'), [:], FailureHandling.STOP_ON_FAILURE)

'Menunggu label header juice shop muncul'
WebUI.waitForElementVisible(findTestObject('Website/Page_Beranda/label_headerJuiceShop'), 0)

'Melakukan klik pada button account'
WebUI.click(findTestObject('Website/Page_Beranda/button_Account'))

'Melakukan klik pada button account'
WebUI.click(findTestObject('Website/Page_Beranda/button_navbarLogin'))

'Menunggu label header login muncul'
WebUI.waitForElementVisible(findTestObject('Website/Page_Login/label_headerLogin'), 0)

'Memastikan textbox email muncul'
WebUI.verifyElementPresent(findTestObject('Website/Page_Login/textbox_email'), 0)

'Memastikan textbox password'
WebUI.verifyElementPresent(findTestObject('Website/Page_Login/textbox_password'), 0)

'Memastikan textbox password'
WebUI.verifyElementPresent(findTestObject('Website/Page_Login/button_login'), 0)

'Menginput email dari data test file excel'
WebUI.sendKeys(findTestObject('Website/Page_Login/textbox_email'), findTestData('DataTest').getValue(2, 2))

'Menginput password dari data test file excel'
WebUI.sendKeys(findTestObject('Website/Page_Login/textbox_password'), findTestData('DataTest').getValue(3, 2))

'Memastikan button login dapat di klik'
WebUI.verifyElementClickable(findTestObject('Website/Page_Login/button_login'))

'Melakukan klik pada button login'
WebUI.click(findTestObject('Website/Page_Login/button_login'))

'Memastikan label error salah email atau password muncul'
WebUI.verifyElementPresent(findTestObject('Website/Page_Login/label_salahEmailAtauPass'), 0)

'Melakukan screenshot halaman login dengan akun tidak terdaftar'
WebUI.takeScreenshot('Screenshot/Website/loginAkunTidakTerdaftar.png')

'Melakukan close browser'
WebUI.closeBrowser()

