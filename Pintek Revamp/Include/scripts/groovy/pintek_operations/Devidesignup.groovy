package pintek_operations
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

class SignupSteps {

	/*@When('I click button Masuk')
	 def I_click_button_masuk() {
	 WebUI.click(findTestObject('Object Repository/Pintek Object/HomePage_Login/button_Masuk'))
	 }*/

	//Obsolete step
	@And('user inputs sign up field with name (.*) phone (.*) email (.*) password (.*) retype_password (.*)')
	def user_signup(String name, String phone, String email, String password, String retype_password) {
		WebUI.callTestCase(findTestCase("Test Cases/Pintek CommonCase/Signup Web"), [ ('name') : name, ('phone') : phone, ('email') : email, ('password') : password, ('retype_password') : retype_password ], FailureHandling.STOP_ON_FAILURE)
	}

	/*@And("I click the login button")
	 def I_Click_login_button() {
	 WebUI.click(findTestObject('Object Repository/Pintek Object/HomePage_Login/submit_Masuk'))
	 }*/

}