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

//WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://18.138.12.239/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Softly Edelweiss Swiss Dot Dress (Powder Blue)/span_1                                        1                items'))

WebUI.delay(5)

WebUI.click(findTestObject('View Kart/Page_Lana Lace Romper (Navy)/span_View cart'))

WebUI.delay(10)

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/strong_Summary'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('add to cart/menu_cart_mini/Page_Shopping Cart/button_GO TO CHECKOUT'), 5)

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Shopping Cart/button_GO TO CHECKOUT'))

WebUI.delay(5)

WebUI.setText(findTestObject('GuestUser/Page_Shopping Cart/input_Email Address_username'), 'himangi.tankha@ranosys.com')

WebUI.setText(findTestObject('GuestUser/Page_Shopping Cart/input_Password_password'), 'password123')

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/button_Sign In'))

WebUI.delay(10)

WebUI.click(findTestObject('Checkout/Page_Shopping Cart/ul_GO TO CHECKOUT                                                    Check Out with Multiple Addresses'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Shopping Cart/button_GO TO CHECKOUT'))

WebUI.delay(30)

/*selenium.click('id=stripe_payments')

selenium.click('id=stripe-payments-card-number')

selenium.selectFrame('index=5')

selenium.type('name=cardnumber', '4111 1111 1111 1111')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe-payments-card-expiry')

selenium.selectFrame('index=6')

selenium.type('name=exp-date', '02 / 21')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe-payments-card-cvc')

selenium.selectFrame('index=7')

selenium.type('name=cvc', '123')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe_payments_cc_save')

selenium.click('id=agreement__1')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Gift Card\'])[1]/following::button[1]')

*/
WebUI.click(findTestObject('Checkout/Page_Checkout/input_Place Order_paymentmethod'))

not_run: WebUI.scrollToElement(findTestObject('Checkout/Page_Checkout/input_Carrier Title_ko_unique_4'), 0)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('New Checkout/Page_Checkout/input_Self-collection_ko_unique_6'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('TandC/Page_Checkout/input_SGD 4300_agreement2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('new place order/Page_Checkout/button_Place Order'), FailureHandling.OPTIONAL)

WebUI.delay(10)

not_run: String todaysDate = today.format('MM_dd_yy')

not_run: String nowTime = today.format('hh_mm_ss')

not_run: WebUI.takeScreenshot('C:\\Users\\Ranosys\\git\\thethreadtheory\\screenshot_"+ todaysDate +"-" + nowTime +".PNG')

not_run: Date today = new Date()

WebUI.takeScreenshot('C:\\Users\\Ranosys\\git\\thethreadtheory\\screenshot.png', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Success Page/button_Continue Shopping'), 0)

WebUI.click(findTestObject('MultipleCheckout/Page_Success Page/button_Continue Shopping'))

WebUI.delay(10)

