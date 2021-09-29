import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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



class CommonB2BApply {

	@And("user click option Akun Bisnis")
	def click_akun_bisnis() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Click Akun Bisnis"), [:], FailureHandling.CONTINUE_ON_FAILURE)
	}

	@And("user choose LPK")
	def choose_lpk() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose LPK"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose LKP")
	def choose_lkp() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose LKP"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user unregistered as LPK or LKP PT")
	def choose_unregistered_pt() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Unregistered PT"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user unregistered as LPK or LKP CV")
	def choose_unregistered_cv() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Unregistered CV"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user unregistered as LPK or LKP Koperasi")
	def choose_unregistered_koperasi() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Unregistered Koperasi"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user unregistered as LPK or LKP Yayasan")
	def choose_unregistered_yayasan() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Unregistered Yayasan"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose Sekolah for Company Entity")
	def choose_sekolah_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Sekolah Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose Perseorangan for Company Entity")
	def choose_perseorangan_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Perseorangan Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose LKP for Company Entity")
	def choose_lkp_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose LKP Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose PT for Company Entity")
	def choose_pt_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose PT Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose CV for Company Entity")
	def choose_cv_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose CV Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose Koperasi for Company Entity")
	def choose_koperasi_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Koperasi Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose Yayasan for Company Entity")
	def choose_yayasan_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Yayasan Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose LPK for Company Entity")
	def choose_lpk_entity() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose LPK Entity"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user choose industry type")
	def choose_industry_type() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Industry Type"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("user choose company address")
	def choose_company_address() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Choose Company Address"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("user click button Simpan to save section Company Information")
	def click_button_simpan() {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek ProcessCase/Click Simpan"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}