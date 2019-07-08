package customKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver as WDriver
import com.kms.katalon.core.webui.driver.DriverFactory

class executexpath {
	/**
	 * Execute/evaluate xpath
	 * @param String or testObject
	 * @param RESULT_TYPE: [NUMBER_TYPE|STRING_TYPE|BOOLEAN_TYPE]
	 * @return result from xpath
	 */

	@Keyword
	def exexpath(String xpth, String RESULT_TYPE) {
		def resultTypes = ['NUMBER_TYPE': 'numberValue','STRING_TYPE': 'stringValue', 'BOOLEAN_TYPE': 'booleanValue']
		WDriver wd = DriverFactory.getWebDriver()
		try{
			String execCmd = 'return (document.evaluate(\''+xpth+'\', document, null, XPathResult.ANY_TYPE, null)).'+resultTypes[RESULT_TYPE]+';'
			return ((JavascriptExecutor) wd).executeScript(execCmd,[xpth])
		} catch (Exception e){
			println e
			return null
		}
	}
}