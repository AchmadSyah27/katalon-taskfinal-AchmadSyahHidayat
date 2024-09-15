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

'Menjalankan aplikasi TodoApp'
Mobile.startApplication(GlobalVariable.apkPath, true)

'Memastikan button skip tutorial muncul'
Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Page_Mobile/Page_tutorial/label_Skip'), 0)

'Memastikan label dari tutorial pertama muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_tutorial/label_tutor1'), 0)

'Melakukan screenshot tutorial pertama'
Mobile.takeScreenshot('Screenshot/Mobile/tutorial1.png', FailureHandling.STOP_ON_FAILURE)

'Melakukan swipe untuk melihat tutorial app berikutnya'
CustomKeywords.'mobileKeywordCustom.swipe_horizontal.swipeKananKeKiri'()

'Memastikan label dari tutorial kedua muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_tutorial/label_tutor2'), 0)

'Melakukan screenshot tutorial kedua'
Mobile.takeScreenshot('Screenshot/Mobile/tutorial2.png', FailureHandling.STOP_ON_FAILURE)

'Melakukan swipe untuk melihat tutorial app berikutnya'
CustomKeywords.'mobileKeywordCustom.swipe_horizontal.swipeKananKeKiri'()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

'Memastikan label dari tutorial ketiga muncul'
Mobile.waitForElementPresent(findTestObject('Mobile/Page_Mobile/Page_tutorial/label_tutor3'), 0)

'Melakukan screenshot tutorial ketiga'
Mobile.takeScreenshot('Screenshot/Mobile/tutorial3.png', FailureHandling.STOP_ON_FAILURE)

'Melakukan swipe untuk melihat tutorial app berikutnya'
CustomKeywords.'mobileKeywordCustom.swipe_horizontal.swipeKananKeKiri'()

'Memastikan button get started muncul'
Mobile.waitForElementPresent(findTestObject('Mobile/Page_Mobile/Page_tutorial/button_getStarted'), 0)

'Melakukan screenshot tutorial keempat get started'
Mobile.takeScreenshot('Screenshot/Mobile/tutorial4GetStarted.png', FailureHandling.STOP_ON_FAILURE)

'Melakukan tap pada button get started'
Mobile.tap(findTestObject('Mobile/Page_Mobile/Page_tutorial/button_getStarted'), 0)

'Memastikan button get started muncul'
Mobile.verifyElementExist(findTestObject('Mobile/Page_Mobile/Page_Todo/label_headerTodo'), 0)

'Melakukan screenshot layar todo'
Mobile.takeScreenshot('Screenshot/Mobile/layarToDo.png', FailureHandling.STOP_ON_FAILURE)

