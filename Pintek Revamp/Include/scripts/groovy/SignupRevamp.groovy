import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class SignupRevamp {

	@When("user click button Masuk")
	def click_btn_masuk() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Click Masuk"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click button Daftar")
	def click_btn_daftar() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek ProcessCase/Click Daftar1'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click on button Daftar")
	def click_on_daftar() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek ProcessCase/Click Daftar2'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user scroll down tnc page")
	def scroll_down_tnc() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek ProcessCase/Scrool TnC'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button Setuju dan Lanjutkan")
	def click_setuju_lanjutkan() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek ProcessCase/Click Setuju Lanjutkan'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user get otp code")
	def get_otp_code() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek CheckResult/OTP Verify'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button Verifikasi in phone verification page")
	def click_phone_verify() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek ProcessCase/Click Phone Verify'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user get email verify")
	def get_email_verify() {
		WebUI.callTestCase(findTestCase('Test Cases/Pintek CheckResult/Email Verify'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}