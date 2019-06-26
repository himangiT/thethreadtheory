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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://18.138.12.239/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://18.138.12.239/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)
//WebUI.openBrowser(toString())

//WebUI.navigateToUrl('http://18.138.12.239/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_SHOP'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_Work Wear'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('add to cart/Page_DRESSES - SHOP/img_Quick View_imgage-additional'), 5)

WebUI.mouseOver(findTestObject('add to cart/Page_DRESSES - SHOP/img_Quick View_imgage-additional'))

WebUI.clickOffset(findTestObject('add to cart/Page_DRESSES - SHOP/img_Quick View_imgage-additional'), 650, 400)

WebUI.delay(10)

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy) (1)/div_L'))

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_OS_cs-font clever-icon-plus'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Softly Edelweiss Swiss Dot Dress (Powder Blue)/button_Add to Cart'))

WebUI.delay(8)

WebUI.click(findTestObject('add to cart/Page_Fall Of Sunflowers Dress (White)/span_2                                        2                items'))

WebUI.click(findTestObject('View Kart/Page_Lana Lace Romper (Navy)/span_View cart'))

WebUI.delay(8)

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/strong_Summary'))

WebUI.click(findTestObject('add to cart/Page_Shopping Cart/span_Check Out with Multiple Addresses'))

WebUI.delay(5)

WebUI.setText(findTestObject('OR_Login/Page_Sign In/input_Sign In_loginusername'), 'himangi.tankha@ranosys.com')

WebUI.setText(findTestObject('OR_Login/Page_Sign In/input_Sign In_loginpassword'), 'password123')

WebUI.click(findTestObject('OR_Login/Page_/button_Sign In'))

WebUI.delay(5)

selenium.click('id="ship_1_963_address"')

selenium.select('id="ship_1_963_address"', 'label=Miss Himangi Tankha, Test, Singapore, 567890, Singapore')

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('Page_Ship to Multiple Addresses - Magento Commerce/select_Multiple_address'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Ship to Multiple Addresses - Magento Commerce/select_Multiple_address_option'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Ship to Multiple Addresses - Magento Commerce/button_Update Qty  Addresses'))

WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Ship to Multiple Addresses - Magento Commerce/button_Go to Shipping Information'))

WebUI.delay(5)

selenium.click('id=s_method_1356_freeshipping_freeshipping')

selenium.click('id=s_method_1357_flaterateshipping_flaterateshipping')

not_run: WebUI.click(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/input_SGD 000_shipping_method710'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/input_Shipping Method_shipping_method711'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/input_Shipping Method_shipping_method711'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/button_Continue to Billing Information'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/button_Continue to Billing Information'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Billing Information - Magento Commerce/input_PayNow Method_paymentmethod'))

WebUI.click(findTestObject('MultipleCheckout/Page_Billing Information - Magento Commerce/button_Go to Review Your Order'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Review Order - Magento Commerce/button_Place Order'), 0)

WebUI.click(findTestObject('TandC/Page_Checkout/input_SGD 4300_agreement2'))

WebUI.click(findTestObject('MultipleCheckout/Page_Review Order - Magento Commerce/button_Place Order'))

WebUI.delay(10)

not_run: Date today = new Date()

not_run: String todaysDate = today.format('MM_dd_yy')

not_run: String nowTime = today.format('hh_mm_ss')

WebUI.takeScreenshot('thethreadtheory/screenshot.png')

WebUI.click(findTestObject('MultipleCheckout/Page_Success Page/button_Continue Shopping'))

WebUI.delay(5)

