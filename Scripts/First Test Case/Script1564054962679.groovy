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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.KatalonDemoUrl)

WebUI.click(findTestObject('Katalon demo app/a_Make Appointment'))

WebUI.setText(findTestObject('Katalon demo app/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Katalon demo app/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Katalon demo app/button_Login'))

WebUI.selectOptionByValue(findTestObject('Katalon demo app/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Katalon demo app/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('Katalon demo app/span_Visit Date (Required)_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Katalon demo app/td_31'))

WebUI.setText(findTestObject('Katalon demo app/textarea_Comment_comment'), 'Test')

WebUI.click(findTestObject('Katalon demo app/button_Book Appointment'))

WebUI.closeBrowser()

