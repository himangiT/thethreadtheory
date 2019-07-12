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


'Open browser and navigate to website katalon.com'
WebUI.openBrowser('https://www.katalon.com/')

WebUI.delay(5)

'Click on Documentation to open another window'
WebUI.click(findTestObject('Page_Katalon Studio/Page_Katalon Studio Simplify API Web Mobile Automation Tests/a_Docs'))

'Switch to Documentation window'
WebUI.switchToWindowTitle('Home | Katalon Docs')

WebUI.delay(5)

'Get index of Documentation window'
index = WebUI.getWindowIndex()

WebUI.delay(5)

'Close browser'
WebUI.closeBrowser()