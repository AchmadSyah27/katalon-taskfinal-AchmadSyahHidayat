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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

'Precondition: user sudah berada di halaman todo'
WebUI.callTestCase(findTestCase('Mobile/OpenApp'), [:], FailureHandling.STOP_ON_FAILURE)

'Memastikan label header todo muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_Todo/label_headerTodo'), 0)

'Memastikan button tambah task muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_Todo/button_addTask'), 0)

'Melakukan screenshotlayar todo'
Mobile.takeScreenshot('Screenshot/Mobile/layarTodo.png', FailureHandling.STOP_ON_FAILURE)

'Melakukan tap button tambah task'
Mobile.tap(findTestObject('Mobile/Page_Mobile/Page_Todo/button_addTask'), 0)

'Memastikan textbox enter task title muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_addTask/textbox_enterTaskTitle'), 0)

'Memastikan textbox enter your task muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_addTask/textbox_enterYourTask'), 0)

'Melakukan submit textbox task title'
Mobile.sendKeys(findTestObject('Mobile/Page_Mobile/Page_addTask/textbox_enterTaskTitle'), 'Go to bank')

'Melakukan submit textbox your task'
Mobile.sendKeys(findTestObject('Mobile/Page_Mobile/Page_addTask/textbox_enterYourTask'), 'Mengendarai Motor')

'Melakukan tap pada textbox set date'
Mobile.tap(findTestObject('Mobile/Page_Mobile/Page_addTask/textbox_setDate'), 0)

'Melakukan tap pada button ok di set date'
Mobile.tap(findTestObject('Mobile/Page_Mobile/Page_addTask/button_setDateOK'), 0)

'Melakukan screenshot inputan task baru'
Mobile.takeScreenshot('Screenshot/Mobile/layarInputanTaskBaru.png', FailureHandling.STOP_ON_FAILURE)

'Melakukan tap pada button tambah task'
Mobile.tap(findTestObject('Mobile/Page_Mobile/Page_addTask/button_tambahTask'), 0)

'Memastikan task baru berhasil ditambah muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_Todo/Button_newTask'), 0)

'Melakukan screenshot task baru muncul'
Mobile.takeScreenshot('Screenshot/Mobile/TaskBaruMuncul.png', FailureHandling.STOP_ON_FAILURE)

