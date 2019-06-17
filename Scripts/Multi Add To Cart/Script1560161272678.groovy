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

WebUI.mouseOver(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_SHOP'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_Work Wear'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('add to cart/Page_DRESSES - SHOP/img_Quick View_imgage-additional'), 5)

WebUI.mouseOver(findTestObject('add to cart/Page_DRESSES - SHOP/img_Quick View_imgage-additional'))

WebUI.click(findTestObject('add to cart/Page_DRESSES - SHOP/img_Quick View_imgage-additional'))

WebUI.delay(10)

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy) (1)/div_L'))

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_OS_cs-font clever-icon-plus'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Softly Edelweiss Swiss Dot Dress (Powder Blue)/button_Add to Cart'))

WebUI.delay(8)

WebUI.click(findTestObject('add to cart/Page_Fall Of Sunflowers Dress (White)/span_2                                        2                items'))

WebUI.click(findTestObject('View Kart/Page_Lana Lace Romper (Navy)/span_View cart'))

WebUI.delay(5)

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/strong_Summary'))

WebUI.click(findTestObject('add to cart/Page_Shopping Cart/span_Check Out with Multiple Addresses'))

WebUI.delay(5)

WebUI.setText(findTestObject('OR_Login/Page_Sign In/input_Sign In_loginusername'), 'himangi.tankha@ranosys.com')

WebUI.setText(findTestObject('OR_Login/Page_Sign In/input_Sign In_loginpassword'), 'password123')

WebUI.click(findTestObject('OR_Login/Page_/button_Sign In'))

WebUI.delay(10)

WebUI.getNumberOfTotalOption(findTestObject('select_Miss Himangi Tankha Singapore Singapore 567890 SingaporeMiss Himangi Tankha Test America California 541278 United StatesMiss Himangi Tankha Test Singapore 567890 Singapore'))

WebUI.click(findTestObject('select_Miss Himangi Tankha Singapore Singapore 567890 SingaporeMiss Himangi Tankha Test America California 541278 United StatesMiss Himangi Tankha Test Singapore 567890 Singapore'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('select_Miss Himangi Tankha Singapore Singapore 567890 SingaporeMiss Himangi Tankha Test America California 541278 United StatesMiss Himangi Tankha Test Singapore 567890 Singapore'), 
    '46', false)

WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Ship to Multiple Addresses - Magento Commerce/button_Update Qty  Addresses'))

WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Ship to Multiple Addresses - Magento Commerce/button_Go to Shipping Information'))

WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/input_SGD 000_shipping_method710'))

WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/input_Shipping Method_shipping_method711'), 
    0)

WebUI.click(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/input_Shipping Method_shipping_method711'))

WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/button_Continue to Billing Information'), 
    0)

WebUI.click(findTestObject('MultipleCheckout/Page_Shipping Methods - Magento Commerce/button_Continue to Billing Information'))

WebUI.delay(5)

WebUI.click(findTestObject('MultipleCheckout/Page_Billing Information - Magento Commerce/input_Internet banking  PayNow_paymentmethod'))

WebUI.click(findTestObject('MultipleCheckout/Page_Billing Information - Magento Commerce/button_Go to Review Your Order'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('MultipleCheckout/Page_Review Order - Magento Commerce/button_Place Order'), 0)

WebUI.click(findTestObject('TandC/Page_Checkout/input_SGD 4300_agreement2'))

WebUI.click(findTestObject('MultipleCheckout/Page_Review Order - Magento Commerce/button_Place Order'))

WebUI.delay(10)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

WebUI.takeScreenshot('D:\\Katalon\\Demo\\screenshot_"+ todaysDate +"-" + nowTime +".PNG')

