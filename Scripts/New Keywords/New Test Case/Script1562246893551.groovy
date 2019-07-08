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

/*WebUI.openBrowser(toString())

WebUI.delay(2)

WebUI.authenticate('http://the-internet.herokuapp.com/basic_auth', 'admin', 'admin', 12)

WebUI.delay(10)

WebUI.closeBrowser()*/

/* 'Open browser and navigate to website which will show alert'
WebUI.openBrowser(GlobalVariable.G_SiteURL)

'Get text alert on the alert when it\'s shown'
alertText = WebUI.getAlertText()

'Verify text alert is correct or not'
WebUI.verifyMatch(alertText, 'This is an alert', false)

'Accept alert when the alert is shown'
WebUI.acceptAlert()

WebUI.delay(10)

'Close browser'
WebUI.closeBrowser()*/

'Open browser and navigate to login form'
WebUI.openBrowser(GlobalVariable.G_SiteURL)

'Input username'
WebUI.setText(findTestObject('txt_UserName'), Username)

'Input password'
WebUI.setText(findTestObject('txt_Password'), Password)

'Submit form'
WebUI.submit(findTestObject('frm_Login'))

'Close browser'
WebUI.closeBrowser()

