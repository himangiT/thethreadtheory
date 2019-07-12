import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to website which will show alert'
WebUI.openBrowser('https://www.seleniumeasy.com/test/javascript-alert-box-demo.html')

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Katalon Studio/Page_Selenium Easy Demo - Automate All Scenarios/button_Click me'))

'Get text alert on the alert when it\'s shown'
alertText = WebUI.getAlertText()

WebUI.delay(5)

'Verify text alert is correct or not'
WebUI.verifyMatch(alertText, 'I am an alert box!', false)

WebUI.delay(5)

'Accept alert when the alert is shown'
WebUI.acceptAlert()

WebUI.delay(10)

'Close browser'
WebUI.closeBrowser()

