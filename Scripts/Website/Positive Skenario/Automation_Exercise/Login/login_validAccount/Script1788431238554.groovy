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

'Membuka browser'
WebUI.openBrowser('')

'Memaksimalkan ukuran layar browser'
WebUI.maximizeWindow()

'Menuju URL'
WebUI.navigateToUrl(GlobalVariable.WebAutomation)

'Menunggu halaman beranda tampil'
WebUI.waitForElementPresent(findTestObject('Website/Automation_Excercise/Page_Beranda/label_home'), 0)

'Memastikan menu login tampil'
WebUI.verifyElementPresent(findTestObject('Website/Automation_Excercise/Page_Beranda/label_SignupLogin'), 0)

'Melakukan klik pada menu login'
WebUI.click(findTestObject('Website/Automation_Excercise/Page_Beranda/label_SignupLogin'), FailureHandling.STOP_ON_FAILURE)

'Menunggu form login tampil'
WebUI.waitForElementPresent(findTestObject('Website/Automation_Excercise/Page_LoginRegister/label_loginAccount'), 0)

'Memastikan textbox username tampil'
WebUI.verifyElementPresent(findTestObject('Website/Automation_Excercise/Page_LoginRegister/textbox_emailUsername'), 0)

'Melakukan input username'
WebUI.sendKeys(findTestObject('Website/Automation_Excercise/Page_LoginRegister/textbox_emailUsername'), GlobalVariable.email)

'Melakukan input password'
WebUI.sendKeys(findTestObject('Website/Automation_Excercise/Page_LoginRegister/textbox_password'), GlobalVariable.passowrd)

'Melakukan klik pada button login'
WebUI.click(findTestObject('Website/Automation_Excercise/Page_LoginRegister/button_login'), FailureHandling.STOP_ON_FAILURE)

'Menunggu button logout tampil'
WebUI.waitForElementPresent(findTestObject('Website/Automation_Excercise/Page_Beranda/label_logout'), 0)

'Memastikan label berhasil login tampil'
WebUI.verifyElementPresent(findTestObject('Website/Automation_Excercise/Page_Beranda/label_userLogged'), 0)

'Menutup browser'
WebUI.closeBrowser()