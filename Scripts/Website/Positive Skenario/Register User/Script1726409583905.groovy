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

'Menunggu label not yet customer muncul'
WebUI.waitForElementVisible(findTestObject('Website/Page_Login/label_notYetCustomer'), 0)

'Melakukan klik pada label not yet customer'
WebUI.click(findTestObject('Website/Page_Login/label_notYetCustomer'), FailureHandling.STOP_ON_FAILURE)

'Memastikan textbox email muncul'
WebUI.verifyElementPresent(findTestObject('Website/Page_Registration/textbox_email'), 0)

'Memastikan textbox password muncul'
WebUI.verifyElementPresent(findTestObject('Website/Page_Registration/textbox_password'), 0)

'Memastikan textbox repeat password muncul'
WebUI.verifyElementPresent(findTestObject('Website/Page_Registration/textbox_repeatPassword'), 0)

'Menginput email dari data test file excel'
WebUI.sendKeys(findTestObject('Website/Page_Registration/textbox_email'), findTestData('DataTest').getValue(2, 4))

'Menginput password dari data test file excel'
WebUI.sendKeys(findTestObject('Website/Page_Registration/textbox_password'), findTestData('DataTest').getValue(3, 4))

'Menginput repeat password dari data test file excel'
WebUI.sendKeys(findTestObject('Website/Page_Registration/textbox_repeatPassword'), findTestData('DataTest').getValue(3, 
        4))

'Melakukan klik pada security question'
WebUI.click(findTestObject('Website/Page_Registration/dropdown_securityQuestion'), FailureHandling.STOP_ON_FAILURE)

'Memastikan dropdownlist question muncul'
WebUI.verifyElementPresent(findTestObject('Website/Page_Registration/dropdownlist_Question1'), 0)

'Melakukan klik pada salah satu security question'
WebUI.click(findTestObject('Website/Page_Registration/dropdownlist_Question1'), FailureHandling.STOP_ON_FAILURE)

'Menginput jawaban pada textbox anser dengan data test dari file excel'
WebUI.sendKeys(findTestObject('Website/Page_Registration/textbox_answer'), findTestData('DataTest').getValue(4, 4))

'Memastikan button login tidak dapat di klik'
WebUI.verifyElementClickable(findTestObject('Website/Page_Registration/button_register'))

'Melakukan screenshot halaman register sudah terisi'
WebUI.takeScreenshot('Screenshot/Website/inputanRegisterUser.png')

'Melakukan klik pada button register'
WebUI.click(findTestObject('Website/Page_Registration/button_register'), FailureHandling.CONTINUE_ON_FAILURE)

'Melakukan close browser'
WebUI.closeBrowser()

