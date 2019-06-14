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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser(toString())

WebUI.navigateToUrl('http://18.138.12.239/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/span_concat(Don  t show this popup again)_check'))

WebUI.click(findTestObject('Object Repository/add to cart/Page_Welcome to The Thread Theory  The Thread Theory/button_Close'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_SHOP'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Work Wear - DRESSES - SHOP/span_Work Wear'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Filter_Sort/Page_Work Wear - DRESSES - SHOP/img_Quick View_imgage-additional'), 5)

WebUI.mouseOver(findTestObject('Filter_Sort/Page_Work Wear - DRESSES - SHOP/img_Quick View_imgage-additional'))

WebUI.click(findTestObject('Filter_Sort/Page_Work Wear - DRESSES - SHOP/img_Quick View_imgage-additional'))

WebUI.delay(10)

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy) (1)/div_L'))

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_OS_cs-font clever-icon-plus'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Softly Edelweiss Swiss Dot Dress (Powder Blue)/button_Add to Cart'))

WebUI.click(findTestObject('add to cart/Page_Lana Lace Romper (Navy)/span_2                                        2                items'))

WebUI.delay(5)

WebUI.click(findTestObject('View Kart/Page_Lana Lace Romper (Navy)/span_View cart'))

WebUI.delay(10)

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/strong_Summary'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('add to cart/menu_cart_mini/Page_Shopping Cart/button_GO TO CHECKOUT'), 5)

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Shopping Cart/button_GO TO CHECKOUT'))

WebUI.delay(5)

WebUI.setText(findTestObject('GuestUser/Page_Shopping Cart/input_Email Address_username'), 'himangi.tankha+5@ranosys.com')

WebUI.setText(findTestObject('GuestUser/Page_Shopping Cart/input_Password_password'), 'password123')

WebUI.click(findTestObject('GuestUser/Page_Shopping Cart/button_Sign In'))

WebUI.delay(10)

WebUI.click(findTestObject('Checkout/Page_Shopping Cart/ul_GO TO CHECKOUT                                                    Check Out with Multiple Addresses'))

WebUI.click(findTestObject('add to cart/menu_cart_mini/Page_Shopping Cart/button_GO TO CHECKOUT'))

WebUI.delay(30)

WebUI.click(findTestObject('Checkout/Page_Checkout/input_Place Order_paymentmethod'))

WebUI.scrollToElement(findTestObject('Checkout/Page_Checkout/input_Carrier Title_ko_unique_4'), 0)

WebUI.delay(10)

WebUI.click(findTestObject('New Checkout/Page_Checkout/input_Self-collection_ko_unique_6'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('TandC/Page_Checkout/input_SGD 4300_agreement2'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('checkout place order/Page_Checkout/button_Place Order'))

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

WebUI.closeBrowser()

