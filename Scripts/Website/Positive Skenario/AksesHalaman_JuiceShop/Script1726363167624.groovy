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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

'Membuka Browser'
WebUI.openBrowser('')

'Membuat tampilan menjadi fullscreen'
WebUI.maximizeWindow()

'Menuju ke halaman juice shop'
WebUI.navigateToUrl(GlobalVariable.webURL)

'Menunggu label header juice shop muncul'
WebUI.waitForElementVisible(findTestObject('Website/Page_Beranda/label_headerJuiceShop'), 0)

'Melakukan terima semua alert'
WebUI.click(findTestObject('Website/Page_Beranda/button_dismissWelcomeOWASPJuiceShop'))

'Melakukan klik pada button dismiss cookie'
WebUI.click(findTestObject('Website/Page_Beranda/button_dismissCookies'))

'Memastikan button toggle menu muncul'
WebUI.verifyElementVisible(findTestObject('Website/Page_Beranda/Button_toggleMenu'))

'Memastikan button search produk muncul'
WebUI.verifyElementVisible(findTestObject('Website/Page_Beranda/button_searchProduk'))

'Memastikan button account muncul'
WebUI.verifyElementVisible(findTestObject('Website/Page_Beranda/button_Account'))

'Memastikan button ganti bahasa muncul'
WebUI.verifyElementVisible(findTestObject('Website/Page_Beranda/button_gantiBahasa'))

'Memastikan label semua produk muncul'
WebUI.verifyElementVisible(findTestObject('Website/Page_Beranda/label_allProduct'))

'Melakukan screenshot halaman beranda'
WebUI.takeScreenshot('Screenshot/Website/homepage.png')

