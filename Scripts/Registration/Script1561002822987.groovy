import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.slf4j.Logger as Logger
import org.openqa.selenium.support.ui.ExpectedConditions

WebUI.openBrowser(toString())

WebUI.navigateToUrl('http://18.138.12.239/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Registration/Page_Welcome to The Thread Theory  The Thread Theory/span_Start shopping now _login-icon'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Welcome to The Thread Theory  The Thread Theory/a_Create Account'))

WebUI.delay(5)

selenium.click('id=prefix')

selenium.select('id=prefix', 'label=Miss')

not_run: WebUI.selectAllOption(findTestObject('Registration/Page_Create New Customer Account/select_Mr                                                                                                                Ms'))

not_run: WebUI.deselectAllOption(findTestObject('Registration/Page_Create New Customer Account/select_Mr                                                                                                                Ms'))

not_run: WebUI.delay(5)

not_run: WebUI.selectOptionByValue(findTestObject('Page_Create New Customer Account/select_Mr                                                                                                                Ms'), 
    'Mr.', true)

WebUI.delay(5)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_First Name_firstname'), 'Himangi', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_Last Name_lastname'), 'Tankha', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_Email_email'), 'himangi.tankha+2@ranosys.com', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_Address Line 1_street'), 'Tai Seng ', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_Address Line 2_street'), 'Link', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_City  District_city'), 'Singapore', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_Postal Code_postcode'), '456789', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('register/Page_Create New Customer Account/input_Phone_telephone'), '5214782514', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('Registration/Page_Create New Customer Account/legend_Sign-in Information'), 5, FailureHandling.STOP_ON_FAILURE)

selenium.click('id=password')

selenium.type('id=password', 'password123')

WebUI.delay(10)

selenium.click('id=password-confirmation')

selenium.type('id=password-confirmation', 'password123')

WebUI.delay(10)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Note\'])[1]/following::span[1]')

not_run: WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Password_password'), '8SQVv/p9jVTHLrggi8kCzw==', 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setEncryptedText(findTestObject('Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    '8SQVv/p9jVTHLrggi8kCzw==', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Create New Customer Account/input_Phone_terms-condition'), FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start shopping now !\'])[1]/following::span[1]')

WebUI.scrollToElement(findTestObject('Registration/Page_Create New Customer Account/button_Sign Up'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Registration/Page_Create New Customer Account/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

