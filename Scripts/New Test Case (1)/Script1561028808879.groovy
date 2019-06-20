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

WebUI.openBrowser('https://www.katalon.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.katalon.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://18.138.12.239/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.delay(5)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start shopping now !\'])[1]/following::span[1]')

selenium.click('link=Create Account')

selenium.click('id=prefix')

selenium.select('id=prefix', 'label=Miss')

selenium.click('id=prefix')

selenium.click('id=password')

selenium.type('id=password', 'password123')

selenium.click('id=password-confirmation')

selenium.type('id=password-confirmation', 'password123')

//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start shopping now !\'])[1]/following::span[1]')
//selenium.click('link=Logout')
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start shopping now !\'])[1]/following::span[1]')
//selenium.click('link=Create Account')
selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Start shopping now !\'])[1]/following::span[1]')

selenium.click('link=Sign In')

selenium.click('id=email')

selenium.type('id=email', 'himangi.tankha@ranosys.com')

selenium.click('id=pass')

selenium.type('id=pass', 'password123')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Note\'])[1]/following::span[1]')

WebUI.mouseOver(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_SHOP'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'DRESSES\'])[2]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Quick View\'])[5]/following::img[2]')

selenium.click('id=option-label-size-139-item-5')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XL\'])[1]/following::span[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'XL\'])[1]/following::span[3]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'No Result\'])[1]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SGD 98.00\'])[1]/following::a[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SGD 98.00\'])[2]/following::span[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'SGD 49.00\'])[1]/following::td[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CHECK GIFT CARD STATUS\'])[1]/following::div[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'GO TO CHECKOUT\'])[1]/following::span[1]')

selenium.click('id=ship_1_841_address')

selenium.select('id=ship_1_841_address', 'label=Miss Himangi Tankha, Test, Singapore, 567890, Singapore')

selenium.click('id=ship_1_841_address')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Send To\'])[3]/following::span[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Update Qty & Addresses\'])[1]/following::span[1]')

selenium.click('id=s_method_1356_freeshipping_freeshipping')

selenium.click('id=s_method_1357_flaterateshipping_flaterateshipping')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'S\'])[3]/following::button[1]')

selenium.click('id=p_method_banktransfer')

selenium.click('id=p_method_checkmo')

selenium.click('id=p_method_stripe_payments')

selenium.selectFrame('index=6')

selenium.click('id=katalon-spy_elementInfoDiv')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe-payments-card-number')

selenium.selectFrame('index=6')

selenium.type('name=cardnumber', '4111 1111 1111 1111')

selenium.selectFrame('relative=parent')

selenium.selectFrame('index=7')

selenium.click('id=katalon-spy_elementInfoDiv')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe-payments-card-expiry')

selenium.selectFrame('index=7')

selenium.type('name=exp-date', '02 / 21')

selenium.selectFrame('relative=parent')

selenium.click('id=stripe-payments-card-cvc')

selenium.selectFrame('index=8')

selenium.type('name=cvc', '123')

selenium.selectFrame('relative=parent')

selenium.click('id=p_method_banktransfer')

selenium.click('id=payment-continue')

selenium.click('id=agreement-1')

selenium.click('id=review-button')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Ship to:\'])[2]/following::button[1]')

