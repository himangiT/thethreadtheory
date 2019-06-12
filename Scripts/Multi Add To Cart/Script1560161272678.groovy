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

WebUI.mouseOver(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_SHOP'))

WebUI.click(findTestObject('Mega Menu/Page_Work Wear - DRESSES - SHOP/span_Work Wear'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('add to cart/PCP/Page_Work Wear - DRESSES - SHOP/a_Lana Lace Romper (Navy)'), 5)

not_run: WebUI.mouseOver(findTestObject('Filter_Sort/Page_Work Wear - DRESSES - SHOP/img_Quick View_imgage-additional'))

WebUI.click(findTestObject('add to cart/PCP/Page_Work Wear - DRESSES - SHOP/a_Lana Lace Romper (Navy)'))

WebUI.delay(10)

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy) (1)/div_L'))

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_OS_cs-font clever-icon-plus'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Softly Edelweiss Swiss Dot Dress (Powder Blue)/button_Add to Cart'))

not_run: WebUI.scrollToElement(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/a_Ripple Riddle Pants New (Navy)'), 
    0)

not_run: WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_Add to Cart'))

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('add to cart/Page_Ripple Riddle Pants New (Navy)/div_L'))

not_run: WebUI.click(findTestObject('add to cart/Page_Ripple Riddle Pants New (Navy)/button_Add to Cart'))

WebUI.delay(5)

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_2                                        2                items'))

WebUI.click(findTestObject('View Kart/Page_Lana Lace Romper (Navy)/span_View cart'))

WebUI.delay(5)

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/strong_Summary'))

WebUI.click(findTestObject('add to cart/Page_Shopping Cart/span_Check Out with Multiple Addresses'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('select_Miss Himangi Tankha Singapore Singapore 567890 SingaporeMiss Himangi Tankha Test America California 541278 United StatesMiss Himangi Tankha Test Singapore 567890 Singapore'))

WebUI.selectOptionByValue(findTestObject('select_Miss Himangi Tankha Singapore Singapore 567890 SingaporeMiss Himangi Tankha Test America California 541278 United StatesMiss Himangi Tankha Test Singapore 567890 Singapore'), 
    '46', true)

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

WebUI.click(findTestObject('MultipleCheckout/Page_Review Order - Magento Commerce/button_Place Order'))

WebUI.delay(10)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

WebUI.takeScreenshot('D:\\Katalon\\Demo\\screenshot.png')

