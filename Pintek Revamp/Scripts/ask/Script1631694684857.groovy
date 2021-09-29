import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.enhancedClick(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Jabatan'))

WebUI.setText(findTestObject('Pintek Revamp/B2C Apply/input_Jenis Berkas jpg, jpeg, pdf, png (max. 25mb)_InfoPerusahaan_AppointmentPosisionNumber'), 
    letternum.toString())

WebUI.scrollToPosition(500, 500)

WebUI.enhancedClick(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Izin'))

WebUI.delay(3)

WebUI.uploadFileWithDragAndDrop(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Izin'), parentpath_image + '/Plugins/PDF/file001.pdf')

WebUI.scrollToPosition(500, 500)

WebUI.enhancedClick(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Domisili'))

WebUI.delay(3)

WebUI.uploadFileWithDragAndDrop(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Domisili'), parentpath_image + 
    '/Plugins/PDF/file001.pdf')

WebUI.scrollToPosition(500, 500)

WebUI.enhancedClick(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Pendirian'))

WebUI.delay(3)

WebUI.uploadFileWithDragAndDrop(findTestObject('Pintek Revamp/B2C Apply/div_Unggah Berkas Pendirian'), parentpath_image + 
    '/Plugins/PDF/file001.pdf')

