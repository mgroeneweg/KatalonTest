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

WebUI.setText(findTestObject('Katalon demo app/input_Username_username'), username)

WebUI.setText(findTestObject('Katalon demo app/input_Password_password'), password)

WebUI.click(findTestObject('Katalon demo app/button_Login'))

try {
    WebUI.verifyElementPresent(findTestObject('Katalon demo app/h2_Make Appointment'), 2)

    assert expectSuccess == "true"
}
catch (Exception e) {
    assert expectSuccess == "false"
} 

WebUI.closeBrowser()

