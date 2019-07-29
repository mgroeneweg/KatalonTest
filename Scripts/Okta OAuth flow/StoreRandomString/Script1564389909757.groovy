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
import net.bytebuddy.utility.RandomString

import com.kms.katalon.keyword.excel.ExcelKeywords

String fileName = GlobalVariable.ExcelWorkDataFileName

workbook = ExcelKeywords.getWorkbook(fileName)

// Must include the sheet name, so just include the first one. Function getSheetNames returns a String array.
sheet = ExcelKeywords.getExcelSheet(workbook, ExcelKeywords.getSheetNames(workbook)[0])

ExcelKeywords.setValueToCellByAddress(sheet, "B1", "State")
ExcelKeywords.setValueToCellByAddress(sheet, "B2", RandomString.make(20))

ExcelKeywords.saveWorkbook(fileName, workbook)


