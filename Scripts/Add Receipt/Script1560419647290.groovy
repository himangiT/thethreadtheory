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

WebUI.click(findTestObject('Add Receipt/Page_Welcome to The Thread Theory  The Thread Theory/span_Start shopping now _login-b-icon'))

WebUI.click(findTestObject('Add Receipt/Page_Welcome to The Thread Theory  The Thread Theory/li_My Orders'))

WebUI.delay(5)

WebUI.click(findTestObject('Add Receipt/Page_My Orders/span_View Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Add Receipt/Page_Order  000000052/span_Add Receipt'))

WebUI.delay(5)

WebUI.click(findTestObject('Add Receipt/Page_Payment Receipt/input__tran_datetime'))

WebUI.click(findTestObject('Add Receipt/Page_Payment Receipt/a_date'))

WebUI.click(findTestObject('Add Receipt/Page_Payment Receipt/button_Done'))

WebUI.setText(findTestObject('Add Receipt/Page_Payment Receipt/input__reference_no'), '254178')

WebUI.setText(findTestObject('Add Receipt/Page_Payment Receipt/input__initials'), 'Himangi')

WebUI.setText(findTestObject('Add Receipt/Page_Payment Receipt/input__amount'), '68')

WebUI.setText(findTestObject('Add Receipt/Page_Payment Receipt/input__bank_name'), 'DBS Bank')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Add Receipt/Page_Payment Receipt/input_Upload Receipt_receipt'), 'C:\\Users\\Ranosys\\Downloads\\ATM Receipt.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('Add Receipt/Page_Payment Receipt/button_Submit'))

WebUI.delay(10)

WebUI.acceptAlert()

