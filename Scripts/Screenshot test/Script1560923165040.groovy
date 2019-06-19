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

WebUI.openBrowser(toString())

WebUI.navigateToUrl('http://18.138.12.239/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.delay(10)

not_run: Date today = new Date()

not_run: String todaysDate = today.format('MM_dd_yy')

not_run: String nowTime = today.format('hh_mm_ss')

try {
    Date data = new Date(System.currentTimeMillis())

    CustomKeywords.'uploadfile.uploadFile'(findTestObject(null), '')

    //SimpleDateFormat formatter = new SimpleDateFormat('yyyyMMddHHmmss')
    WebUI.takeScreenshot(('thethreadtheory/screenshot_' + formatarDate.format(data)) + '.png')
}
catch (Exception e) {
    e.printStackTrace()
} 

not_run: WebUI.takeScreenshot('thethreadtheory/screenshot_"+ todaysDate +"-" + nowTime +".png')

not_run: WebUI.click(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_Start shopping now _login-icon'))

not_run: WebUI.click(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/a_Sign In'))

not_run: WebUI.setText(findTestObject('Object Repository/add to cart/Page_Sign In/input_Sign In_loginusername'), 'himangi.tankha@ranosys.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/add to cart/Page_Sign In/input_Sign In_loginpassword'), 
    '8SQVv/p9jVTHLrggi8kCzw==')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/add to cart/Page_Sign In/button_Sign In'))

WebUI.closeBrowser()

