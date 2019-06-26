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

WebUI.openBrowser(toString())

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://18.138.12.239/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://18.138.12.239/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.delay(10)

WebUI.click(findTestObject('gift card/Page_My Account/a_Give a Gift Card'))

WebUI.delay(5)

selenium.click('id=am_giftcard_amount')

selenium.select('id=am_giftcard_amount', 'label=SGD 15.00')

//selenium.click('id=am_giftcard_amount')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Choose card Image\'])[1]/following::img[1]')

WebUI.delay(5)

//selenium.click('id=am_giftcard_sender_name')

//selenium.click('id=am_giftcard_sender_email')

selenium.click('id=am_giftcard_recipient_name')

selenium.type('id=am_giftcard_recipient_name', 'Shubham')

WebUI.delay(5)

selenium.click('id=am_giftcard_recipient_email')

selenium.type('id=am_giftcard_recipient_email', 'shubham.khandelwal@ranosys.com')

WebUI.delay(5)

selenium.click('id=am_giftcard_date_delivery')

selenium.click('link=26')

WebUI.delay(5)

selenium.click('id=am_giftcard_message')

selenium.type('id=am_giftcard_message', 'test')

WebUI.delay(5)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Preview Gift Card\'])[1]/following::span[3]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No Result\'])[1]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SGD 15.00\'])[2]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Apply\'])[2]/following::strong[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SGD 165.00\'])[1]/following::button[1]')

selenium.click('id=checkmo')

selenium.click('id=agreement__1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Apply Reward\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Apply Reward\'])[1]/following::span[1]')

selenium.click('id=banktransfer')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Apply Reward\'])[1]/following::span[1]')

selenium.click('id=stripe_payments')

selenium.selectFrame('index=6')

selenium.click('id=katalon-spy_elementInfoDiv')

selenium.selectFrame('relative=parent')

selenium.click('name=__privateStripeFrame35')

selenium.selectFrame('index=6')

selenium.type('name=cardnumber', '4111 1111 1111 1111')

selenium.selectFrame('relative=parent')

selenium.click('name=__privateStripeFrame36')

selenium.selectFrame('index=7')

selenium.type('name=exp-date', '02 / 21')

selenium.selectFrame('relative=parent')

selenium.selectFrame('index=8')

selenium.click('id=katalon-spy_elementInfoDiv')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe-payments-card-cvc')

selenium.click('name=__privateStripeFrame37')

selenium.selectFrame('index=8')

selenium.type('name=cvc', '123')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe_payments_cc_save')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Apply Reward\'])[1]/following::button[1]')

