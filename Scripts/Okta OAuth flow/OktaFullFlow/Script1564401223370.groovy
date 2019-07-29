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

WebUI.navigateToUrl('https://www.oauth.com/playground/')

WebUI.click(findTestObject('Object Repository/Okta/a_register a client and a user'))

WebUI.click(findTestObject('Object Repository/Okta/a_Register'))

WebUI.click(findTestObject('Object Repository/Okta/clientID'))

WebUI.click(findTestObject('Object Repository/Okta/clientSecret'))

WebUI.click(findTestObject('Object Repository/Okta/loginName'))

WebUI.click(findTestObject('Object Repository/Okta/loginPassword'))

WebUI.click(findTestObject('Object Repository/Okta/a_Continue'))

WebUI.click(findTestObject('Object Repository/Okta/a_Authorization Code'))

WebUI.click(findTestObject('Object Repository/Okta/a_Authorize'))

WebUI.setText(findTestObject('Object Repository/Okta/input_Username'), 'arrogant-fly@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Okta/input_Password'), 'ympG0A3GcuQssj9pWoQc3MCufnDvICaJ5ths+6x0diM=')

WebUI.click(findTestObject('Object Repository/Okta/Submit'))

WebUI.click(findTestObject('Object Repository/Okta/state'))

WebUI.click(findTestObject('Object Repository/Okta/state'))

WebUI.click(findTestObject('Object Repository/Okta/a_It Matches Continue'))

WebUI.click(findTestObject('Object Repository/Okta/a_Go'))

WebUI.click(findTestObject('Object Repository/Okta/token'))

WebUI.closeBrowser()

