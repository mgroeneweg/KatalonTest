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

import com.kms.katalon.keyword.excel.ExcelKeywords

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.oauth.com/playground/')

WebUI.click(findTestObject('Object Repository/Okta/a_register a client and a user'))

WebUI.click(findTestObject('Object Repository/Okta/a_Register'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Okta/a_Continue'), 1000)

WebUI.delay(1);

String fileName = GlobalVariable.ExcelWorkDataFileName

workbook = ExcelKeywords.getWorkbook(fileName)

// Must include the sheet name, so just include the first one. Function getSheetNames returns a String array.
sheet = ExcelKeywords.getExcelSheet(workbook, ExcelKeywords.getSheetNames(workbook)[0])

ExcelKeywords.setValueToCellByAddress(sheet, "B1", "Client ID")
ExcelKeywords.setValueToCellByAddress(sheet, "B2", WebUI.getText(findTestObject('Object Repository/Okta/clientID')))

ExcelKeywords.setValueToCellByAddress(sheet, "C1", "Client secret")
ExcelKeywords.setValueToCellByAddress(sheet, "C2", WebUI.getText(findTestObject('Object Repository/Okta/clientSecret')))

ExcelKeywords.setValueToCellByAddress(sheet, "D1", "Login")
ExcelKeywords.setValueToCellByAddress(sheet, "D2", WebUI.getText(findTestObject('Object Repository/Okta/loginName')))

ExcelKeywords.setValueToCellByAddress(sheet, "E1", "Password")
ExcelKeywords.setValueToCellByAddress(sheet, "E2", WebUI.getText(findTestObject('Object Repository/Okta/loginPassword')))

ExcelKeywords.saveWorkbook(fileName, workbook)


WebUI.click(findTestObject('Object Repository/Okta/a_Continue'))
