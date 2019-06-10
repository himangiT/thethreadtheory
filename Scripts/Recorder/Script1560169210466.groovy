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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://18.138.12.239/')

WebUI.click(findTestObject('Page_Welcome to The Thread Theory  The Thread Theory/span_Start shopping now _login-icon'))

WebUI.click(findTestObject('Page_Welcome to The Thread Theory  The Thread Theory/div_zoo-logo-newsletter                         background-image url(http1813812239pubmediawysiwygcleversoftnewsletter2jpg)                        background-repeat no-repeat                        height 100            '))

WebUI.click(findTestObject('Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.click(findTestObject('Page_Welcome to The Thread Theory  The Thread Theory/span_Start shopping now _login-icon'))

WebUI.click(findTestObject('Page_Welcome to The Thread Theory  The Thread Theory/a_Sign In'))

WebUI.setText(findTestObject('Page_Sign In/input_Sign In_loginusername'), 'himangi.tankha@ranosys.com')

WebUI.setEncryptedText(findTestObject('Page_Sign In/input_Sign In_loginpassword'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Page_Sign In/span_Sign In'))

WebUI.click(findTestObject('Page_My Account/span_GIFT CARD_counter qty empty cart-icon'))

WebUI.click(findTestObject('Page_Shopping Cart/td_Qty                                                                                            -                                                                                                                         '))

WebUI.click(findTestObject('Page_Shopping Cart/span_Check Out with Multiple Addresses'))

WebUI.selectOptionByValue(findTestObject('Page_Ship to Multiple Addresses - Magento Commerce/select_Miss Himangi Tankha Singapore Singapore  567890 SingaporeMiss Himangi Tankha Test America California 541278 United StatesMiss Himangi Tankha Test Singapore  567890 Singapore'), 
    '46', true)

WebUI.click(findTestObject('Page_Ship to Multiple Addresses - Magento Commerce/span_Update Qty  Addresses'))

WebUI.click(findTestObject('Page_Ship to Multiple Addresses - Magento Commerce/span_Go to Shipping Information'))

WebUI.click(findTestObject('Page_Shipping Methods - Magento Commerce/input_Shipping Method_shipping_method771'))

WebUI.click(findTestObject('Page_Shipping Methods - Magento Commerce/input_SGD 000_shipping_method772'))

WebUI.click(findTestObject('Page_Shipping Methods - Magento Commerce/span_Continue to Billing Information'))

WebUI.click(findTestObject('Page_Billing Information - Magento Commerce/input_Internet banking  PayNow_paymentmethod'))

WebUI.click(findTestObject('Page_Billing Information - Magento Commerce/span_Go to Review Your Order'))

WebUI.click(findTestObject('Page_Review Order - Magento Commerce/div_Mailing ListBe the first to hear about our new arrivals special offers and exclusive invites    Newsletter                                                                                                              '))

WebUI.click(findTestObject('Page_Review Order - Magento Commerce/div_About Us            Our Story     Contact Us              Careers                 Location    Customer Care            Order  Payment                 Shipping Info                 Return Policy                 Size G'))

WebUI.click(findTestObject('Page_Review Order - Magento Commerce/span_Back to Billing Information'))

