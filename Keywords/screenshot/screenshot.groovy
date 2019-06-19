package screenshot

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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class screenshot{
	public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");

	public static Date fromString(String source, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(source);
	}

	public static Date parseDateTime(String dateStr) {
		try {
			return DATE_TIME_FORMAT.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
	}

	public static Date parseDate(String dateStr) {
		try {
			return DATE_FORMAT.parse(dateStr);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String formatDateTime(Date date) {
		if (date == null) {
			return "";
		} else {
			return DATE_TIME_FORMAT.format(date);
		}
	}

	public static String formatDate(Date date) {
		if (date == null) {
			return "";
		} else {
			return DATE_FORMAT.format(date);
		}
	}
}