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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

String fileName = GlobalVariable.ExcelWorkDataFileName

sheet = ExcelKeywords.getExcelSheet(fileName)

String state = ExcelKeywords.getCellValueByAddress(sheet, 'B2')

println(state)

String url = (((((((GlobalVariable.OktaPreviewUrl + '?response_type=code') + '&client_id=') + GlobalVariable.OktaClientID) + 
'&redirect_uri=') + GlobalVariable.OktaRedirectUri) + '&scope=photo+offline_access') + '&state=') + state

println(url)

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.waitForElementPresent(findTestObject('Okta OAuth custom/RedirectState'), 0)

