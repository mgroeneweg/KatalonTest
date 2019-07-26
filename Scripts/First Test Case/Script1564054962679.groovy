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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('First test case/a_Make Appointment'))

WebUI.setText(findTestObject('First test case/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('First test case/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('First test case/button_Login'))

WebUI.selectOptionByValue(findTestObject('First test case/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('First test case/input_Apply for hospital readmission_hospital_readmission'))

WebUI.click(findTestObject('First test case/span_Visit Date (Required)_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('First test case/td_31'))

WebUI.setText(findTestObject('First test case/textarea_Comment_comment'), 'Test')

WebUI.click(findTestObject('First test case/button_Book Appointment'))

WebUI.closeBrowser()

