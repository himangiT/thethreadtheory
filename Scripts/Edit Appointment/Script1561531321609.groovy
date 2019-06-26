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
import com.thoughtworks.selenium.SeleniumException as SeleniumException

WebUI.openBrowser(toString())

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://18.138.12.239/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://18.138.12.239/')

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.delay(5)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Subscribe\'])[1]/following::span[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Close\'])[1]/following::button[1]')

WebUI.delay(5)

selenium.click('link=Book Appointment')

WebUI.delay(5)

selenium.click('id=email')

selenium.type('id=email', 'himangi.tankha+9@ranosys.com')

selenium.click('id=pass')

selenium.type('id=pass', 'password123')

selenium.click('id=send2')

WebUI.delay(5)

//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'My Appointments\'])[2]/following::div[5]')
//selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Checkout\'])[1]/following::span[1]')
selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Active\'])[1]/following::span[1]')

WebUI.delay(8)

selenium.click('id=appointment_date')

selenium.click('link=29')

WebUI.delay(5)

selenium.click('id=appointment_time')

selenium.select('id=appointment_time', 'label=4PM-5PM')

selenium.click('id=appointment_time')

WebUI.delay(5)

selenium.click('id=design')

selenium.type('id=design', 'test')

WebUI.delay(5)

selenium.click('id=looking_item')

selenium.select('id=looking_item', 'label=ROM')

WebUI.delay(5)

//selenium.click("id=looking_item")
selenium.click('id=attendees')

selenium.select('id=attendees', 'label=2')

WebUI.delay(5)

//selenium.click("id=attendees")
selenium.click('id=wedding_theme')

selenium.type('id=wedding_theme', 'test')

WebUI.delay(5)

selenium.click('id=color_theme')

selenium.type('id=color_theme', 'blue')

WebUI.delay(5)

selenium.click('id=rom_wedding_date')

selenium.click('link=31')

WebUI.delay(5)

selenium.click('id=comments')

selenium.type('id=comments', 'test')

WebUI.delay(5)

WebUI.click(findTestObject('Appointment/Page_Book Appointment/button_Submit'))

