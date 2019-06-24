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
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('http://18.138.12.239/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://18.138.12.239/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

//selenium.open('http://18.138.12.239/')

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.delay(5)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Subscribe\'])[1]/following::span[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Close\'])[1]/following::button[1]')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Registration/Page_Welcome to The Thread Theory  The Thread Theory/span_Start shopping now _login-icon'))

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start shopping now !\'])[1]/following::span[1]')

selenium.click('link=Create Account')

selenium.click('id=prefix')

selenium.select('id=prefix', 'label=Mrs.')

WebUI.delay(5)

//selenium.click('id=prefix')

selenium.click('id=firstname')

selenium.type('id=firstname', 'Himangi')

WebUI.delay(5)

selenium.click('id=lastname')

selenium.type('id=lastname', 'Tankha')

WebUI.delay(5)

selenium.click('id=email_address')

selenium.type('id=email_address', 'himangi.tankha+2@ransys.com')

WebUI.delay(5)

selenium.click('id=dob')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::select[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Next\'])[1]/following::select[2]')

selenium.click('link=21')

WebUI.delay(5)

selenium.click('id=street_1')

selenium.type('id=street_1', 'test')

WebUI.delay(5)

selenium.click('id=street_3')

selenium.type('id=street_3', 'test123')

WebUI.delay(5)

selenium.click('id=country')

selenium.click('id=country')

selenium.click('id=region')

selenium.type('id=region', 'Singapore')

WebUI.delay(5)

selenium.click('id=city')

selenium.type('id=city', 'Singapore')

WebUI.delay(5)

selenium.click('id=zip')

selenium.type('id=zip', '564789')

WebUI.delay(5)

selenium.click('id=telephone')

selenium.type('id=telephone', '1245789630')

WebUI.delay(5)

selenium.click('id=password')

selenium.type('id=password', 'password123')

WebUI.delay(5)

selenium.click('id=password-confirmation')

selenium.type('id=password-confirmation', 'password123')

WebUI.delay(5)

selenium.click('name=terms-condition')

WebUI.delay(5)

selenium.click('id=zoo-main-content')

not_run: selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Phone\'])[1]/following::span[2]')

WebUI.click(findTestObject('Registration/Page_Create New Customer Account/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

