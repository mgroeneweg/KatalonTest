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

WebUI.waitForElementVisible(findTestObject('Okta/a_It Matches Continue'), 120)


// Split the URL, note that the parameters do not need to be decoded in any way.
String url = WebUI.getUrl()

String stateFromRedirect = null
String codeFromRedirect = null

String query = new URL(url).query
String[] queryArray = query.split('&')
for (int i = 0 ; i < queryArray.length; i++) {
	String[] parameterArray = queryArray[i].split('=')
	String key = parameterArray[0].toLowerCase()
	String value = parameterArray[1]
	switch (key) {
		case 'code':
			codeFromRedirect = value
			break;
		case 'state':
			stateFromRedirect = value
			break;
	}
}


String fileName = GlobalVariable.ExcelWorkDataFileName

workbook = ExcelKeywords.getWorkbook(fileName)

// Must include the sheet name, so just include the first one. Function getSheetNames returns a String array.
sheet = ExcelKeywords.getExcelSheet(workbook, ExcelKeywords.getSheetNames(workbook)[0])

String storedState = ExcelKeywords.getCellValueByAddress(sheet, "A2")

assert storedState == stateFromRedirect


WebUI.click(findTestObject('Object Repository/Okta/a_It Matches Continue'))

WebUI.click(findTestObject('Object Repository/Okta/a_Go'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Okta/token'), 120)

ExcelKeywords.setValueToCellByAddress(sheet, "F1", "Token")
ExcelKeywords.setValueToCellByAddress(sheet, "F2", WebUI.getText(findTestObject('Object Repository/Okta/token')))

WebUI.closeBrowser()

